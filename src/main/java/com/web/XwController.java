package com.web;


import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.domian.News;
import com.domian.Users;
import com.github.pagehelper.PageInfo;
import com.service.NewsService;
import com.service.UsersService;
import com.util.Dto;
import com.util.Msg;
import com.util.MyConstants;

@CrossOrigin
@RestController
@RequestMapping("xw")
@SessionAttributes(MyConstants.USERS)
public class XwController {
	@Autowired
	private UsersService usimpl;
	@Autowired
	private NewsService neimpl;
	
	@RequestMapping("loginUI")
	private PageInfo<News> loginUI(Dto dto){
		PageInfo< News> pgInfo=neimpl.selectlist(dto);
		return pgInfo;
	}
	@RequestMapping("listnews")
	private List<News> listnews(){
		List<News> list=neimpl.selectlist();
		return list;
	}
	
	@RequestMapping("xxxx")
	private News xxxx(int id){
		News news=neimpl.selectbyid(id);
		return news;
	}
	@RequestMapping("delete")
	private Msg delete(int id) {
		int i=neimpl.deletenews(id);
		if(i>0) {
			return new Msg(true,"删除成功");
		}else {
			return new Msg(false,"删除失败");
		}
		
	}
	@RequestMapping("addnews")
	private Msg createNewsUI(News news) {
		
		news.setUserid(1);
		news.setNauthor("张锦涛");
		news.setNtime(new Date());
		int i=neimpl.insernews(news);
		if(i>0) {
			return new Msg(true,"添加成功");
		}else {
			return new Msg(false,"添加失败");
		}
	}
	@RequestMapping("upload")
	public String save(MultipartFile  img,HttpSession session) throws Exception {
		if(img!=null && !"".equals(img.getOriginalFilename())) {
			//文件上传处理
			String oldName=img.getOriginalFilename();
			//得到源文件的扩展名
			String ext=oldName.substring(oldName.lastIndexOf("."));
			//得新的名称
			String newName=UUID.randomUUID()+ext;
			//自己增加，每天上传的文件，对应一个文件夹2020-2-21
			//实际应用中，要考虑各种情况，本次例子中只讲了最简单的情况
			
			//得到绝对路径
			String realpath= session.getServletContext().getRealPath("/imgurl/")+"/"+newName;
			img.transferTo(new File(realpath));
		
			return newName;
			
		}else {
			return "";
		}
		
		
		
	}
	@RequestMapping("updnews")
	private Msg updnews(News news) {
		System.out.println(news);
		int i=neimpl.updatenews(news);
		if(i>0) {
			return new Msg(true,"修改成功");
		}else {
			return new Msg(false,"修改失败");
		}
	}
	
	@RequestMapping("pages")
	private PageInfo<News> pages(Dto dto){
		
		PageInfo< News> pgInfo=neimpl.selectlist(dto);
		return pgInfo;
	}
	@RequestMapping("denlu")
	private Users denlu(Users users,Map map){
		Users i=usimpl.denluusers(users.getUname(), users.getUpwd());
		if(i!=null) {
			map.put(MyConstants.USERS, i);
			return i;
		}else {
			return null;
		}
	}
}
