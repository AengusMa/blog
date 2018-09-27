package com.blog.content.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.blog.content.service.ArticleService;
import com.blog.mapper.ArticleMapper;
import com.blog.pojo.Article;
import com.blog.pojo.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mawenlong
 * @date 2018/09/27
 */
@Service
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  private ArticleMapper articleMapper;

  @Override
  public void insert(Article article) {
    articleMapper.insert(article);
  }

  @Override
  public PageResult listPage(int pageNum, int pageSize) {
    PageHelper.startPage(pageNum, pageSize);
    Page<Article> page = (Page<Article>) articleMapper.selectByExample(null);
    return new PageResult(page.getResult(), page.getTotal());
  }

  @Override
  public Article getById(Integer id) {
    return articleMapper.selectByPrimaryKey(id);
  }

}
