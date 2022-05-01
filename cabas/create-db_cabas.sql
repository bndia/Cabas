DROP SCHEMA IF EXISTS `cabas`;

CREATE SCHEMA `cabas`;

use `cabas`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `area`;

CREATE TABLE `area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `area_no` varchar(128) DEFAULT NULL, 
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `area_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `NAME_UNIQUE` (`name`),
  KEY `FK_AREA_idx` (`area_id`),
  CONSTRAINT `FK_AREA` FOREIGN KEY (`area_id`) 
  REFERENCES `area` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `citizen`;

CREATE TABLE `citizen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(128) DEFAULT NULL,
  `last_name` varchar(128) DEFAULT NULL,
  `phone` varchar(128) DEFAULT NULL,
  `guardian_id` int(11) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  
  PRIMARY KEY (`id`),
  
  KEY `FK_CITY_idx` (`city_id`),
  
  CONSTRAINT `FK_CITY` 
  FOREIGN KEY (`city_id`) 
  REFERENCES `city` (`id`) 
  
  ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;


SET FOREIGN_KEY_CHECKS = 1;
