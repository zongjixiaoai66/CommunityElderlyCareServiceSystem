/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb3 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

DROP DATABASE IF EXISTS `t253`;
CREATE DATABASE IF NOT EXISTS `t253` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `t253`;

DROP TABLE IF EXISTS `config`;
CREATE TABLE IF NOT EXISTS `config` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COMMENT='配置文件';

DELETE FROM `config`;
INSERT INTO `config` (`id`, `name`, `value`) VALUES
	(1, 'picture1', 'upload/picture1.jpg'),
	(2, 'picture2', 'upload/picture2.jpg'),
	(3, 'picture3', 'upload/picture3.jpg');

DROP TABLE IF EXISTS `discussshequfuwu`;
CREATE TABLE IF NOT EXISTS `discussshequfuwu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint NOT NULL COMMENT '关联表id',
  `userid` bigint NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8mb3 COMMENT='社区服务评论表';

DELETE FROM `discussshequfuwu`;
INSERT INTO `discussshequfuwu` (`id`, `addtime`, `refid`, `userid`, `nickname`, `content`, `reply`) VALUES
	(181, '2022-04-29 05:15:52', 1, 1, '用户名1', '评论内容1', '回复内容1'),
	(182, '2022-04-29 05:15:52', 2, 2, '用户名2', '评论内容2', '回复内容2'),
	(183, '2022-04-29 05:15:52', 3, 3, '用户名3', '评论内容3', '回复内容3'),
	(184, '2022-04-29 05:15:52', 4, 4, '用户名4', '评论内容4', '回复内容4'),
	(185, '2022-04-29 05:15:52', 5, 5, '用户名5', '评论内容5', '回复内容5'),
	(186, '2022-04-29 05:15:52', 6, 6, '用户名6', '评论内容6', '回复内容6');

DROP TABLE IF EXISTS `discussshequhuodong`;
CREATE TABLE IF NOT EXISTS `discussshequhuodong` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint NOT NULL COMMENT '关联表id',
  `userid` bigint NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8mb3 COMMENT='社区活动评论表';

DELETE FROM `discussshequhuodong`;
INSERT INTO `discussshequhuodong` (`id`, `addtime`, `refid`, `userid`, `nickname`, `content`, `reply`) VALUES
	(191, '2022-04-29 05:15:52', 1, 1, '用户名1', '评论内容1', '回复内容1'),
	(192, '2022-04-29 05:15:52', 2, 2, '用户名2', '评论内容2', '回复内容2'),
	(193, '2022-04-29 05:15:52', 3, 3, '用户名3', '评论内容3', '回复内容3'),
	(194, '2022-04-29 05:15:52', 4, 4, '用户名4', '评论内容4', '回复内容4'),
	(195, '2022-04-29 05:15:52', 5, 5, '用户名5', '评论内容5', '回复内容5'),
	(196, '2022-04-29 05:15:52', 6, 6, '用户名6', '评论内容6', '回复内容6');

DROP TABLE IF EXISTS `discusszixunzhongxin`;
CREATE TABLE IF NOT EXISTS `discusszixunzhongxin` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint NOT NULL COMMENT '关联表id',
  `userid` bigint NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8mb3 COMMENT='资讯中心评论表';

DELETE FROM `discusszixunzhongxin`;
INSERT INTO `discusszixunzhongxin` (`id`, `addtime`, `refid`, `userid`, `nickname`, `content`, `reply`) VALUES
	(201, '2022-04-29 05:15:52', 1, 1, '用户名1', '评论内容1', '回复内容1'),
	(202, '2022-04-29 05:15:52', 2, 2, '用户名2', '评论内容2', '回复内容2'),
	(203, '2022-04-29 05:15:52', 3, 3, '用户名3', '评论内容3', '回复内容3'),
	(204, '2022-04-29 05:15:52', 4, 4, '用户名4', '评论内容4', '回复内容4'),
	(205, '2022-04-29 05:15:52', 5, 5, '用户名5', '评论内容5', '回复内容5'),
	(206, '2022-04-29 05:15:52', 6, 6, '用户名6', '评论内容6', '回复内容6');

DROP TABLE IF EXISTS `fuwuyuyue`;
CREATE TABLE IF NOT EXISTS `fuwuyuyue` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `fuwuzhonglei` varchar(200) DEFAULT NULL COMMENT '服务种类',
  `yuyuebeizhu` varchar(200) DEFAULT NULL COMMENT '预约备注',
  `yuyueshijian` datetime NOT NULL COMMENT '预约时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb3 COMMENT='服务预约';

DELETE FROM `fuwuyuyue`;
INSERT INTO `fuwuyuyue` (`id`, `addtime`, `yuyuebianhao`, `fuwumingcheng`, `tupian`, `fuwuzhonglei`, `yuyuebeizhu`, `yuyueshijian`, `yonghuzhanghao`, `yonghuxingming`, `lianxifangshi`, `sfsh`, `shhf`) VALUES
	(41, '2022-04-29 05:15:52', '1111111111', '服务名称1', 'upload/fuwuyuyue_tupian1.jpg', '服务种类1', '预约备注1', '2022-04-29 13:15:52', '用户账号1', '用户姓名1', '13823888881', '是', ''),
	(42, '2022-04-29 05:15:52', '2222222222', '服务名称2', 'upload/fuwuyuyue_tupian2.jpg', '服务种类2', '预约备注2', '2022-04-29 13:15:52', '用户账号2', '用户姓名2', '13823888882', '是', ''),
	(43, '2022-04-29 05:15:52', '3333333333', '服务名称3', 'upload/fuwuyuyue_tupian3.jpg', '服务种类3', '预约备注3', '2022-04-29 13:15:52', '用户账号3', '用户姓名3', '13823888883', '是', ''),
	(44, '2022-04-29 05:15:52', '4444444444', '服务名称4', 'upload/fuwuyuyue_tupian4.jpg', '服务种类4', '预约备注4', '2022-04-29 13:15:52', '用户账号4', '用户姓名4', '13823888884', '是', ''),
	(45, '2022-04-29 05:15:52', '5555555555', '服务名称5', 'upload/fuwuyuyue_tupian5.jpg', '服务种类5', '预约备注5', '2022-04-29 13:15:52', '用户账号5', '用户姓名5', '13823888885', '是', ''),
	(46, '2022-04-29 05:15:52', '6666666666', '服务名称6', 'upload/fuwuyuyue_tupian6.jpg', '服务种类6', '预约备注6', '2022-04-29 13:15:52', '用户账号6', '用户姓名6', '13823888886', '是', '');

DROP TABLE IF EXISTS `fuwuzhonglei`;
CREATE TABLE IF NOT EXISTS `fuwuzhonglei` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fuwuzhonglei` varchar(200) DEFAULT NULL COMMENT '服务种类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb3 COMMENT='服务种类';

DELETE FROM `fuwuzhonglei`;
INSERT INTO `fuwuzhonglei` (`id`, `addtime`, `fuwuzhonglei`) VALUES
	(21, '2022-04-29 05:15:52', '服务种类1'),
	(22, '2022-04-29 05:15:52', '服务种类2'),
	(23, '2022-04-29 05:15:52', '服务种类3'),
	(24, '2022-04-29 05:15:52', '服务种类4'),
	(25, '2022-04-29 05:15:52', '服务种类5'),
	(26, '2022-04-29 05:15:52', '服务种类6');

DROP TABLE IF EXISTS `guihaixinxi`;
CREATE TABLE IF NOT EXISTS `guihaixinxi` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `wupinzhonglei` varchar(200) DEFAULT NULL COMMENT '物品种类',
  `wupinshuliang` int DEFAULT NULL COMMENT '物品数量',
  `guihaishijian` datetime DEFAULT NULL COMMENT '归还时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8mb3 COMMENT='归还信息';

DELETE FROM `guihaixinxi`;
INSERT INTO `guihaixinxi` (`id`, `addtime`, `wupinmingcheng`, `wupinzhonglei`, `wupinshuliang`, `guihaishijian`, `yonghuzhanghao`, `yonghuxingming`, `lianxifangshi`) VALUES
	(81, '2022-04-29 05:15:52', '物品名称1', '物品种类1', 1, '2022-04-29 13:15:52', '用户账号1', '用户姓名1', '13823888881'),
	(82, '2022-04-29 05:15:52', '物品名称2', '物品种类2', 2, '2022-04-29 13:15:52', '用户账号2', '用户姓名2', '13823888882'),
	(83, '2022-04-29 05:15:52', '物品名称3', '物品种类3', 3, '2022-04-29 13:15:52', '用户账号3', '用户姓名3', '13823888883'),
	(84, '2022-04-29 05:15:52', '物品名称4', '物品种类4', 4, '2022-04-29 13:15:52', '用户账号4', '用户姓名4', '13823888884'),
	(85, '2022-04-29 05:15:52', '物品名称5', '物品种类5', 5, '2022-04-29 13:15:52', '用户账号5', '用户姓名5', '13823888885'),
	(86, '2022-04-29 05:15:52', '物品名称6', '物品种类6', 6, '2022-04-29 13:15:52', '用户账号6', '用户姓名6', '13823888886');

DROP TABLE IF EXISTS `huodongbaoming`;
CREATE TABLE IF NOT EXISTS `huodongbaoming` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `baomingbianhao` varchar(200) DEFAULT NULL COMMENT '报名编号',
  `huodongbiaoti` varchar(200) DEFAULT NULL COMMENT '活动标题',
  `huodongdidian` varchar(200) DEFAULT NULL COMMENT '活动地点',
  `shenqingliyou` varchar(200) DEFAULT NULL COMMENT '申请理由',
  `shenqingshijian` date DEFAULT NULL COMMENT '申请时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `baomingbianhao` (`baomingbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8mb3 COMMENT='活动报名';

DELETE FROM `huodongbaoming`;
INSERT INTO `huodongbaoming` (`id`, `addtime`, `baomingbianhao`, `huodongbiaoti`, `huodongdidian`, `shenqingliyou`, `shenqingshijian`, `yonghuzhanghao`, `yonghuxingming`, `lianxifangshi`, `sfsh`, `shhf`) VALUES
	(111, '2022-04-29 05:15:52', '1111111111', '活动标题1', '活动地点1', '申请理由1', '2022-04-29', '用户账号1', '用户姓名1', '13823888881', '是', ''),
	(112, '2022-04-29 05:15:52', '2222222222', '活动标题2', '活动地点2', '申请理由2', '2022-04-29', '用户账号2', '用户姓名2', '13823888882', '是', ''),
	(113, '2022-04-29 05:15:52', '3333333333', '活动标题3', '活动地点3', '申请理由3', '2022-04-29', '用户账号3', '用户姓名3', '13823888883', '是', ''),
	(114, '2022-04-29 05:15:52', '4444444444', '活动标题4', '活动地点4', '申请理由4', '2022-04-29', '用户账号4', '用户姓名4', '13823888884', '是', ''),
	(115, '2022-04-29 05:15:52', '5555555555', '活动标题5', '活动地点5', '申请理由5', '2022-04-29', '用户账号5', '用户姓名5', '13823888885', '是', ''),
	(116, '2022-04-29 05:15:52', '6666666666', '活动标题6', '活动地点6', '申请理由6', '2022-04-29', '用户账号6', '用户姓名6', '13823888886', '是', '');

DROP TABLE IF EXISTS `huodongfenlei`;
CREATE TABLE IF NOT EXISTS `huodongfenlei` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huodongfenlei` varchar(200) DEFAULT NULL COMMENT '活动分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8mb3 COMMENT='活动分类';

DELETE FROM `huodongfenlei`;
INSERT INTO `huodongfenlei` (`id`, `addtime`, `huodongfenlei`) VALUES
	(91, '2022-04-29 05:15:52', '活动分类1'),
	(92, '2022-04-29 05:15:52', '活动分类2'),
	(93, '2022-04-29 05:15:52', '活动分类3'),
	(94, '2022-04-29 05:15:52', '活动分类4'),
	(95, '2022-04-29 05:15:52', '活动分类5'),
	(96, '2022-04-29 05:15:52', '活动分类6');

DROP TABLE IF EXISTS `jieyongxinxi`;
CREATE TABLE IF NOT EXISTS `jieyongxinxi` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `wupinzhonglei` varchar(200) DEFAULT NULL COMMENT '物品种类',
  `wupinshuliang` int DEFAULT NULL COMMENT '物品数量',
  `jieyongyuanyin` varchar(200) DEFAULT NULL COMMENT '借用原因',
  `jieyongshijian` datetime DEFAULT NULL COMMENT '借用时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8mb3 COMMENT='借用信息';

DELETE FROM `jieyongxinxi`;
INSERT INTO `jieyongxinxi` (`id`, `addtime`, `wupinmingcheng`, `wupinzhonglei`, `wupinshuliang`, `jieyongyuanyin`, `jieyongshijian`, `yonghuzhanghao`, `yonghuxingming`, `lianxifangshi`, `sfsh`, `shhf`) VALUES
	(71, '2022-04-29 05:15:52', '物品名称1', '物品种类1', 1, '借用原因1', '2022-04-29 13:15:52', '用户账号1', '用户姓名1', '13823888881', '是', ''),
	(72, '2022-04-29 05:15:52', '物品名称2', '物品种类2', 2, '借用原因2', '2022-04-29 13:15:52', '用户账号2', '用户姓名2', '13823888882', '是', ''),
	(73, '2022-04-29 05:15:52', '物品名称3', '物品种类3', 3, '借用原因3', '2022-04-29 13:15:52', '用户账号3', '用户姓名3', '13823888883', '是', ''),
	(74, '2022-04-29 05:15:52', '物品名称4', '物品种类4', 4, '借用原因4', '2022-04-29 13:15:52', '用户账号4', '用户姓名4', '13823888884', '是', ''),
	(75, '2022-04-29 05:15:52', '物品名称5', '物品种类5', 5, '借用原因5', '2022-04-29 13:15:52', '用户账号5', '用户姓名5', '13823888885', '是', ''),
	(76, '2022-04-29 05:15:52', '物品名称6', '物品种类6', 6, '借用原因6', '2022-04-29 13:15:52', '用户账号6', '用户姓名6', '13823888886', '是', '');

DROP TABLE IF EXISTS `menu`;
CREATE TABLE IF NOT EXISTS `menu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `menujson` longtext COMMENT '菜单',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COMMENT='菜单';

DELETE FROM `menu`;
INSERT INTO `menu` (`id`, `addtime`, `menujson`) VALUES
	(1, '2022-04-29 05:15:52', '[{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除"],"menu":"服务种类","menuJump":"列表","tableName":"fuwuzhonglei"}],"menu":"服务种类管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","查看评论"],"menu":"社区服务","menuJump":"列表","tableName":"shequfuwu"}],"menu":"社区服务管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除","审核"],"menu":"服务预约","menuJump":"列表","tableName":"fuwuyuyue"}],"menu":"服务预约管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"物品种类","menuJump":"列表","tableName":"wupinzhonglei"}],"menu":"物品种类管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"物品信息","menuJump":"列表","tableName":"wupinxinxi"}],"menu":"物品信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除","审核"],"menu":"借用信息","menuJump":"列表","tableName":"jieyongxinxi"}],"menu":"借用信息管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","修改","删除"],"menu":"归还信息","menuJump":"列表","tableName":"guihaixinxi"}],"menu":"归还信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除"],"menu":"活动分类","menuJump":"列表","tableName":"huodongfenlei"}],"menu":"活动分类管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"社区活动","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除","审核"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"疫情监测","menuJump":"列表","tableName":"yiqingjiance"}],"menu":"疫情监测管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除","报表"],"menu":"物业收费","menuJump":"列表","tableName":"wuyeshoufei"}],"menu":"物业收费管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"资讯中心","menuJump":"列表","tableName":"zixunzhongxin"}],"menu":"资讯中心管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"意见中心","tableName":"messages"}],"menu":"意见中心"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","编辑名称","编辑父级","删除"],"menu":"菜单列表","tableName":"menu"},{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论","立即预约"],"menu":"社区服务列表","menuJump":"列表","tableName":"shequfuwu"}],"menu":"社区服务模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["立即借用","查看"],"menu":"物品信息列表","menuJump":"列表","tableName":"wupinxinxi"}],"menu":"物品信息模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","立即报名","查看评论"],"menu":"社区活动列表","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","查看评论"],"menu":"资讯中心列表","menuJump":"列表","tableName":"zixunzhongxin"}],"menu":"资讯中心模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除"],"menu":"服务预约","menuJump":"列表","tableName":"fuwuyuyue"}],"menu":"服务预约管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除","归还"],"menu":"借用信息","menuJump":"列表","tableName":"jieyongxinxi"}],"menu":"借用信息管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["删除","查看"],"menu":"归还信息","menuJump":"列表","tableName":"guihaixinxi"}],"menu":"归还信息管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"疫情监测","menuJump":"列表","tableName":"yiqingjiance"}],"menu":"疫情监测管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","支付"],"menu":"物业收费","menuJump":"列表","tableName":"wuyeshoufei"}],"menu":"物业收费管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","编辑名称","编辑父级","删除"],"menu":"菜单列表","tableName":"menu"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论","立即预约"],"menu":"社区服务列表","menuJump":"列表","tableName":"shequfuwu"}],"menu":"社区服务模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["立即借用","查看"],"menu":"物品信息列表","menuJump":"列表","tableName":"wupinxinxi"}],"menu":"物品信息模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","立即报名","查看评论"],"menu":"社区活动列表","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","查看评论"],"menu":"资讯中心列表","menuJump":"列表","tableName":"zixunzhongxin"}],"menu":"资讯中心模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]');

DROP TABLE IF EXISTS `messages`;
CREATE TABLE IF NOT EXISTS `messages` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '留言内容',
  `cpicture` varchar(200) DEFAULT NULL COMMENT '留言图片',
  `reply` longtext COMMENT '回复内容',
  `rpicture` varchar(200) DEFAULT NULL COMMENT '回复图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8mb3 COMMENT='意见中心';

DELETE FROM `messages`;
INSERT INTO `messages` (`id`, `addtime`, `userid`, `username`, `content`, `cpicture`, `reply`, `rpicture`) VALUES
	(161, '2022-04-29 05:15:52', 1, '用户名1', '留言内容1', 'upload/messages_cpicture1.jpg', '回复内容1', 'upload/messages_rpicture1.jpg'),
	(162, '2022-04-29 05:15:52', 2, '用户名2', '留言内容2', 'upload/messages_cpicture2.jpg', '回复内容2', 'upload/messages_rpicture2.jpg'),
	(163, '2022-04-29 05:15:52', 3, '用户名3', '留言内容3', 'upload/messages_cpicture3.jpg', '回复内容3', 'upload/messages_rpicture3.jpg'),
	(164, '2022-04-29 05:15:52', 4, '用户名4', '留言内容4', 'upload/messages_cpicture4.jpg', '回复内容4', 'upload/messages_rpicture4.jpg'),
	(165, '2022-04-29 05:15:52', 5, '用户名5', '留言内容5', 'upload/messages_cpicture5.jpg', '回复内容5', 'upload/messages_rpicture5.jpg'),
	(166, '2022-04-29 05:15:52', 6, '用户名6', '留言内容6', 'upload/messages_cpicture6.jpg', '回复内容6', 'upload/messages_rpicture6.jpg');

DROP TABLE IF EXISTS `shequfuwu`;
CREATE TABLE IF NOT EXISTS `shequfuwu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `fuwuzhonglei` varchar(200) DEFAULT NULL COMMENT '服务种类',
  `gongzuoshijian` varchar(200) DEFAULT NULL COMMENT '工作时间',
  `fuwuxiangqing` longtext COMMENT '服务详情',
  `thumbsupnum` int DEFAULT '0' COMMENT '赞',
  `crazilynum` int DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb3 COMMENT='社区服务';

DELETE FROM `shequfuwu`;
INSERT INTO `shequfuwu` (`id`, `addtime`, `fuwumingcheng`, `tupian`, `fuwuzhonglei`, `gongzuoshijian`, `fuwuxiangqing`, `thumbsupnum`, `crazilynum`, `clicktime`, `clicknum`) VALUES
	(31, '2022-04-29 05:15:52', '服务名称1', 'upload/shequfuwu_tupian1.jpg', '服务种类1', '工作时间1', '服务详情1', 1, 1, '2024-07-10 09:10:58', 2),
	(32, '2022-04-29 05:15:52', '服务名称2', 'upload/shequfuwu_tupian2.jpg', '服务种类2', '工作时间2', '服务详情2', 2, 2, '2024-07-10 09:12:55', 7),
	(33, '2022-04-29 05:15:52', '服务名称3', 'upload/shequfuwu_tupian3.jpg', '服务种类3', '工作时间3', '服务详情3', 3, 3, '2022-04-29 13:15:52', 3),
	(34, '2022-04-29 05:15:52', '服务名称4', 'upload/shequfuwu_tupian4.jpg', '服务种类4', '工作时间4', '服务详情4', 4, 4, '2022-04-29 13:15:52', 4),
	(35, '2022-04-29 05:15:52', '服务名称5', 'upload/shequfuwu_tupian5.jpg', '服务种类5', '工作时间5', '服务详情5', 5, 5, '2022-04-29 13:15:52', 5),
	(36, '2022-04-29 05:15:52', '服务名称6', 'upload/shequfuwu_tupian6.jpg', '服务种类6', '工作时间6', '服务详情6', 6, 6, '2022-04-29 13:15:52', 6);

DROP TABLE IF EXISTS `shequhuodong`;
CREATE TABLE IF NOT EXISTS `shequhuodong` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huodongbiaoti` varchar(200) DEFAULT NULL COMMENT '活动标题',
  `huodongtupian` varchar(200) DEFAULT NULL COMMENT '活动图片',
  `huodongfenlei` varchar(200) DEFAULT NULL COMMENT '活动分类',
  `huodongdidian` varchar(200) DEFAULT NULL COMMENT '活动地点',
  `kaishishijian` datetime DEFAULT NULL COMMENT '开始时间',
  `jieshushijian` datetime DEFAULT NULL COMMENT '结束时间',
  `huodongxiangqing` longtext COMMENT '活动详情',
  `thumbsupnum` int DEFAULT '0' COMMENT '赞',
  `crazilynum` int DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb3 COMMENT='社区活动';

DELETE FROM `shequhuodong`;
INSERT INTO `shequhuodong` (`id`, `addtime`, `huodongbiaoti`, `huodongtupian`, `huodongfenlei`, `huodongdidian`, `kaishishijian`, `jieshushijian`, `huodongxiangqing`, `thumbsupnum`, `crazilynum`) VALUES
	(101, '2022-04-29 05:15:52', '活动标题1', 'upload/shequhuodong_huodongtupian1.jpg', '活动分类1', '活动地点1', '2022-04-29 13:15:52', '2022-04-29 13:15:52', '活动详情1', 1, 1),
	(102, '2022-04-29 05:15:52', '活动标题2', 'upload/shequhuodong_huodongtupian2.jpg', '活动分类2', '活动地点2', '2022-04-29 13:15:52', '2022-04-29 13:15:52', '活动详情2', 2, 2),
	(103, '2022-04-29 05:15:52', '活动标题3', 'upload/shequhuodong_huodongtupian3.jpg', '活动分类3', '活动地点3', '2022-04-29 13:15:52', '2022-04-29 13:15:52', '活动详情3', 3, 3),
	(104, '2022-04-29 05:15:52', '活动标题4', 'upload/shequhuodong_huodongtupian4.jpg', '活动分类4', '活动地点4', '2022-04-29 13:15:52', '2022-04-29 13:15:52', '活动详情4', 4, 4),
	(105, '2022-04-29 05:15:52', '活动标题5', 'upload/shequhuodong_huodongtupian5.jpg', '活动分类5', '活动地点5', '2022-04-29 13:15:52', '2022-04-29 13:15:52', '活动详情5', 5, 5),
	(106, '2022-04-29 05:15:52', '活动标题6', 'upload/shequhuodong_huodongtupian6.jpg', '活动分类6', '活动地点6', '2022-04-29 13:15:52', '2022-04-29 13:15:52', '活动详情6', 6, 6);

DROP TABLE IF EXISTS `storeup`;
CREATE TABLE IF NOT EXISTS `storeup` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint NOT NULL COMMENT '用户id',
  `refid` bigint DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1720573993059 DEFAULT CHARSET=utf8mb3 COMMENT='收藏表';

DELETE FROM `storeup`;
INSERT INTO `storeup` (`id`, `addtime`, `userid`, `refid`, `tablename`, `name`, `picture`, `type`, `inteltype`) VALUES
	(1720573973764, '2024-07-10 01:12:53', 11, 32, 'shequfuwu', '服务名称2', 'upload/shequfuwu_tupian2.jpg', '1', '服务种类2'),
	(1720573987190, '2024-07-10 01:13:06', 11, 102, 'shequhuodong', '活动标题2', 'upload/shequhuodong_huodongtupian2.jpg', '1', NULL),
	(1720573993058, '2024-07-10 01:13:12', 11, 144, 'zixunzhongxin', '资讯标题4', 'upload/zixunzhongxin_fengmian4.jpg', '1', NULL);

DROP TABLE IF EXISTS `token`;
CREATE TABLE IF NOT EXISTS `token` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3 COMMENT='token表';

DELETE FROM `token`;
INSERT INTO `token` (`id`, `userid`, `username`, `tablename`, `role`, `token`, `addtime`, `expiratedtime`) VALUES
	(1, 1, 'abo', 'users', '管理员', 'ygu16tusgyuqodr0w1tzlr5v4lyeemb0', '2022-04-29 05:18:03', '2024-07-10 02:10:42'),
	(2, 11, '用户1', 'yonghu', '用户', 'qv84b5mt36c61he1s05g5r69rcbq76z6', '2024-07-10 01:09:18', '2024-07-10 02:12:42');

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COMMENT='用户表';

DELETE FROM `users`;
INSERT INTO `users` (`id`, `username`, `password`, `role`, `addtime`) VALUES
	(1, 'admin', '123456', '管理员', '2022-04-29 05:15:52');

DROP TABLE IF EXISTS `wupinxinxi`;
CREATE TABLE IF NOT EXISTS `wupinxinxi` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `wupinzhonglei` varchar(200) DEFAULT NULL COMMENT '物品种类',
  `wupinshuliang` int DEFAULT NULL COMMENT '物品数量',
  `wupinxiangqing` longtext COMMENT '物品详情',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb3 COMMENT='物品信息';

DELETE FROM `wupinxinxi`;
INSERT INTO `wupinxinxi` (`id`, `addtime`, `wupinmingcheng`, `tupian`, `wupinzhonglei`, `wupinshuliang`, `wupinxiangqing`) VALUES
	(61, '2022-04-29 05:15:52', '物品名称1', 'upload/wupinxinxi_tupian1.jpg', '物品种类1', 1, '物品详情1'),
	(62, '2022-04-29 05:15:52', '物品名称2', 'upload/wupinxinxi_tupian2.jpg', '物品种类2', 2, '物品详情2'),
	(63, '2022-04-29 05:15:52', '物品名称3', 'upload/wupinxinxi_tupian3.jpg', '物品种类3', 3, '物品详情3'),
	(64, '2022-04-29 05:15:52', '物品名称4', 'upload/wupinxinxi_tupian4.jpg', '物品种类4', 4, '物品详情4'),
	(65, '2022-04-29 05:15:52', '物品名称5', 'upload/wupinxinxi_tupian5.jpg', '物品种类5', 5, '物品详情5'),
	(66, '2022-04-29 05:15:52', '物品名称6', 'upload/wupinxinxi_tupian6.jpg', '物品种类6', 6, '物品详情6');

DROP TABLE IF EXISTS `wupinzhonglei`;
CREATE TABLE IF NOT EXISTS `wupinzhonglei` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinzhonglei` varchar(200) DEFAULT NULL COMMENT '物品种类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb3 COMMENT='物品种类';

DELETE FROM `wupinzhonglei`;
INSERT INTO `wupinzhonglei` (`id`, `addtime`, `wupinzhonglei`) VALUES
	(51, '2022-04-29 05:15:52', '物品种类1'),
	(52, '2022-04-29 05:15:52', '物品种类2'),
	(53, '2022-04-29 05:15:52', '物品种类3'),
	(54, '2022-04-29 05:15:52', '物品种类4'),
	(55, '2022-04-29 05:15:52', '物品种类5'),
	(56, '2022-04-29 05:15:52', '物品种类6');

DROP TABLE IF EXISTS `wuyeshoufei`;
CREATE TABLE IF NOT EXISTS `wuyeshoufei` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shoufeiyuefen` varchar(200) DEFAULT NULL COMMENT '收费月份',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `wuyefei` float DEFAULT NULL COMMENT '物业费',
  `lvhuayanghu` float DEFAULT NULL COMMENT '绿化养护',
  `qingjieweisheng` float DEFAULT NULL COMMENT '清洁卫生',
  `qitashoufei` float DEFAULT NULL COMMENT '其它收费',
  `shoufeishuoming` longtext COMMENT '收费说明',
  `zongjine` float DEFAULT NULL COMMENT '总金额',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8mb3 COMMENT='物业收费';

DELETE FROM `wuyeshoufei`;
INSERT INTO `wuyeshoufei` (`id`, `addtime`, `shoufeiyuefen`, `yonghuzhanghao`, `yonghuxingming`, `lianxifangshi`, `wuyefei`, `lvhuayanghu`, `qingjieweisheng`, `qitashoufei`, `shoufeishuoming`, `zongjine`, `ispay`) VALUES
	(131, '2022-04-29 05:15:52', '1月份', '用户账号1', '用户姓名1', '13823888881', 1, 1, 1, 1, '收费说明1', 1, '未支付'),
	(132, '2022-04-29 05:15:52', '1月份', '用户账号2', '用户姓名2', '13823888882', 2, 2, 2, 2, '收费说明2', 2, '未支付'),
	(133, '2022-04-29 05:15:52', '1月份', '用户账号3', '用户姓名3', '13823888883', 3, 3, 3, 3, '收费说明3', 3, '未支付'),
	(134, '2022-04-29 05:15:52', '1月份', '用户账号4', '用户姓名4', '13823888884', 4, 4, 4, 4, '收费说明4', 4, '未支付'),
	(135, '2022-04-29 05:15:52', '1月份', '用户账号5', '用户姓名5', '13823888885', 5, 5, 5, 5, '收费说明5', 5, '未支付'),
	(136, '2022-04-29 05:15:52', '1月份', '用户账号6', '用户姓名6', '13823888886', 6, 6, 6, 6, '收费说明6', 6, '未支付');

DROP TABLE IF EXISTS `yiqingjiance`;
CREATE TABLE IF NOT EXISTS `yiqingjiance` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dakabianhao` varchar(200) DEFAULT NULL COMMENT '打卡编号',
  `jiankangma` varchar(200) DEFAULT NULL COMMENT '健康码',
  `dangtiantiwen` float DEFAULT NULL COMMENT '当天体温',
  `shifoufare` varchar(200) DEFAULT NULL COMMENT '是否发热',
  `shifoukesou` varchar(200) DEFAULT NULL COMMENT '是否咳嗽',
  `shifoumijie` varchar(200) DEFAULT NULL COMMENT '是否密接',
  `dakashijian` datetime NOT NULL COMMENT '打卡时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `userid` bigint DEFAULT NULL COMMENT '用户id',
  `longitude` float DEFAULT NULL COMMENT '经度',
  `latitude` float DEFAULT NULL COMMENT '纬度',
  `fulladdress` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dakabianhao` (`dakabianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8mb3 COMMENT='疫情监测';

DELETE FROM `yiqingjiance`;
INSERT INTO `yiqingjiance` (`id`, `addtime`, `dakabianhao`, `jiankangma`, `dangtiantiwen`, `shifoufare`, `shifoukesou`, `shifoumijie`, `dakashijian`, `yonghuzhanghao`, `yonghuxingming`, `lianxifangshi`, `userid`, `longitude`, `latitude`, `fulladdress`) VALUES
	(121, '2022-04-29 05:15:52', '1111111111', 'upload/yiqingjiance_jiankangma1.jpg', 1, '否', '否', '否', '2022-04-29 13:15:52', '用户账号1', '用户姓名1', '13823888881', 1, 1, 1, '宇宙银河系地球1号'),
	(122, '2022-04-29 05:15:52', '2222222222', 'upload/yiqingjiance_jiankangma2.jpg', 2, '否', '否', '否', '2022-04-29 13:15:52', '用户账号2', '用户姓名2', '13823888882', 2, 2, 2, '宇宙银河系地球2号'),
	(123, '2022-04-29 05:15:52', '3333333333', 'upload/yiqingjiance_jiankangma3.jpg', 3, '否', '否', '否', '2022-04-29 13:15:52', '用户账号3', '用户姓名3', '13823888883', 3, 3, 3, '宇宙银河系地球3号'),
	(124, '2022-04-29 05:15:52', '4444444444', 'upload/yiqingjiance_jiankangma4.jpg', 4, '否', '否', '否', '2022-04-29 13:15:52', '用户账号4', '用户姓名4', '13823888884', 4, 4, 4, '宇宙银河系地球4号'),
	(125, '2022-04-29 05:15:52', '5555555555', 'upload/yiqingjiance_jiankangma5.jpg', 5, '否', '否', '否', '2022-04-29 13:15:52', '用户账号5', '用户姓名5', '13823888885', 5, 5, 5, '宇宙银河系地球5号'),
	(126, '2022-04-29 05:15:52', '6666666666', 'upload/yiqingjiance_jiankangma6.jpg', 6, '否', '否', '否', '2022-04-29 13:15:52', '用户账号6', '用户姓名6', '13823888886', 6, 6, 6, '宇宙银河系地球6号');

DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE IF NOT EXISTS `yonghu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `qinshuxingming` varchar(200) DEFAULT NULL COMMENT '亲属姓名',
  `qinshuguanxi` varchar(200) DEFAULT NULL COMMENT '亲属关系',
  `jinjidianhua` varchar(200) DEFAULT NULL COMMENT '紧急电话',
  `jibingshi` varchar(200) DEFAULT NULL COMMENT '疾病史',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3 COMMENT='用户';

DELETE FROM `yonghu`;
INSERT INTO `yonghu` (`id`, `addtime`, `yonghuzhanghao`, `mima`, `yonghuxingming`, `zhaopian`, `xingbie`, `jiatingzhuzhi`, `lianxifangshi`, `qinshuxingming`, `qinshuguanxi`, `jinjidianhua`, `jibingshi`, `beizhu`) VALUES
	(11, '2022-04-29 05:15:52', '用户1', '123456', '用户姓名1', 'upload/yonghu_zhaopian1.jpg', '男', '家庭住址1', '13823888881', '亲属姓名1', '亲属关系1', '13823888881', '疾病史1', '备注1'),
	(12, '2022-04-29 05:15:52', '用户2', '123456', '用户姓名2', 'upload/yonghu_zhaopian2.jpg', '男', '家庭住址2', '13823888882', '亲属姓名2', '亲属关系2', '13823888882', '疾病史2', '备注2'),
	(13, '2022-04-29 05:15:52', '用户3', '123456', '用户姓名3', 'upload/yonghu_zhaopian3.jpg', '男', '家庭住址3', '13823888883', '亲属姓名3', '亲属关系3', '13823888883', '疾病史3', '备注3'),
	(14, '2022-04-29 05:15:52', '用户4', '123456', '用户姓名4', 'upload/yonghu_zhaopian4.jpg', '男', '家庭住址4', '13823888884', '亲属姓名4', '亲属关系4', '13823888884', '疾病史4', '备注4'),
	(15, '2022-04-29 05:15:52', '用户5', '123456', '用户姓名5', 'upload/yonghu_zhaopian5.jpg', '男', '家庭住址5', '13823888885', '亲属姓名5', '亲属关系5', '13823888885', '疾病史5', '备注5'),
	(16, '2022-04-29 05:15:52', '用户6', '123456', '用户姓名6', 'upload/yonghu_zhaopian6.jpg', '男', '家庭住址6', '13823888886', '亲属姓名6', '亲属关系6', '13823888886', '疾病史6', '备注6');

DROP TABLE IF EXISTS `zixunzhongxin`;
CREATE TABLE IF NOT EXISTS `zixunzhongxin` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zixunbiaoti` varchar(200) DEFAULT NULL COMMENT '资讯标题',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `zixunneirong` longtext COMMENT '资讯内容',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8mb3 COMMENT='资讯中心';

DELETE FROM `zixunzhongxin`;
INSERT INTO `zixunzhongxin` (`id`, `addtime`, `zixunbiaoti`, `fengmian`, `zixunneirong`, `fabushijian`) VALUES
	(141, '2022-04-29 05:15:52', '资讯标题1', 'upload/zixunzhongxin_fengmian1.jpg', '资讯内容1', '2022-04-29 13:15:52'),
	(142, '2022-04-29 05:15:52', '资讯标题2', 'upload/zixunzhongxin_fengmian2.jpg', '资讯内容2', '2022-04-29 13:15:52'),
	(143, '2022-04-29 05:15:52', '资讯标题3', 'upload/zixunzhongxin_fengmian3.jpg', '资讯内容3', '2022-04-29 13:15:52'),
	(144, '2022-04-29 05:15:52', '资讯标题4', 'upload/zixunzhongxin_fengmian4.jpg', '资讯内容4', '2022-04-29 13:15:52'),
	(145, '2022-04-29 05:15:52', '资讯标题5', 'upload/zixunzhongxin_fengmian5.jpg', '资讯内容5', '2022-04-29 13:15:52'),
	(146, '2022-04-29 05:15:52', '资讯标题6', 'upload/zixunzhongxin_fengmian6.jpg', '资讯内容6', '2022-04-29 13:15:52');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
