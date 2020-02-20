package com.lixinyu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lixinyu.pojo.Article;
import com.lixinyu.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("list")
	public String list(Model model,String condition,String begin_time,String end_time) {
		System.out.println("-------------------------------------");
		List<Article> articleList = articleService.list(condition,begin_time,end_time);
		
		model.addAttribute("condition", condition);
		model.addAttribute("begin_time", begin_time);
		model.addAttribute("end_time", end_time);
		model.addAttribute("articleList", articleList);
		return "list";
	}
}
