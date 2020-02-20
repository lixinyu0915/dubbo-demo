package com.lixinyu.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lixinyu.dao.ArticleDao;
import com.lixinyu.pojo.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> list(String condition,String begin_time,String end_time) {
		// TODO Auto-generated method stub
		/*System.err.println(begin_time);
		Timestamp begin_time01 = Timestamp.valueOf(begin_time+" 00:00:00");
		Timestamp end_time01 = Timestamp.valueOf(end_time+" 00:00:00");*/
		return articleDao.list(condition,begin_time,end_time);
	}
}
