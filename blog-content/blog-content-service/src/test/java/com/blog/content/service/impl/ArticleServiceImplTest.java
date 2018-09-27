package com.blog.content.service.impl;

import com.blog.pojo.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mawenlong
 * @date 2018/09/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-service.xml")
public class ArticleServiceImplTest {

  @Autowired
  private ArticleServiceImpl articleService;

  @Test
  public void test() {
    articleService.insert(new Article());
  }
}
