package com.blog.content.service;

import com.blog.pojo.Article;
import com.blog.pojo.PageResult;

/**
 * @author mawenlong
 * @date 2018/9/27
 *
 * 博客文章服务接口
 */
public interface ArticleService {

  /**
   * 新增
   */
  void insert(Article article);

  /**
   * 分页查询
   */
  PageResult listPage(int pageNum, int pageSize);

  Article getById(Integer id);
}
