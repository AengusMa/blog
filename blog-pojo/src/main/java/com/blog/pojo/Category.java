package com.blog.pojo;

/**
 * @author mawenlong
 * @date 2018/9/26
 *
 * 博客分类
 */
public class Category {

  private Integer id;

  private String name;

  private String description;

  private Integer num;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name == null ? null : name.trim();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description == null ? null : description.trim();
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }
}