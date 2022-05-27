/*
SQLyog Ultimate v8.32 
MySQL - 5.7.19 : Database - shoping
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shoping` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shoping`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `price` decimal(11,2) DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `sales` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `img_path` varchar(200) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

/*Data for the table `book` */

insert  into `book`(`id`,`name`,`price`,`author`,`sales`,`stock`,`img_path`,`title`) values (1,'心安即是归处','36.80','季羡林',112,1986,'https://img11.360buyimg.com/n1/s200x200_jfs/t1/124564/33/2321/44592/5ec4e742E1ac8fcbe/9d953109e5374410.jpg','跨四代共读心灵读本，一本书阅尽大师智慧精华！人生最好状态就是活得清醒、坦荡、真实。季羡林写给万千迷茫的青年一代！愿你历尽沧桑，永葆天真模样　团购电话4006186622'),(2,'绝叫','58.00','页真中',34,175,'https://img11.360buyimg.com/n1/s200x200_jfs/t1/113898/29/12925/325059/5f17db6dEbdad9e47/c82f2900845461d5.jpg','我看过很多美丽洁白，而我没有自怜自艾的资格。灵魂只是一串化学反应，命运也不过是一场盛大的排列组合。如果优雅的啜泣被齿轮挤碎，那就听我声嘶力竭的绝叫吧！　团购电话4006186622'),(3,'底层逻辑','41.40','刘润',36,274,'https://img10.360buyimg.com/n1/s200x200_jfs/t1/165730/1/25199/100117/61541c60E3e231364/43c5470e7d6b92ec.jpg',NULL),(4,'数据结构与算法分析','56.90','(美)马克·艾伦·维斯',384,10002,'https://img14.360buyimg.com/n1/s200x200_jfs/t1897/55/2837612294/467469/83cd5b6/56f25c46Nc3b3c506.jpg',NULL),(5,'软件开发的201个原则','100.00','(美)Alan M.Davis',113,1047,'https://img13.360buyimg.com/n1/s200x200_jfs/t1/201833/38/12670/131953/61766895E9c1e2d1e/967d28a6f2a9ff1a.jpg',NULL),(6,'Java从入门到精通（第6版）','67.80','明日科技',321,1045,'https://img13.360buyimg.com/n1/s200x200_jfs/t1/186038/9/7947/120952/60bdd993E41eea7e2/48ab930455d7381b.jpg',NULL),(7,'需求分析与系统设计','59.00','麦斯阿塞克',34,2045,'https://img12.360buyimg.com/n1/s200x200_jfs/t1/128061/3/5498/396180/5ef010e6E8b050a99/d9ba00ff0828128a.jpg',NULL),(8,'IntelliJ IDEA 软件开发与应用','118.00','乔国辉',132,1457,'https://img10.360buyimg.com/n1/s200x200_jfs/t1/217328/28/2163/91571/617a4053E4dda99a9/318df0de59e0d681.jpg',NULL),(9,'C#从入门到精通','67.80','明日科技',341,10089,'https://img12.360buyimg.com/n1/s200x200_jfs/t1/46276/5/14137/115211/5db15fb1E6ad30faa/2adc277df915e3c1.jpg',NULL),(10,'Python3网络爬虫开发实战 第2版','69.80','崔庆才',243,10011,'https://img12.360buyimg.com/n1/s200x200_jfs/t1/210362/22/10450/129117/619dbb4cE08e5ecfd/f95e65a68ff66a30.jpg',NULL),(11,'Visual Studio Code 权威指南','99.00','韩俊',132,31233,'https://img11.360buyimg.com/n1/s200x200_jfs/t1/112723/5/11107/402868/5efad659Ef7c177df/781bed1730e281b9.jpg',NULL),(12,'鸿蒙操作系统开发入门经典','101.20','徐礼文',34,10082,'https://img12.360buyimg.com/n1/s200x200_jfs/t1/173843/10/20456/71916/60f51a56E695fb636/fb597488174a33f4.jpg',NULL),(13,'Visual C++ 从入门到精通','76.30','明日科技',13,10032,'https://img10.360buyimg.com/n1/s200x200_jfs/t1/122352/36/2210/120279/5ec38016E4b622c6b/d0263394da2fca97.jpg',NULL),(14,'Phthon从入门到项目实践（全彩版）','90.10','明日科技',333,123123,'https://img14.360buyimg.com/n1/s200x200_jfs/t1/203452/25/8493/130545/61517f8fE659e7bf7/ee254c4ec48d965b.jpg',NULL),(15,'C Primer Plus 第六版','79.00','人民出版社',100,232131,'https://img14.360buyimg.com/n1/s200x200_jfs/t1/101517/38/13595/119799/5e5cbf70Ebbba525e/b9b9bfd1b1aa07bb.jpg',NULL),(16,'天堂旅行团','48.00','张嘉佳',2121,10000,'https://img12.360buyimg.com/n1/s200x200_jfs/t1/122547/2/19448/160077/6145ac53E9c7336a8/9bfebc9ff020aba1.jpg',NULL),(17,'让我留在你身边','48.00','张嘉佳',2121,10000,'https://img11.360buyimg.com/n1/s200x200_jfs/t1/112968/14/14767/196018/5f3349e4E5d271272/36f19424a507315a.jpg',NULL),(18,'云边有个小卖部','42.00','张嘉佳',1273,10000,'https://img13.360buyimg.com/n1/s200x200_jfs/t1/110761/39/7788/139132/5eb21beeE55889b2d/4cdebd02206e01b8.jpg',NULL),(19,'从你的全世界路过','34.20','张嘉佳',2313,20000,'https://img10.360buyimg.com/n1/s200x200_jfs/t1/144189/22/5299/187496/5f35018eEd5fd587f/0145bfeea220204b.jpg',NULL),(20,'张嘉佳全三册','58.00','张嘉佳',1131,14000,'https://img12.360buyimg.com/n1/s200x200_jfs/t1/149419/28/9374/163991/5f7158aaE0533bd19/2311f2639b3a8670.jpg',NULL),(21,'挪威的森林','35.00','村上春树',1531,14500,'https://img12.360buyimg.com/n1/s200x200_jfs/t1/201076/24/8138/142436/614da0d7Eac565a9b/cac0efc9eb77637a.jpg',NULL),(22,'第一人才单数','39.99','村上春树',231,1000,'https://img14.360buyimg.com/n1/s200x200_jfs/t1/223041/23/3041/290710/619499c2E0d1bec70/c6bc36ca8c815b3a.jpg',NULL),(23,'绞河镇的最后一夜','51.80','村上春树',3221,10000,'https://img14.360buyimg.com/n7/jfs/t1/206292/8/8897/203975/61554833E48d7d336/4b6e91de1fc06b81.jpg',NULL),(24,'且听风吟','22.90','村上春树',231,1000,'https://img11.360buyimg.com/n1/s200x200_jfs/t21562/38/1728933700/235016/c8419b73/5b333158N5cfeb62a.jpg',NULL),(25,'白夜行','59.60','东野圭吾',231,1000,'https://img12.360buyimg.com/n1/s200x200_jfs/t1/91269/40/4460/177872/5de752b1E31d75313/f743f67287841841.jpg',NULL),(26,'嫌疑人X的献身','26.90','东野圭吾',321,12000,'https://img14.360buyimg.com/n1/s200x200_jfs/t1/102942/9/4517/174546/5de7543fEbcac4816/a8ab10807bf75a82.jpg',NULL),(27,'解忧杂货铺','59.00','东野圭吾',3221,12000,'https://img14.360buyimg.com/n1/s200x200_jfs/t1/141482/15/7240/549362/5f4c5e8eEbf0eb044/fcfa0b7da3acb19a.jpg',NULL),(28,'流星之绊','45.00','东野圭吾',321,1200,'https://img13.360buyimg.com/n1/s200x200_jfs/t5881/213/2033745445/1282126/65efd2f/592bf16cN650dceee.jpg',NULL),(29,'放学后','22.60','东野圭吾',3221,12300,'https://img13.360buyimg.com/n1/s200x200_jfs/t1/185793/10/2271/192904/6091a263E7364ccdf/0c94a229d9a5d61f.jpg',NULL),(30,'秘密','45.00','东野圭吾',3251,32300,'https://img10.360buyimg.com/n1/s200x200_jfs/t8023/249/2495169622/358200/8def2188/59cdf6deN491ebd9d.jpg',NULL);

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `order_id` varchar(50) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `price` decimal(11,2) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

/*Table structure for table `order_item` */

DROP TABLE IF EXISTS `order_item`;

CREATE TABLE `order_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `price` decimal(11,2) DEFAULT NULL,
  `total_price` decimal(11,2) DEFAULT NULL,
  `order_id` varchar(50) DEFAULT NULL,
  `img_path` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `order_item_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

/*Data for the table `order_item` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `email` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`u_id`,`username`,`password`,`email`) values (1,'admin','admin','admin@shoping.com'),(7,'admin1','admin1','admin1@shoping.com'),(8,'admin2','admin2','admin2@shoping.com'),(9,'admin3','admin3','admin3@shoping.com'),(13,'zhangziqi','qwer0723','2259292410@qq.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
