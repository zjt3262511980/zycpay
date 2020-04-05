package com.service;

import java.util.List;

import com.domian.News;
import com.github.pagehelper.PageInfo;
import com.util.Dto;

public interface NewsService {
PageInfo<News> selectlist(Dto dto);
List<News> selectlist();
News selectbyid(int id);
int deletenews(int id);
int insernews(News news);
int updatenews(News news);
}
