package com.cab.usercenter.entity;

import java.util.Date;

public class PlayerFeedback {
    private Long id;

    private String fbId;

    private String userId;

    private String clientId;

    private String username;

    private String userSource;

    private Byte status;

    private String message;

    private Date createdAt;

    private Date updatedAt;

    private String reservedField1;

    private String reservedField2;

    private String reservedField3;

    public PlayerFeedback(Long id, String fbId, String userId, String clientId, String username, String userSource, Byte status, String message, Date createdAt, Date updatedAt, String reservedField1, String reservedField2, String reservedField3) {
        this.id = id;
        this.fbId = fbId;
        this.userId = userId;
        this.clientId = clientId;
        this.username = username;
        this.userSource = userSource;
        this.status = status;
        this.message = message;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.reservedField1 = reservedField1;
        this.reservedField2 = reservedField2;
        this.reservedField3 = reservedField3;
    }

    public PlayerFeedback() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFbId() {
        return fbId;
    }

    public void setFbId(String fbId) {
        this.fbId = fbId == null ? null : fbId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource == null ? null : userSource.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getReservedField1() {
        return reservedField1;
    }

    public void setReservedField1(String reservedField1) {
        this.reservedField1 = reservedField1 == null ? null : reservedField1.trim();
    }

    public String getReservedField2() {
        return reservedField2;
    }

    public void setReservedField2(String reservedField2) {
        this.reservedField2 = reservedField2 == null ? null : reservedField2.trim();
    }

    public String getReservedField3() {
        return reservedField3;
    }

    public void setReservedField3(String reservedField3) {
        this.reservedField3 = reservedField3 == null ? null : reservedField3.trim();
    }
}