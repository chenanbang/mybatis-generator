CREATE TABLE `sys_player_feedback_kbapp` (
  `id` bigint(20) NOT NULL COMMENT '自增主键id',
  `fb_id` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '玩家反馈id',
  `user_id` varchar(64) CHARACTER SET utf8 NOT NULL COMMENT '初见用户唯一标识',
  `client_id` varchar(100) CHARACTER SET utf8 NOT NULL COMMENT '游戏客户端标识',
  `username` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户账号',
  `user_source` varchar(100) CHARACTER SET utf8 NOT NULL COMMENT '用户来源(渠道)',
  `status` tinyint(2) DEFAULT '0' COMMENT '回复状态 1未回复 , 2已读, 3已回复',
  `message` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '反馈内容',
  `created_at` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间(反馈时间)',
  `updated_at` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '修改时间',
  `reserved_field1` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '预留字段1',
  `reserved_field2` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '预留字段2',
  `reserved_field3` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '预留字段3',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_fb_id` (`fb_id`) USING BTREE,
  KEY `idx_user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='kbapp用户问题反馈表';

CREATE TABLE `sys_cs_reply_kbapp` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `reply_id` varchar(64) CHARACTER SET utf8 NOT NULL COMMENT '回复id',
  `cs_name` varchar(60) CHARACTER SET utf8 NOT NULL COMMENT '客服账号',
  `message` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '回复消息内容',
  `created_at` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间(客服回复时间)',
  `updated_at` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '修改时间',
  `fb_id` varchar(64) CHARACTER SET utf8 NOT NULL COMMENT '问题反馈id',
  `reserved_field1` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '预留字段1',
  `reserved_field2` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '预留字段2',
  `reserved_field3` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '预留字段3',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_reply_id` (`reply_id`) USING BTREE,
  KEY `idx_fb_id` (`fb_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='kbapp客服回复表';


