package com.cab.usercenter.common.enums;

import lombok.Getter;

/**
 * @author chenanbang
 * @version 1.0.0
 * @ClassName TbPrefixEnum.java
 * @Description TODO
 * @createTime 2019年11月11日 11:35:00
 */
@Getter
public enum TbPrefixEnum {

  PLAYER_FEEDBACK("sys_player_feedback_","用户问题反馈表前缀"),
  CS_REPLY("sys_cs_reply_","客服回复表前缀");

  private String val;
  private String desc;

  TbPrefixEnum(String val, String desc) {
    this.val = val;
    this.desc = desc;
  }
}
