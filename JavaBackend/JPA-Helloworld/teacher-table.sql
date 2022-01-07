DROP database IF EXISTS `jpa_JBD`;

CREATE database IF NOT EXISTS `jpa_JBD`;
use `jpa_JBD`;

CREATE TABLE `TEACHER` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TeacherName` varchar(45) DEFAULT NULL,
  `Subject` varchar(45) DEFAULT NULL,
  `Degree` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `TEACHER`(`ID`,`TeacherName`,`Subject`,`Degree`) VALUES (1,'Jayanta','JAVA BACKEND','PHD');
