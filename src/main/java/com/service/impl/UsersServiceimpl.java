package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UsersMapper;
import com.domian.News;
import com.domian.Users;
import com.service.UsersService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class UsersServiceimpl implements UsersService{
	@Autowired
	private UsersMapper impl;

	@Override
	public Users denluusers(String name, String pwss) {
		Example example=new Example(Users.class);
		Criteria criteria=example.createCriteria();
		criteria.andEqualTo("uname",name);
		criteria.andEqualTo("upwd",pwss);
		return impl.selectOneByExample(example);
	}

	@Override
	public int insertusers(Users users) {
		return impl.insertSelective(users);
	}
}
