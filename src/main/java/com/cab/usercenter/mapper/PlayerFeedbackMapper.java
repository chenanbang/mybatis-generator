package com.cab.usercenter.mapper;

import com.cab.usercenter.entity.PlayerFeedback;

public interface PlayerFeedbackMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PlayerFeedback record);

    int insertSelective(PlayerFeedback record);

    PlayerFeedback selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PlayerFeedback record);

    int updateByPrimaryKey(PlayerFeedback record);
}