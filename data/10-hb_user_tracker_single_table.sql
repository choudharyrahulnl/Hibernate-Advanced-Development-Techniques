DROP DATABASE IF EXISTS `hb_student_tracker_advance`;
CREATE DATABASE  IF NOT EXISTS `hb_student_tracker_advance`;
USE `hb_student_tracker_advance`;
--
-- Table structure for tables `student` and `image`
--

SET foreign_key_checks = 0;

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `course` varchar(255) DEFAULT NULL,
  `salary` DOUBLE DEFAULT NULL,
  `USER_TYPE` varchar(31) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

SET foreign_key_checks = 1;