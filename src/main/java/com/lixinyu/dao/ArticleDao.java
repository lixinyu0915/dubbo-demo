package com.lixinyu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lixinyu.pojo.Article;

public interface ArticleDao {

	
	List<Article> list(@Param("condition")String condition, @Param("begin_time")String begin_time, @Param("end_time")String end_time);

}
