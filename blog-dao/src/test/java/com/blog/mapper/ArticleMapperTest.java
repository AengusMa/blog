package com.blog.mapper;

import com.blog.pojo.Article;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mawenlong
 * @date 2018/09/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ArticleMapperTest {
@Autowired
  private ArticleMapper articleMapper;

  @Test
  public void testInsert() {
    System.out.println(articleMapper);
    Article a = new Article();
    a.setContent("111");
    a.setTitle("222");
    a.setCreatedate(new Date());
    a.setModifydate(new Date());
//    articleMapper.insert(a);

  }
}
