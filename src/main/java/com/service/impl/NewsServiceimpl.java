package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.NewsMapper;
import com.dao.UsersMapper;
import com.domian.News;
import com.domian.Users;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.NewsService;
import com.util.Dto;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class NewsServiceimpl implements NewsService{
@Autowired
private NewsMapper impl;

@Override
public PageInfo<News> selectlist(Dto dto) {
	 PageHelper.startPage(dto.getPage(),dto.getPagesize());
     List<News> list=impl.selectAll();
     PageInfo<News> pageInfo=new PageInfo<News>(list);
	return pageInfo;
}

@Override
public News selectbyid(int id) {
	// TODO Auto-generated method stub
	return impl.selectByPrimaryKey(id);
}

@Override
public int deletenews(int id) {
	return impl.deleteByPrimaryKey(id);
}

@Override
public int insernews(News news) {
	// TODO Auto-generated method stub
	return impl.insertSelective(news);
}

@Override
public int updatenews(News news) {
	// TODO Auto-generated method stub
	return impl.updateByPrimaryKeySelective(news);
}

@Override
public List<News> selectlist() {
	// TODO Auto-generated method stub
	return impl.selectAll();
}


	
}
