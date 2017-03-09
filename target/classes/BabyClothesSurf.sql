-- Adminer 4.2.5 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP TABLE IF EXISTS `dresses`;
CREATE TABLE `dresses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `size` varchar(10) NOT NULL,
  `age` varchar(10) NOT NULL,
  `files` varchar(5000) NOT NULL COMMENT 'usato salvare i possibili files con le foto dei vestiti...',
  `colour` varchar(100) NOT NULL,
  `matherial` varchar(100) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `messages`;
CREATE TABLE `messages` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `message` varchar(100) NOT NULL,
  `has_been_read` tinyint(1) unsigned NOT NULL COMMENT ' 	usato per mostrare quanti messaggi vi sono da leggere',
  `from_userid` int(11) unsigned NOT NULL,
  `to_userid` int(11) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `role` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `active` tinyint(1) unsigned NOT NULL COMMENT 'usato per forzare una validazione',
  `action` varchar(50) NOT NULL COMMENT 'usato per rendere sicure azioni quali validazione, cancellazione...',
  `role` int(11) unsigned NOT NULL COMMENT 'usato per dare ruoli e quindi permessi differenti agli utenti',
  `citta` varchar(200) DEFAULT NULL,
  `provincia` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- 2017-03-09 15:53:33
