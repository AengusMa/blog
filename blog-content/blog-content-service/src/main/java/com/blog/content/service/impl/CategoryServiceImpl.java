package com.blog.content.service.impl;

import com.blog.content.service.CategoryService;
import com.blog.mapper.CategoryMapper;
import com.blog.pojo.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mawenlong
 * @date 2018/09/27
 */
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  private CategoryMapper mapper;

  @Override
  public void insert(Category category) {
    mapper.insert(category);
  }

  @Override
  public List<Category> getAll() {
    return mapper.selectByExample(null);
  }

  @Override
  public Category getById(Integer integer) {
    return mapper.selectByPrimaryKey(integer);
  }
}
