package com.blog.article.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.blog.content.service.ArticleService;
import com.blog.pojo.Article;
import com.blog.pojo.PageResult;
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

  @RequestMapping("/listPage")
  public PageResult listPage(int page, int size) {
    return articleService.listPage(page, size);
  }

  @RequestMapping("/getById")
  public Article getById(Integer id) {
    return articleService.getById(id);
  }
}
