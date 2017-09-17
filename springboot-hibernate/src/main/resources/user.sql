/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : helssm

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-09-17 23:38:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `nickName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `isActive` char(1) DEFAULT NULL,
  `ipAddress` varchar(20) DEFAULT NULL,
  `loginTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
