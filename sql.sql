
DROP TABLE IF EXISTS `t_wcnryfz`;
CREATE TABLE `t_wcnryfz` (
  `id` varchar(64) NOT NULL,
  `gxpcs` varchar(64) DEFAULT NULL COMMENT '管辖派出所',
  `law_case` varchar(256) DEFAULT NULL COMMENT '案件',
  `num` varchar(32) DEFAULT NULL COMMENT '数量',
  `mounth` varchar(32) DEFAULT NULL COMMENT '时间（月）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='未成年人员犯罪';

DROP TABLE IF EXISTS `t_zbmjpbjh`;
CREATE TABLE `t_zbmjpbjh` (
  `id` varchar(64) NOT NULL,
  `zbsj` varchar(32) DEFAULT NULL COMMENT '值班时间',
  `zbz` varchar(64) DEFAULT NULL COMMENT '值班组',
  `zbry` varchar(64) DEFAULT NULL COMMENT '值班人员',
  `lxdh` varchar(64) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='值班民警排版计划';

DROP TABLE IF EXISTS `t_zbryxx`;
CREATE TABLE `t_zbryxx` (
  `id` varchar(64) NOT NULL,
  `xm` varchar(32) DEFAULT NULL COMMENT '姓名',
  `sfzh` varchar(32) DEFAULT NULL COMMENT '身份证号',
  `ajfl` varchar(255) DEFAULT NULL COMMENT '案件分类',
  `zbdw` varchar(255) DEFAULT NULL COMMENT '抓捕单位',
  `zbrq` datetime DEFAULT NULL COMMENT '抓捕日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='抓捕人员信息';


DROP TABLE IF EXISTS `t_zdrk`;
CREATE TABLE `t_zdrk` (
  `id` varchar(64) NOT NULL COMMENT '主键',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `num` varchar(32) DEFAULT NULL COMMENT '数量',
  `gxpcs` varchar(64) DEFAULT NULL COMMENT '管辖派出所',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='重点人口';

DROP TABLE IF EXISTS `t_zdrk_photo`;
CREATE TABLE `t_zdrk_photo` (
  `id` varchar(64) NOT NULL,
  `sfzh` varchar(32) DEFAULT NULL COMMENT '身份证号',
  `file_name` varchar(64) DEFAULT NULL COMMENT '文件名称',
  `dest_file_name` varchar(128) DEFAULT NULL COMMENT '目标文件名称',
  `dest_file_path` varchar(128) DEFAULT NULL COMMENT '目标文件地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='抓捕人员照片';

DROP TABLE IF EXISTS `t_zhwp`;
CREATE TABLE `t_zhwp` (
  `id` varchar(64) NOT NULL,
  `time` varchar(32) DEFAULT NULL COMMENT '时间',
  `res` varchar(32) DEFAULT NULL COMMENT '物品',
  `money` varchar(32) DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='追回物品';



DROP TABLE IF EXISTS `t_sys_menu`;
CREATE TABLE `t_sys_menu` (
  `menu_id` varchar(32) NOT NULL COMMENT '菜单ID',
  `menu_name` varchar(64) DEFAULT NULL COMMENT '菜单ID',
  `menu_url` varchar(128) DEFAULT NULL COMMENT '菜单URL',
  `menu_desc` varchar(252) DEFAULT NULL COMMENT '菜单描述',
  `menu_status` char(1) DEFAULT '0' COMMENT '状态 1：停止  0： 启用',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_menu
-- ----------------------------
INSERT INTO `t_sys_menu` VALUES ('1', '重点人口', 'zdry/zdrkList', '重点人口', '0');
INSERT INTO `t_sys_menu` VALUES ('2', '未成年人员犯罪', 'zdry/wcnryfzList', '未成年人员犯罪', '0');
INSERT INTO `t_sys_menu` VALUES ('3', '值班民警排版计划', 'zdry/zbmjpbjhList', '值班民警排版计划', '0');
INSERT INTO `t_sys_menu` VALUES ('4', '追回物品', 'zdry/zhwpList', '追回物品', '0');
INSERT INTO `t_sys_menu` VALUES ('5', '抓捕人员信息', 'zdry/zbryxxList', '抓捕人员信息', '0');
INSERT INTO `t_sys_menu` VALUES ('6', '抓捕人员照片', 'zdry/zbryPhotoList', '抓捕人员照片', '0');


DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `user_id` varchar(32) NOT NULL COMMENT '用户id',
  `login_name` varchar(32) DEFAULT NULL COMMENT '登录名称',
  `login_pwd` varchar(255) DEFAULT NULL COMMENT '登录密码',
  `user_name` varchar(64) DEFAULT NULL COMMENT '用户名称',
  `phone` varchar(32) DEFAULT NULL COMMENT '电话',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('1', 'admin', '123456', 'admin_lqh', null, '2019-06-20 09:04:12');
INSERT INTO `t_sys_user` VALUES ('2', 'test', '123456', 'test_lqh', null, '2019-06-20 09:04:30');

