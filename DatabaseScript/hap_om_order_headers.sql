/*
Navicat MySQL Data Transfer

Source Server         : first_test
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : hap_dev

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2017-01-15 19:25:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hap_om_order_headers
-- ----------------------------
DROP TABLE IF EXISTS `hap_om_order_headers`;
CREATE TABLE `hap_om_order_headers` (
  `header_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单头ID',
  `ORDER_NUMBER` varchar(60) NOT NULL COMMENT '订单编号',
  `COMPANY_ID` bigint(20) NOT NULL COMMENT '公司ID',
  `ORDER_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '订单日期',
  `ORDER_STATUS` varchar(30) NOT NULL COMMENT '订单状态',
  `CUSTOMER_ID` bigint(20) NOT NULL COMMENT '客户ID',
  `OBJECT_VERSION_NUMBER` decimal(20,0) DEFAULT '1',
  `REQUEST_ID` bigint(20) DEFAULT '-1' COMMENT '请求号',
  `PROGRAM_ID` bigint(20) DEFAULT '-1',
  `CREATION_DATE` datetime DEFAULT CURRENT_TIMESTAMP,
  `CREATED_BY` decimal(20,0) DEFAULT '-1',
  `LAST_UPDATED_BY` decimal(20,0) DEFAULT '-1',
  `LAST_UPDATE_DATE` datetime DEFAULT CURRENT_TIMESTAMP,
  `LAST_UPDATE_LOGIN` decimal(20,0) DEFAULT NULL,
  `ATTRIBUTE_CATEGORY` varchar(30) DEFAULT NULL,
  `ATTRIBUTE1` varchar(240) DEFAULT NULL,
  `ATTRIBUTE2` varchar(240) DEFAULT NULL,
  `ATTRIBUTE3` varchar(240) DEFAULT NULL,
  `ATTRIBUTE4` varchar(240) DEFAULT NULL,
  `ATTRIBUTE5` varchar(240) DEFAULT NULL,
  `ATTRIBUTE6` varchar(240) DEFAULT NULL,
  `ATTRIBUTE7` varchar(240) DEFAULT NULL,
  `ATTRIBUTE8` varchar(240) DEFAULT NULL,
  `ATTRIBUTE9` varchar(240) DEFAULT NULL,
  `ATTRIBUTE10` varchar(240) DEFAULT NULL,
  `ATTRIBUTE11` varchar(240) DEFAULT NULL,
  `ATTRIBUTE12` varchar(240) DEFAULT NULL,
  `ATTRIBUTE13` varchar(240) DEFAULT NULL,
  `ATTRIBUTE14` varchar(240) DEFAULT NULL,
  `ATTRIBUTE15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`header_id`),
  KEY `	HAP_OM_ORDER_HEADERS_PK` (`header_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8 COMMENT='销售订单头表';

-- ----------------------------
-- Records of hap_om_order_headers
-- ----------------------------
INSERT INTO `hap_om_order_headers` VALUES ('1000', 'OM1001', '101', '2017-01-13 16:09:53', 'NEW', '201', '1', '-1', '-1', '2017-01-13 16:13:01', '-1', '-1', '2017-01-13 16:13:01', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `hap_om_order_headers` VALUES ('1001', 'OM1002', '102', '2017-01-13 17:13:11', 'SUBMITED', '202', '1', '-1', '-1', '2017-01-13 17:13:15', '-1', '-1', '2017-01-13 17:13:15', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `hap_om_order_headers` VALUES ('1002', 'OM1003', '103', '2017-01-13 17:18:58', 'APPROVED', '203', '1', '-1', '-1', '2017-01-13 17:18:58', '-1', '-1', '2017-01-13 17:18:58', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `hap_om_order_headers` VALUES ('1003', 'OM1004', '104', '2017-01-13 17:19:40', 'REJECTED', '204', '1', '-1', '-1', '2017-01-13 17:19:40', '-1', '-1', '2017-01-13 17:19:40', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
