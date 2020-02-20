package com.lixinyu.service;

import java.util.List;

import com.lixinyu.pojo.Article;

public interface ArticleService {

	List<Article> list(String condition, String begin_time, String end_time);

}
