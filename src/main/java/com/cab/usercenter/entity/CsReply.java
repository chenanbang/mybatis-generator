package com.cab.usercenter.entity;

import java.util.Date;

public class CsReply {
    private Long id;

    private String replyId;

    private String csName;

    private String message;

    private Date createdAt;

    private Date updatedAt;

    private String fbId;

    private String reservedField1;

    private String reservedField2;

    private String reservedField3;

    public CsReply(Long id, String replyId, String csName, String message, Date createdAt, Date updatedAt, String fbId, String reservedField1, String reservedField2, String reservedField3) {
        this.id = id;
        this.replyId = replyId;
        this.csName = csName;
        this.message = message;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.fbId = fbId;
        this.reservedField1 = reservedField1;
        this.reservedField2 = reservedField2;
        this.reservedField3 = reservedField3;
    }

    public CsReply() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName == null ? null : csName.trim();
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

    public String getFbId() {
        return fbId;
    }

    public void setFbId(String fbId) {
        this.fbId = fbId == null ? null : fbId.trim();
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