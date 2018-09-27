package com.blog.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author mawenlong
 * @date 2018/09/27
 */
public class PageResult implements Serializable {

  private List rows;
  private long total;

  public PageResult() {
  }

  public PageResult(List rows, long total) {
    this.rows = rows;
    this.total = total;
  }

  public List getRows() {
    return rows;
  }

  public void setRows(List rows) {
    this.rows = rows;
  }

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }
}
