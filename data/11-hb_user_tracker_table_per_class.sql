DROP DATABASE IF EXISTS `hb_student_tracker_advance`;
CREATE DATABASE  IF NOT EXISTS `hb_student_tracker_advance`;
USE `hb_student_tracker_advance`;
--
-- Table structure for tables `student` and `image`
--

SET foreign_key_checks = 0;

DROP TABLE IF EXISTS `user`;

create table learner
(
    id         int          not null
        primary key,
    email      varchar(45)  null,
    first_name varchar(45)  null,
    last_name  varchar(45)  null,
    course     varchar(255) null,
    constraint UK_ju0lseiik9kbo10wh7wxvtrsm
        unique (email)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

create table instructor
(
    id         int         not null
        primary key,
    email      varchar(45) null,
    first_name varchar(45) null,
    last_name  varchar(45) null,
    salary     double      null,
    constraint UK_h23sspwe1nutb1hkq9rvyh8h8
        unique (email)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;;



SET foreign_key_checks = 1;