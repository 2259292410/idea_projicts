/*
SQLyog Ultimate v8.32 
MySQL - 5.7.19 : Database - book
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`book` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `book`;

/*Table structure for table `t_book` */

DROP TABLE IF EXISTS `t_book`;

CREATE TABLE `t_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `price` decimal(11,2) DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `sales` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `img_path` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

/*Data for the table `t_book` */

insert  into `t_book`(`id`,`name`,`price`,`author`,`sales`,`stock`,`img_path`) values (1,'java 从入门到放弃','80.11','国哥',9999,9,'static/img/default.jpg'),(2,'数据结构与算法','78.50','严敏君',6,13,'static/img/default.jpg'),(3,'怎样拐跑别人的媳妇','68.00','龙伍',100001,50,'static/img/default.jpg'),(4,'木虚肉盖饭','16.00','小胖',1001,49,'static/img/default.jpg'),(5,'C++编程思想','45.50','刚哥',14,95,'static/img/default.jpg'),(6,'蛋炒饭','9.90','周星星',12,53,'static/img/default.jpg'),(7,'赌神','66.50','龙伍',125,535,'static/img/default.jpg'),(8,'Java 编程思想','99.50','阳哥',47,36,'static/img/default.jpg'),(9,'JavaScript 从入门到精通','9.90','婷姐',85,95,'static/img/default.jpg'),(10,'cocos2d-x 游戏编程入门','49.00','国哥',52,62,'static/img/default.jpg'),(11,'C 语言程序设计','28.00','谭浩强',52,74,'static/img/default.jpg'),(12,'Lua 语言程序设计','51.50','雷丰阳',48,82,'static/img/default.jpg'),(13,'西游记','12.00','罗贯中',19,9999,'static/img/default.jpg'),(14,'水浒传','33.05','华仔',22,88,'static/img/default.jpg'),(15,'操作系统原理','133.05','刘优',122,188,'static/img/default.jpg'),(16,'数据结构 java 版','173.15','封大神',21,81,'static/img/default.jpg'),(17,'UNIX 高级环境编程','99.15','乐天',210,810,'static/img/default.jpg'),(18,'javaScript 高级编程','69.14','国哥',210,810,'static/img/default.jpg'),(19,'大话设计模式','89.15','国哥',20,10,'static/img/default.jpg'),(20,'人月神话','88.15','刚哥',20,80,'static/img/default.jpg'),(22,'社会我国哥，人狠话不多！','999999.00','1125',10,111110,NULL),(38,'1','1.00','12',1,1,'static/img/default.jpg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
