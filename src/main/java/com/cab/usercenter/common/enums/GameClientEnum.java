package com.cab.usercenter.common.enums;

import lombok.Getter;

/**
 * @author chenanbang
 * @version 1.0.0
 * @ClassName GameClientEnum.java
 * @Description TODO
 * @createTime 2019年11月11日 11:44:00
 */
@Getter
public enum GameClientEnum {
  KDAPP("kdapp",""),
  SWAPP("swapp",""),
  THTG("thtg",""),
  TXAPP("txapp",""),
  XZAPP("xzapp",""),
  ;

  private String val;
  private String desc;

  GameClientEnum(String val, String desc) {
    this.val = val;
    this.desc = desc;
  }
}
