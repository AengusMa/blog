package com.blog.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mawenlong
 * @date 2018/9/26
 *
 * 博客文章实体
 */
public class Article implements Serializable {

  private Integer id;

  private String title;

  private String pictureurl;

  private String summary;

  private Integer cateoryid;

  private Integer hits;

  private Date createdate;

  private Date modifydate;

  private String content;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title == null ? null : title.trim();
  }

  public String getPictureurl() {
    return pictureurl;
  }

  public void setPictureurl(String pictureurl) {
    this.pictureurl = pictureurl == null ? null : pictureurl.trim();
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary == null ? null : summary.trim();
  }

  public Integer getCateoryid() {
    return cateoryid;
  }

  public void setCateoryid(Integer cateoryid) {
    this.cateoryid = cateoryid;
  }

  public Integer getHits() {
    return hits;
  }

  public void setHits(Integer hits) {
    this.hits = hits;
  }

  public Date getCreatedate() {
    return createdate;
  }

  public void setCreatedate(Date createdate) {
    this.createdate = createdate;
  }

  public Date getModifydate() {
    return modifydate;
  }

  public void setModifydate(Date modifydate) {
    this.modifydate = modifydate;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content == null ? null : content.trim();
  }
}