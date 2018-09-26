package com.blog.mapper;

import com.blog.pojo.Article;
import java.util.Date;
import org.junit.Test;

/**
 * @author mawenlong
 * @date 2018/09/26
 */
public class ArticleMapperTest {

  @Test
  public void testInsert() {
    Article a = new Article();
    a.setContent("111");
    a.setTitle("222");
    a.setCreatedate(new Date());
    a.setModifydate(new Date());


  }
}
