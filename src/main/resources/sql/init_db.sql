-- --------------------------------------------------------
-- Hôte:                         127.0.0.1
-- Version du serveur:           8.0.33 - MySQL Community Server - GPL
-- SE du serveur:                Linux
-- HeidiSQL Version:             12.4.0.6659
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Listage de la structure de la base pour db_spring_app
DROP DATABASE IF EXISTS `db_spring_app`;
CREATE DATABASE IF NOT EXISTS `db_spring_app` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_spring_app`;

-- Listage de la structure de la table db_spring_app. comment
DROP TABLE IF EXISTS `comment`;
CREATE TABLE IF NOT EXISTS `comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL DEFAULT '0',
  `post_id` int NOT NULL DEFAULT '0',
  `content` varchar(255) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_COMMENT_1` (`user_id`),
  KEY `FK_COMMENT_2` (`post_id`),
  CONSTRAINT `FK_COMMENT_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_COMMENT_2` FOREIGN KEY (`post_id`) REFERENCES `post` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table db_spring_app. comment_seq
DROP TABLE IF EXISTS `comment_seq`;
CREATE TABLE IF NOT EXISTS `comment_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table db_spring_app. post
DROP TABLE IF EXISTS `post`;
CREATE TABLE IF NOT EXISTS `post` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL DEFAULT '0',
  `content` varchar(255) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_POST_1` (`user_id`),
  CONSTRAINT `FK_POST_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table db_spring_app. post_seq
DROP TABLE IF EXISTS `post_seq`;
CREATE TABLE IF NOT EXISTS `post_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table db_spring_app. user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `family_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` tinyint DEFAULT NULL,
  `birthdate` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table db_spring_app. user_liked_comment
DROP TABLE IF EXISTS `user_liked_comment`;
CREATE TABLE IF NOT EXISTS `user_liked_comment` (
  `user_id` int NOT NULL,
  `comment_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`comment_id`),
  KEY `FK__comment` (`comment_id`),
  CONSTRAINT `FK__comment` FOREIGN KEY (`comment_id`) REFERENCES `comment` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK__user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table db_spring_app. user_liked_post
DROP TABLE IF EXISTS `user_liked_post`;
CREATE TABLE IF NOT EXISTS `user_liked_post` (
  `user_id` int NOT NULL,
  `post_id` int NOT NULL,
  `comment_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`post_id`),
  KEY `FKf67xtc56g5ym5wpcf50x5ydcp` (`post_id`),
  KEY `FK8h99qarit777rhun8ifl21j9q` (`comment_id`),
  CONSTRAINT `FK1nv6djguugbefk6889cmmtcj5` FOREIGN KEY (`user_id`) REFERENCES `post` (`id`),
  CONSTRAINT `FK8h99qarit777rhun8ifl21j9q` FOREIGN KEY (`comment_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FK_liked_post` FOREIGN KEY (`post_id`) REFERENCES `post` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_liked_post_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FKf67xtc56g5ym5wpcf50x5ydcp` FOREIGN KEY (`post_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table db_spring_app. user_liked_user
DROP TABLE IF EXISTS `user_liked_user`;
CREATE TABLE IF NOT EXISTS `user_liked_user` (
  `user_id` int NOT NULL,
  `liked_user_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`liked_user_id`),
  KEY `FK_liked_user` (`liked_user_id`),
  CONSTRAINT `FK_liked_user` FOREIGN KEY (`liked_user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_liked_user_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table db_spring_app. user_seq
DROP TABLE IF EXISTS `user_seq`;
CREATE TABLE IF NOT EXISTS `user_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Les données exportées n'étaient pas sélectionnées.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
