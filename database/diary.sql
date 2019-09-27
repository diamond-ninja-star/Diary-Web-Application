-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 31, 2018 at 06:58 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `diary`
--
CREATE DATABASE IF NOT EXISTS `diary` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `diary`;

-- --------------------------------------------------------

--
-- Table structure for table `adminpanel`
--

CREATE TABLE `adminpanel` (
  `id` int(11) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminpanel`
--

INSERT INTO `adminpanel` (`id`, `password`) VALUES
(1, '1'),
(2, '2'),
(23, '25'),
(23, '25');

-- --------------------------------------------------------

--
-- Table structure for table `memory`
--

CREATE TABLE `memory` (
  `id` int(11) DEFAULT NULL,
  `edate` varchar(100) DEFAULT NULL,
  `subject` varchar(100) DEFAULT NULL,
  `place` varchar(50) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `memory`
--

INSERT INTO `memory` (`id`, `edate`, `subject`, `place`, `description`) VALUES
(1, '2/8/13', 'new phone', 'tejgaon', 'Joy gave me a new phone on my birthday, Nokia 1100 . It has nice flashlight'),
(2, '3/4/17', 'phone repaired', 'uttara', 'Changed my phone glass and added new cover . Now it looks nice'),
(3, '5/9/18', 'meeting', 'khilgaon', 'Meeting with our project members about new features and project proposal'),
(4, '2/3/17', 'Tours', 'CHITTAGONG', 'Cox bazar is very beautiful'),
(45, '45', '45', '45', '45');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
