CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `provider_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ra_number` varchar(50),
  `provider_no` varchar(45) DEFAULT NULL,
  `hpio` varchar(45) DEFAULT NULL,
  `is_default` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

truncate table provider_details

INSERT INTO `provider_details` VALUES 
	(1,'11114343AS','11114343AS','433345465464564','N'),
	(2,'1111','11114343AS','435665465464564','N'),
	(3,'2222','12224343AS','34245465464564','N'),
	(4,'3333','1345114343AS','43335465464564','N'),
	(5,'3333','145614343AS','433323465464564','N'),
	(6,'3333','16544343AS','43337895464564','N')


select * from provider_details
