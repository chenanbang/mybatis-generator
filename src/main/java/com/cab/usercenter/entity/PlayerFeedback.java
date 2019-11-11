package com.cab.usercenter.entity;

import lombok.Data;

@Data
public class PlayerFeedback extends BaseEntity{

    private String fbId;

    private String userId;

    private String clientId;

    private String username;

    private String userSource;

    private Byte status;

    private String message;

    private String reservedField1;

    private String reservedField2;

    private String reservedField3;

    public PlayerFeedback() {
        super();
    }

}