package com.blog.mapper;

import com.blog.pojo.Category;
import com.blog.pojo.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author mawenlong
 * @date 2018/9/26
 */
public interface CategoryMapper {

  int countByExample(CategoryExample example);

  int deleteByExample(CategoryExample example);

  int deleteByPrimaryKey(Integer id);

  int insert(Category record);

  int insertSelective(Category record);

  List<Category> selectByExample(CategoryExample example);

  Category selectByPrimaryKey(Integer id);

  int updateByExampleSelective(@Param("record") Category record,
      @Param("example") CategoryExample example);

  int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

  int updateByPrimaryKeySelective(Category record);

  int updateByPrimaryKey(Category record);
}