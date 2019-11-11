package com.cab.usercenter.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author chenanbang
 * @version 1.0.0
 * @ClassName BaseEntity.java
 * @Description TODO
 * @createTime 2019年11月11日 11:11:00
 */
@Data
public class BaseEntity implements Serializable {

  private Long id;

  private Date createdAt;

  private Date updatedAt;

  private String tbName;

}
