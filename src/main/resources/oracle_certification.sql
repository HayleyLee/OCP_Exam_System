/*
 Navicat Premium Data Transfer

 Source Server         : macOS
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : oracle_certification

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 04/01/2021 18:18:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for OCP
-- ----------------------------
DROP TABLE IF EXISTS `OCP`;
CREATE TABLE `OCP` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '题号',
  `question` varchar(2550) NOT NULL COMMENT '问题',
  `optionA` varchar(255) NOT NULL COMMENT '选项A',
  `optionB` varchar(255) NOT NULL COMMENT '选项B',
  `optionC` varchar(255) NOT NULL COMMENT '选项C',
  `optionD` varchar(255) NOT NULL COMMENT '选项D',
  `answer` varchar(2550) NOT NULL COMMENT '正确答案',
  `img` varchar(255) DEFAULT NULL COMMENT '若问题中有图片，则为此',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for OCP_score
-- ----------------------------
DROP TABLE IF EXISTS `OCP_score`;
CREATE TABLE `OCP_score` (
  `id` int NOT NULL AUTO_INCREMENT,
  `score` int NOT NULL COMMENT '分数',
  `time` datetime NOT NULL COMMENT '上传时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
