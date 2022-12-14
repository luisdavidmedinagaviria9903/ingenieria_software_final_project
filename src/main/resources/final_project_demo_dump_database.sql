-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: final_project_demo
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `condiciones_salud`
--

DROP TABLE IF EXISTS `condiciones_salud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `condiciones_salud` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `user` bigint(255) NOT NULL,
  `sickness_code` varchar(45) NOT NULL,
  `creation_date` datetime(6) DEFAULT sysdate(),
  `is_family` tinyint(1) DEFAULT 0,
  UNIQUE KEY `auto id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `condiciones_salud`
--

LOCK TABLES `condiciones_salud` WRITE;
/*!40000 ALTER TABLE `condiciones_salud` DISABLE KEYS */;
/*!40000 ALTER TABLE `condiciones_salud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sickness`
--

DROP TABLE IF EXISTS `sickness`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sickness` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sickness`
--

LOCK TABLES `sickness` WRITE;
/*!40000 ALTER TABLE `sickness` DISABLE KEYS */;
INSERT INTO `sickness` VALUES (0,'Otro'),(1,'Hipertension'),(2,'Diabetes'),(3,'Asma');
/*!40000 ALTER TABLE `sickness` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT COMMENT 'user unique id',
  `email` varchar(255) DEFAULT NULL COMMENT 'user email',
  `user_full_name` varchar(255) DEFAULT NULL COMMENT 'user name',
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  UNIQUE KEY `id_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (3,'lmedina@yopmail.com','Luis medina','$2a$10$ufW7T2G7sHGepQDp1VoRDukndvTnUi47cpf6Cvy1ySbnbRnTCFBU2','ldamedina'),(4,'lmedina1@yopmail.com','Luis medina 1','$2a$10$SJX78vQkIIALw9GanFRLDes7l8BT3V3eoUuCQrTV0qGOfpdLpUlzG','ldamedina1'),(5,'lmedina123@yopmail.com','Luis Medina','$2a$10$J1vFQEtM6qgludDuql2afe7KtrkT9DqBM66DyBWuBepijlQGf/DAC','ldamedina'),(6,'lmedina12345@yopmail.com','Luis Medina G','$2a$10$sBBk9OK5KoZwopSfuzlTNOQ6suM/sRlFWJylgWjbv8Szmcq1DB1Ju','ldamedina'),(7,'lmedina123456@yopmail.com','luis medina 123456','$2a$10$bDta4p/4iqbI3AoX0IC8suwRd84tVq4jxR2ObmWPk7S1Xsae01cva','lmedina123456'),(8,'lmedina99@yopmail.com','luis medina gaviria','$2a$10$moivQ4gT7O0whQnWYaXDxesac0WWS.JGVx2c.VaLKJVOAzWSKfspG','ldamedina99');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_family`
--

DROP TABLE IF EXISTS `user_family`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_family` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_family`
--

LOCK TABLES `user_family` WRITE;
/*!40000 ALTER TABLE `user_family` DISABLE KEYS */;
INSERT INTO `user_family` VALUES (1,3,'daniela blanco','dblanco@yopmail.com','3153153153');
/*!40000 ALTER TABLE `user_family` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-11  2:22:39
