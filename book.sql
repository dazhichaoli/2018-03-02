/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : book

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2018-03-01 17:43:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for model
-- ----------------------------
DROP TABLE IF EXISTS `model`;
CREATE TABLE `model` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `bookname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of model
-- ----------------------------
INSERT INTO `model` VALUES ('1', 'zhi', '1', 'zhi', 'zhi');
INSERT INTO `model` VALUES ('2', '?????', '1', '??', null);
INSERT INTO `model` VALUES ('3', '\'?????\'', '3', '??', null);
INSERT INTO `model` VALUES ('4', '?????', '4', '??', null);
INSERT INTO `model` VALUES ('6', '美好的谎言', '4', '冰心', null);
INSERT INTO `model` VALUES ('7', '浏览', '4', '小郅', null);
INSERT INTO `model` VALUES ('8', '浏览', '4', '小郅', null);
