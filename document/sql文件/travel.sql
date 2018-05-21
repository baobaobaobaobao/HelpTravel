/*
Navicat MySQL Data Transfer

Source Server         : English
Source Server Version : 50634
Source Host           : localhost:3306
Source Database       : travel

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2018-05-21 17:37:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `administrator`
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `AdId` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `AUsername` varchar(20) DEFAULT NULL COMMENT '管理员名称',
  `Apassword` varchar(20) DEFAULT NULL COMMENT '管理员密码',
  `ANickName` varchar(20) DEFAULT NULL COMMENT '管理员昵称',
  `AName` varchar(20) DEFAULT NULL COMMENT '管理员姓名',
  `ASex` varchar(20) DEFAULT NULL COMMENT '管理员性别',
  `ATel` varchar(20) DEFAULT NULL COMMENT '管理员电话',
  PRIMARY KEY (`AdId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES ('1', '1', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for `blacklist`
-- ----------------------------
DROP TABLE IF EXISTS `blacklist`;
CREATE TABLE `blacklist` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `buid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blacklist
-- ----------------------------
INSERT INTO `blacklist` VALUES ('1', '2', '1', '1', '1');
INSERT INTO `blacklist` VALUES ('2', '2', '1', '1', '颠三倒四多1');

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `CId` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `JId` int(20) DEFAULT NULL COMMENT '旅游条目编号',
  `CTo` int(11) DEFAULT NULL COMMENT '被评论者编号',
  `CForm` int(111) DEFAULT NULL COMMENT '被评论者编号',
  `Content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `State` int(11) DEFAULT NULL COMMENT '评论状态',
  `CDate` varchar(10) DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`CId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '1', '1', '1', '非常的好看，', '0', '1');
INSERT INTO `comment` VALUES ('2', '2', null, '1', '非常好的以一次经历', '0', null);
INSERT INTO `comment` VALUES ('5', '2', null, '1', '希望作者写出一个更好的游记', '0', null);
INSERT INTO `comment` VALUES ('6', '2', null, '1', '喜欢本次交游', '0', null);
INSERT INTO `comment` VALUES ('7', '2', null, '1', '希望还能参与', '0', null);

-- ----------------------------
-- Table structure for `friend`
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `FId` int(11) NOT NULL AUTO_INCREMENT,
  `UidOne` int(11) DEFAULT NULL,
  `UidTwo` int(11) DEFAULT NULL,
  `Friendship` int(11) DEFAULT NULL COMMENT '我们关系好的程度',
  PRIMARY KEY (`FId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friend
-- ----------------------------
INSERT INTO `friend` VALUES ('1', '1', '2', '500');

-- ----------------------------
-- Table structure for `journey`
-- ----------------------------
DROP TABLE IF EXISTS `journey`;
CREATE TABLE `journey` (
  `JId` int(11) NOT NULL AUTO_INCREMENT COMMENT '旅游条目编号',
  `Motif` varchar(100) DEFAULT NULL COMMENT '主题',
  `ExecuteTime` varchar(50) DEFAULT NULL COMMENT '执行开始时间',
  `Address` varchar(50) DEFAULT NULL COMMENT '地点',
  `Reward` int(50) DEFAULT NULL COMMENT '金额',
  `Request` varchar(100) DEFAULT NULL COMMENT '要求',
  `ToTime` varchar(20) DEFAULT NULL COMMENT '完成时间',
  `ConTent` varchar(255) DEFAULT NULL COMMENT '内容',
  `TId` int(11) DEFAULT NULL COMMENT '类型编号',
  `MaxQuantity` int(11) DEFAULT NULL COMMENT '最大人数',
  `IssueRId` int(11) DEFAULT NULL COMMENT '发布者id',
  `Astate` int(11) DEFAULT NULL COMMENT '状态',
  `IssueTime` varchar(11) DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`JId`)
) ENGINE=InnoDB AUTO_INCREMENT=389 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of journey
-- ----------------------------
INSERT INTO `journey` VALUES ('2', '西海旅游', '20140227', '西海', '5800', '两人', '20140525', '【南海之梦号】三亚-西沙群岛-三亚4天3晚邮轮之旅（含春节航班）', '2', '10', '2', '1', '20140201');
INSERT INTO `journey` VALUES ('379', '武汉一日游', '2018-05-17', '武汉', '1800', '50d779c9-0562-43e3-b4b5-e6344c432c63.jpg', '2018-05-09', null, null, '15', '1', '1', '201853');
INSERT INTO `journey` VALUES ('380', '武汉5日游', '2018-05-18', '武汉', '1200', '99a1b940-e894-4c47-93c9-8dd5b518ad87.jpg', '2018-05-09', null, null, '12', '1', '0', '201854');
INSERT INTO `journey` VALUES ('381', '黄鹤楼5日游', '2018-05-22', '武汉', '2500', 'e151021b-5574-416f-8978-17cb4970532d.jpg', '2018-05-18', null, null, '11', '1', '0', '201854');
INSERT INTO `journey` VALUES ('382', '武汉大学', '2018-05-24', '武汉', '3000', '40c57fc5-dadc-4a71-b0dd-6343d6823789.jpg', '2018-05-03', null, null, '25', '1', '0', '201854');
INSERT INTO `journey` VALUES ('383', '汉江路步行街', '2018-05-15', '武汉', '1300', '0d1247da-d334-4c8b-8821-a97eded03809.jpg', '2018-05-24', null, null, '32', '1', '0', '201854');
INSERT INTO `journey` VALUES ('384', '武汉长江大桥', '2018-05-22', '武汉', '2300', '26876e89-37b6-4ec7-86c8-72bfb786ace0.jpg', '2018-05-18', null, null, '26', '1', '0', '201854');
INSERT INTO `journey` VALUES ('385', '感受东湖的美妙音符', '2018-05-22', '武汉东湖', '4200', 'fc8d9cf0-ae9c-42c2-ae8d-3f12999807af.jpg', '2018-05-23', null, null, '13', '1', '0', '201854');
INSERT INTO `journey` VALUES ('386', '东湖的美丽风光', '2018-05-14', '武汉东湖', '2000', '364af578-4ff6-4c0c-bf70-c3d3d0c1e728.jpg', '2018-05-17', null, null, '14', '1', '0', '201854');
INSERT INTO `journey` VALUES ('387', '武汉光谷广场', '2018-05-11', '武汉', '3600', '397a9d04-ea33-4dd2-ae19-fde7d10aa528.jpg', '2018-05-09', null, null, '12', '1', '0', '201854');
INSERT INTO `journey` VALUES ('388', '武汉户部巷', '2018-05-07', '武汉', '1400', '085166bd-ffb3-4893-a872-6007b949a069.jpg', '2018-05-07', null, null, '25', '1', '0', '201854');

-- ----------------------------
-- Table structure for `journeytypes`
-- ----------------------------
DROP TABLE IF EXISTS `journeytypes`;
CREATE TABLE `journeytypes` (
  `TId` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型id',
  `Type` varchar(20) DEFAULT NULL COMMENT '类型名称',
  PRIMARY KEY (`TId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of journeytypes
-- ----------------------------

-- ----------------------------
-- Table structure for `jreceive`
-- ----------------------------
DROP TABLE IF EXISTS `jreceive`;
CREATE TABLE `jreceive` (
  `JRId` int(11) NOT NULL AUTO_INCREMENT COMMENT '接收编号',
  `JId` int(11) DEFAULT NULL COMMENT '旅游条目编号',
  `RId` int(11) DEFAULT NULL COMMENT '接受者编号',
  `RTime` varchar(255) DEFAULT NULL COMMENT '接收时间',
  `JRState` int(11) DEFAULT NULL COMMENT '接收状态',
  `Content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `CDate` varchar(255) DEFAULT NULL COMMENT '评论时间',
  `CState` int(11) DEFAULT NULL COMMENT '评论状态',
  PRIMARY KEY (`JRId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jreceive
-- ----------------------------
INSERT INTO `jreceive` VALUES ('1', '372', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('2', '375', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('3', '2', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('4', '2', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('5', '375', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('6', '377', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('7', '2', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('8', '2', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('9', '380', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('10', '382', '1', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('11', '380', '2', null, null, null, null, null);
INSERT INTO `jreceive` VALUES ('12', '386', '2', null, null, null, null, null);

-- ----------------------------
-- Table structure for `report`
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report` (
  `RUId` int(11) NOT NULL AUTO_INCREMENT,
  `JId` int(11) DEFAULT NULL,
  `UId` int(11) DEFAULT NULL,
  `Reason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RUId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of report
-- ----------------------------
INSERT INTO `report` VALUES ('1', '1', '1', '违法信息');
INSERT INTO `report` VALUES ('2', '1', '3', '不良信息');
INSERT INTO `report` VALUES ('5', '379', '1', '电话虚假');
INSERT INTO `report` VALUES ('6', '379', '1', '信息虚假');
INSERT INTO `report` VALUES ('7', '379', '1', '信息虚假');

-- ----------------------------
-- Table structure for `travelmessage`
-- ----------------------------
DROP TABLE IF EXISTS `travelmessage`;
CREATE TABLE `travelmessage` (
  `uid` int(11) DEFAULT NULL,
  `Createtime` varchar(50) DEFAULT NULL,
  `text` text,
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of travelmessage
-- ----------------------------
INSERT INTO `travelmessage` VALUES ('1', '20181212', '武汉一日游，我们去了户部巷等等很多地方。也参与了超级多的旅行项目。', '1', '武汉一日游');
INSERT INTO `travelmessage` VALUES ('1', '20181212', '黄河所在黄土高原，地产丰富，所以我们也布置了很多旅行任务。非常的充实。', '4', '黄河');
INSERT INTO `travelmessage` VALUES ('1', '20181212', '太行山一行中。我们旅游了很多地方，同时也满足了自己的好奇心。', '6', '太行山一行');
INSERT INTO `travelmessage` VALUES ('1', '20181512', '五山一行，我们参与也游历了一大批旅行景点等。包括丰富的矿藏物质等。', '7', '五山');
INSERT INTO `travelmessage` VALUES ('1', '20181155', '旅游游记', '8', '旅游游记');
INSERT INTO `travelmessage` VALUES ('1', '20181122', '天山一行', '9', '天山一行');
INSERT INTO `travelmessage` VALUES ('1', '20181245', '海洋一行', '10', '海洋一行');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `UId` int(11) NOT NULL AUTO_INCREMENT COMMENT '会员编号',
  `UserName` varchar(255) DEFAULT NULL COMMENT '用户名',
  `PassWord` varchar(255) DEFAULT NULL COMMENT '密码',
  `NickName` varchar(255) DEFAULT NULL COMMENT '昵称',
  `Name` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `AddressU` varchar(255) DEFAULT NULL COMMENT '地址',
  `Education` varchar(255) DEFAULT NULL COMMENT '教育背景',
  `Sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `Birthday` varchar(245) DEFAULT NULL COMMENT '出生日期',
  `IdNo` varchar(255) DEFAULT NULL COMMENT '身份证号码',
  `Tel` varchar(11) DEFAULT NULL COMMENT '电话',
  `State` int(11) DEFAULT NULL COMMENT '状态',
  `QQ` varchar(16) DEFAULT NULL COMMENT 'qq号',
  `level` int(11) DEFAULT NULL,
  PRIMARY KEY (`UId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '1111', '1111', '强哥', '鲍志强', '九江', '华南师范大学', '男', '2018-4-12', '360430199501180330', '135523121', '0', '165656566565', '600');
INSERT INTO `users` VALUES ('2', '2222', '2222', '1', '周小雄', '九江', '清华大学', '男', '2018-6-01', '36043019950180330', '15779235038', '0', '3563254', '300');
INSERT INTO `users` VALUES ('3', '3333', '3333', '张三', '张三', '南京', '北京大学', '女', '2018-5-21', '243325995232520', '13548762354', '0', '1352545245', '700');
INSERT INTO `users` VALUES ('4', '4444', '4444', '张三', '张三', '武汉', '清华大学', '男', '2018-1-15', '36043019950118223', '15779235038', '0', '245125465', '400');
