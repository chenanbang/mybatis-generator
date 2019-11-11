package com.cab.usercenter.entity;

import lombok.Data;

@Data
public class CsReply extends BaseEntity{

    private String replyId;

    private String csName;

    private String message;

    private String fbId;

    private String reservedField1;

    private String reservedField2;

    private String reservedField3;

    public CsReply() {
        super();
    }

}