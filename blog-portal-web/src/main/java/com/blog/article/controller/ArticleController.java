package com.blog.article.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.blog.content.service.ArticleService;
import com.blog.pojo.Article;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mawenlong
 * @date 2018/09/27
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

  @Reference
  private ArticleService articleService;

  @RequestMapping("/test")
  public void findCartList() {
    Article article = new Article();
    article.setModifydate(new Date());
    article.setCreatedate(new Date());
    article.setTitle("title");
    article.setContent("content");
    article.setHits(22);
    article.setPictureurl("url");
    article.setSummary("summary");
    articleService.insert(article);
  }
}
