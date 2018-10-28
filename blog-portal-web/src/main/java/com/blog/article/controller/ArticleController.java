package com.blog.article.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.blog.content.service.ArticleService;
import com.blog.content.service.CategoryService;
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
  @Reference
  private CategoryService categoryService;
  @RequestMapping("/test")
  public void findCartList() {
    Article article = new Article();
    article.setModifydate(new Date());
    article.setCreatedate(new Date());
    article.setTitle("女孩都有浪漫的小情怀——浪漫的求婚词");
    article.setContent("content");
    article.setHits(22);
    article.setPictureurl("images/2.jpg");
    article.setSummary("还在为浪漫的求婚词而烦恼不知道该怎么说吗？女孩子都有着浪漫的小情怀，对于求婚更是抱着满满的浪漫期待，也希望在求婚那一天对方可以给自己一个最浪漫的求婚词。");
    articleService.insert(article);
  }

  @RequestMapping("/listPage")
  public PageResult listPage(int page, int size) {
    return articleService.listPage(page, size);
  }

  @RequestMapping("/getById")
  public Article getById(Integer id) {
    return articleService.getById(id);
  }
}
