-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: authority
-- ------------------------------------------------------
-- Server version	5.7.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `sys_data`
--

DROP TABLE IF EXISTS `sys_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_data` (
  `id` varchar(32) NOT NULL COMMENT '唯一group_id',
  `data_code` varchar(32) NOT NULL COMMENT '组编码',
  `data_name` varchar(100) NOT NULL COMMENT '组名称',
  `parent_id` varchar(32) NOT NULL COMMENT '父id',
  `data_path` varchar(2048) NOT NULL COMMENT '树状关系',
  `data_type` varchar(32) NOT NULL COMMENT '组类型，role角色，depart部门，data数据权限，其他',
  `sort_id` int(11) NOT NULL COMMENT '排序id',
  `url` varchar(500) NOT NULL COMMENT '请求url，可能是显示在页面的一个资源',
  `data_short_name` varchar(128) NOT NULL COMMENT '部门简称',
  `phone` varchar(45) NOT NULL DEFAULT '' COMMENT '部门电话',
  `fax` varchar(45) NOT NULL DEFAULT '' COMMENT '部门传真',
  `address` varchar(45) NOT NULL DEFAULT '' COMMENT '部门地址',
  `level` varchar(32) NOT NULL COMMENT '部门层级 1最高院，2高院，3中院，4基层法院，5部门',
  `undeletable_flag` varchar(32) NOT NULL DEFAULT '0' COMMENT '0可以删除，1不可以删除',
  `comments` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL COMMENT '创建日期',
  `create_user` varchar(32) NOT NULL COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改日期',
  `update_user` varchar(32) NOT NULL COMMENT '最后修改人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_data`
--

LOCK TABLES `sys_data` WRITE;
/*!40000 ALTER TABLE `sys_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_group`
--

DROP TABLE IF EXISTS `sys_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_group` (
  `id` varchar(32) NOT NULL COMMENT '唯一group_id',
  `group_code` varchar(32) NOT NULL COMMENT '组编码',
  `group_name` varchar(100) DEFAULT NULL COMMENT '组名称',
  `parent_id` varchar(32) NOT NULL COMMENT '父id',
  `area_id` varchar(32) DEFAULT NULL COMMENT '所属地区的ID',
  `group_path` varchar(2048) DEFAULT NULL COMMENT '树状关系',
  `group_type` varchar(32) DEFAULT NULL COMMENT '组类型，role角色，depart部门，custom自定义，其他',
  `sort_id` int(11) DEFAULT NULL COMMENT '排序id',
  `group_short_name` varchar(128) DEFAULT NULL COMMENT '部门简称',
  `group_phone` varchar(45) DEFAULT '' COMMENT '部门电话',
  `group_fax` varchar(45) DEFAULT '' COMMENT '部门传真',
  `group_address` varchar(45) DEFAULT '' COMMENT '部门地址',
  `group_level` varchar(32) DEFAULT NULL COMMENT '部门层级 1最高院，2高院，3中院，4基层法院，5部门',
  `project_code` varchar(45) DEFAULT NULL,
  `undeletable_flag` varchar(32) DEFAULT '0' COMMENT '0可以删除，1不可以删除',
  `comments` varchar(255) DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL COMMENT '创建日期',
  `create_user` varchar(32) NOT NULL COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改日期',
  `update_user` varchar(32) NOT NULL COMMENT '最后修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统分组表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_group`
--

LOCK TABLES `sys_group` WRITE;
/*!40000 ALTER TABLE `sys_group` DISABLE KEYS */;
INSERT INTO `sys_group` VALUES ('0','0','新乡市检察院角色管理','-1',NULL,'/0/','role',-1,'新乡市检察院角色管理','','','','1',NULL,'0','','2018-05-17 14:09:56','wengpeng','2018-05-24 22:53:19','wengpeng'),('184130844087025664','','管理员','183399497852780544',NULL,'/0/183399497852780544/184130844087025664/','role',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 10:30:14','342903井飞雪','2018-05-24 10:30:14','342903井飞雪'),('184260797965271042','','新乡市中级人民检察院','-1',NULL,'/184260797965271042/','depart',NULL,NULL,'','','',NULL,NULL,'0','','2018-05-24 19:06:38','184191021951746048','2018-05-24 19:06:38','184191021951746048'),('184260873106227200','','红旗区人民检察院','184260797965271042',NULL,'/184260797965271042/184260873106227200/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:06:56','184191021951746048','2018-05-24 19:06:56','184191021951746048'),('184260906874568704','','新乡市凤泉区人民检察院','184260797965271042',NULL,'/184260797965271042/184260906874568704/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:07:04','184191021951746048','2018-05-24 19:07:10','184191021951746048'),('184260965653544960','','河南省新乡市卫滨区人民检察院','184260797965271042',NULL,'/184260797965271042/184260965653544960/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:07:18','184191021951746048','2018-05-24 19:07:18','184191021951746048'),('184260990781620224','','封丘县人民法院黄陵检察院','184260797965271042',NULL,'/184260797965271042/184260990781620224/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:07:24','184191021951746048','2018-05-24 19:07:24','184191021951746048'),('184261026877800448','','新乡县人民检察院','184260797965271042',NULL,'/184260797965271042/184261026877800448/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:07:32','184191021951746048','2018-05-24 19:07:32','184191021951746048'),('184261052114927616','','封丘县人民检察院','184260797965271042',NULL,'/184260797965271042/184261052114927616/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:07:38','184191021951746048','2018-05-24 19:07:38','184191021951746048'),('184261082632683520','','延津县人民检察院','184260797965271042',NULL,'/184260797965271042/184261082632683520/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:07:46','184191021951746048','2018-05-24 19:07:46','184191021951746048'),('184261107903365120','','长垣县人民检察院','184260797965271042',NULL,'/184260797965271042/184261107903365120/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:07:52','184191021951746048','2018-05-24 19:07:52','184191021951746048'),('184261145819873280','','原阳县人民检察院','184260797965271042',NULL,'/184260797965271042/184261145819873280/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:08:01','184191021951746048','2018-05-24 19:08:01','184191021951746048'),('184261170633375744','','原阳县人民法院太平镇人民检察院','184260797965271042',NULL,'/184260797965271042/184261170633375744/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:08:06','184191021951746048','2018-05-24 19:08:06','184191021951746048'),('184261199263694848','','长垣县人民法院方里人民检察院','184260797965271042',NULL,'/184260797965271042/184261199263694848/','depart',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-05-24 19:08:13','184191021951746048','2018-05-24 19:08:13','184191021951746048'),('184274230152527872','','普通人员','183399497852780544',NULL,'/0/183399497852780544/184274230152527872/','role',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'普通人员','2018-05-24 20:00:00','184191021951746048','2018-05-24 20:02:09','184191021951746048');
/*!40000 ALTER TABLE `sys_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_group_data`
--

DROP TABLE IF EXISTS `sys_group_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_group_data` (
  `id` varchar(32) NOT NULL,
  `group_id` varchar(32) NOT NULL COMMENT '分组id/用户id',
  `data_id` varchar(32) NOT NULL COMMENT '资源id',
  `comments` varchar(128) NOT NULL COMMENT '备注',
  `create_time` datetime NOT NULL COMMENT '操作时间',
  `create_user` varchar(32) NOT NULL COMMENT '操作人id',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改日期',
  `update_user` varchar(32) NOT NULL COMMENT '最后修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分组数据资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_group_data`
--

LOCK TABLES `sys_group_data` WRITE;
/*!40000 ALTER TABLE `sys_group_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_group_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_group_resource`
--

DROP TABLE IF EXISTS `sys_group_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_group_resource` (
  `id` varchar(32) NOT NULL,
  `group_id` varchar(32) NOT NULL COMMENT '分组id/用户id',
  `resource_id` varchar(32) NOT NULL COMMENT '资源id',
  `comments` varchar(128) DEFAULT NULL COMMENT '备注',
  `create_time` datetime NOT NULL COMMENT '操作时间',
  `create_user` varchar(32) NOT NULL COMMENT '操作人id',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改日期',
  `update_user` varchar(32) NOT NULL COMMENT '最后修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分组资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_group_resource`
--

LOCK TABLES `sys_group_resource` WRITE;
/*!40000 ALTER TABLE `sys_group_resource` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_group_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_group_user`
--

DROP TABLE IF EXISTS `sys_group_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_group_user` (
  `id` varchar(32) NOT NULL COMMENT '唯一id',
  `user_id` varchar(32) NOT NULL COMMENT '用户id',
  `group_id` varchar(32) NOT NULL COMMENT '组id',
  `comments` varchar(128) DEFAULT NULL COMMENT '备注',
  `leader_flag` varchar(32) DEFAULT '0' COMMENT '是否用户组管理员0否，1是',
  `create_time` datetime NOT NULL COMMENT '操作时间',
  `create_user` varchar(32) NOT NULL COMMENT '操作人id',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改日期',
  `update_user` varchar(32) NOT NULL COMMENT '最后修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分组用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_group_user`
--

LOCK TABLES `sys_group_user` WRITE;
/*!40000 ALTER TABLE `sys_group_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_group_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_resource`
--

DROP TABLE IF EXISTS `sys_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_resource` (
  `id` varchar(32) NOT NULL COMMENT '资源resource_id',
  `resource_code` varchar(32) DEFAULT NULL COMMENT '编码',
  `resource_path` varchar(2048) DEFAULT NULL COMMENT '树状关系',
  `route_path` varchar(128) DEFAULT NULL COMMENT '路由路径',
  `route_hidden` varchar(32) DEFAULT NULL COMMENT '路由是否展示',
  `resource_name` varchar(100) DEFAULT NULL COMMENT '资源名称',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '父节点id',
  `menu_flag` varchar(32) DEFAULT '0' COMMENT '是否目录0不是目录1是目录',
  `resource_type` varchar(32) DEFAULT NULL COMMENT '资源类型 menu菜单/button按钮/link链接',
  `request_url` varchar(500) DEFAULT NULL COMMENT '请求url',
  `request_type` varchar(45) DEFAULT NULL COMMENT 'restful风格url的http提交方式',
  `access_level` varchar(45) DEFAULT NULL COMMENT 'ppublic  - 公开访问,protect - 需登录,authorize - 需授权',
  `html_element` varchar(45) DEFAULT NULL COMMENT '页面元素',
  `resource_value` varchar(255) DEFAULT NULL COMMENT '对应的资源字符串',
  `authentication_type` varchar(32) DEFAULT NULL COMMENT '鉴权方式 0无鉴权 1登录鉴权 2授权鉴权',
  `sort_id` int(11) DEFAULT NULL COMMENT '排序字段',
  `show_flag` varchar(32) DEFAULT '1' COMMENT '是否展示，0否1是，默认为1',
  `icon_class` varchar(255) DEFAULT NULL COMMENT '图标类',
  `undeletable_flag` varchar(32) DEFAULT '0' COMMENT '0可以删除，1不可以删除',
  `comments` varchar(128) DEFAULT NULL COMMENT '备注',
  `project_code` varchar(45) DEFAULT NULL,
  `create_time` datetime NOT NULL COMMENT '操作时间',
  `create_user` varchar(32) NOT NULL COMMENT '操作人id',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改日期',
  `update_user` varchar(32) NOT NULL COMMENT '最后修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_resource`
--

LOCK TABLES `sys_resource` WRITE;
/*!40000 ALTER TABLE `sys_resource` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user` (
  `id` varchar(32) CHARACTER SET utf8 NOT NULL COMMENT '用户user_id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `login_name` varchar(100) DEFAULT NULL COMMENT '登陆名称',
  `depart_id` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '部门id',
  `sort_id` int(11) DEFAULT NULL COMMENT '排序id',
  `password` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '密码',
  `password_chg_times` int(11) DEFAULT '0' COMMENT '密码修改次数',
  `user_level` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户等级',
  `employee_num` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '工号',
  `user_mobile` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户手机',
  `user_email` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '邮箱',
  `user_status` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户状态 0 正常 1 删除',
  `comments` varchar(128) CHARACTER SET utf8 DEFAULT NULL COMMENT '备注',
  `user_birthdate` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户出生日期',
  `user_sex` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '性别',
  `user_idcard` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '身份证号码',
  `user_photo` longtext CHARACTER SET utf8 COMMENT '用户头像路径',
  `work_date` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '入职日期',
  `work_duty` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '职务',
  `work_telephone` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '办公电话',
  `party_id` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '政治面貌',
  `undeletable_flag` varchar(32) CHARACTER SET utf8 DEFAULT '0' COMMENT '0可以删除，1不可以删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_user` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统用户表,loginname和departid唯一';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
INSERT INTO `sys_user` VALUES ('1','测试人员','test','184260906874568704',1,'$2a$10$Cymjq20nW3T7HvN53IPoau/BiszOmF9evtJDcsezOzOkaGCDTLtDu',0,'1',NULL,'12345678901','','0',NULL,NULL,NULL,NULL,'/图片',NULL,NULL,NULL,NULL,'0','2018-05-24 20:00:49','184191021951746048','2018-05-24 20:00:49','184191021951746048'),('10','admin11',NULL,NULL,NULL,'$2a$10$4708m/Zo/V0UkOVNevO7JeU2jYoUPh/BUjlG6MS1jdfSyn/tfvrD6',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 10:12:13',NULL),('11','admin11',NULL,NULL,NULL,'$2a$10$B/GlmRlv/LWB/QCLLRnM.e/yfTtJkKDPRFK7UW28D.DrOCDHFOz7m',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 10:14:27',NULL),('12','admin11',NULL,NULL,NULL,'$2a$10$ZBOt.Paf5upMwdNlm7v.Xu.IedkApZLFei8.zF0dSRMZGL/yRoFWa',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 10:10:32',NULL),('2',NULL,NULL,NULL,NULL,'$2a$10$f58lNmQglKGG26gLq95wQe9MRc7lhMMo3cimnzVQ9aV980W4aWH3.',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 09:21:42',NULL),('27a1f22a4a2d4e08861dd7bff941160e','admin',NULL,NULL,NULL,'$2a$10$qI7jnJz8.K5sL6TcEfwdxOZn1Lq550kkBUruTN637dYsk/dszM4sS',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 15:12:12',NULL),('3','test11','test11','184260797965271042',2,'$2a$10$UbH84uNeM3S3MwuRju7M5uDXQ30tyEGR8eaAZkyW/NprGfvKFylh6',0,'1',NULL,'','','1',NULL,NULL,NULL,NULL,'/图片',NULL,NULL,NULL,NULL,'0','2018-05-24 22:40:53','184191021951746048','2018-05-24 22:40:53','184191021951746048'),('4','11122','11222222','184260797965271042',3,'$2a$10$nEU1qjnSL21wDylBT7emcub4JIwpQNGNftiusfF4Irh2NBmX0kFNC',0,'1',NULL,'12345678901','','1',NULL,NULL,NULL,NULL,'/图片',NULL,NULL,NULL,NULL,'0','2018-05-24 22:50:50','184191021951746048','2018-05-24 22:50:50','184191021951746048'),('5','test','王朝峰',NULL,4,'$2a$10$OeE4razcbS58bHOKePKbJO1NbQEQ7UmqOtwK2AC8L9lW8QkNGt46W',0,'1',NULL,'12222222222','22222222222222','0',NULL,NULL,NULL,NULL,'/图片',NULL,NULL,NULL,NULL,'0','2018-05-24 23:16:29','184191021951746048','2018-05-24 23:16:29','184191021951746048'),('6','王朝峰','王朝峰','184260797965271042',5,'$2a$10$f9nLdgHYuCPtQkUdxsYHCOMtgjMK3zt9.W6BaiA7eWE5l5vZ9IwCm',0,'1',NULL,'11111111111','11111111111111111111111','1',NULL,NULL,NULL,NULL,'/图片',NULL,NULL,NULL,NULL,'0','2018-05-24 23:16:58','184191021951746048','2018-05-24 23:17:04','184191021951746048'),('63faac78cf55481eac09851fc4d73ac5','admin',NULL,NULL,NULL,'123',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 17:35:29',NULL),('6b0a135ec6b741049015e20a066a45e1','admin',NULL,NULL,NULL,'123',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 17:36:32',NULL),('7','萧竹雨','oavsY0Y5QzzpC5AjKPbowUisdP6I',NULL,6,'$2a$10$/5wXUZ1eaUPNi5FaibxwC.B8k1G6Si7jt2Qs/KQi0F1nRoV0tRdhK',0,'1',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,'/图片',NULL,NULL,NULL,NULL,'0','2018-06-02 23:34:48','admin','2018-06-02 23:34:50','admin'),('8','后知后觉','oavsY0UCtAZMaMNJtU5idP0R8gOA',NULL,7,'$2a$10$kL5oXS9Up6.NGn251tLoQONJIR/S0sZDIT2U4mQgnJKJYn1e5M016',0,'1',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,'/图片',NULL,NULL,NULL,NULL,'0','2018-06-03 15:18:37','admin','2018-06-03 15:18:37','admin'),('9','admin11',NULL,NULL,NULL,'$2a$10$/qv/B5H97ifPG7gd1CqCQunCr3j/a7SKdJGAP6ybGzWdTEl0WAD5.',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 10:11:29',NULL),('c2dd7d8c29774a04b0d2935884a26fff','admin',NULL,NULL,NULL,'$2a$10$0l1ltEW3GyejuQ3ZMBGjVe6gRg.3Z.ugCpHufqtE0cCRccyZomQkG',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 14:24:19',NULL),('c74058cb856f4536a94a3617b2c671e9','admin',NULL,NULL,NULL,'$2a$10$M.ztXNuGJuCrngU.O1jXXef6aJCJFGokoNxi5u0.QeKOpgqnoyeQ6',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,'2018-06-29 14:10:42',NULL);
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-02 16:05:28
