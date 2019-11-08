package com.cab.usercenter.mapper;

import com.cab.usercenter.entity.CsReply;

public interface CsReplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CsReply record);

    int insertSelective(CsReply record);

    CsReply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CsReply record);

    int updateByPrimaryKey(CsReply record);
}