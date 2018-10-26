package com.blog.content.service;

import com.blog.pojo.Category;
import java.util.List;

/**
 * @author mawenlong
 * @date 2018/9/27
 *
 * 博客文章分类服务接口
 */
public interface CategoryService {
  /**
   * 新增
   */
  void insert(Category article);

  /**
   * 分页查询
   */
  List<Category> getAll();

  Category getById(Integer id);
}
