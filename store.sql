-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2019 at 05:09 AM
-- Server version: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `store`
--

-- --------------------------------------------------------

--
-- Table structure for table `besoin`
--

CREATE TABLE `besoin` (
  `id_besoin` int(11) NOT NULL,
  `categorie` varchar(255) NOT NULL,
  `description` varchar(55) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bl`
--

CREATE TABLE `bl` (
  `id_bl` int(11) NOT NULL,
  `id_logiciel` int(11) DEFAULT NULL,
  `id_besion` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `logiciel`
--

CREATE TABLE `logiciel` (
  `id_logiciel` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `version` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ub`
--

CREATE TABLE `ub` (
  `cat_id` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_besoin` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ul`
--

CREATE TABLE `ul` (
  `id_ub` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_logiciel` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `isAdmin` tinyint(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `besoin`
--
ALTER TABLE `besoin`
  ADD PRIMARY KEY (`id_besoin`);

--
-- Indexes for table `bl`
--
ALTER TABLE `bl`
  ADD PRIMARY KEY (`id_bl`),
  ADD KEY `id_logiciel` (`id_logiciel`),
  ADD KEY `id_besion` (`id_besion`);

--
-- Indexes for table `logiciel`
--
ALTER TABLE `logiciel`
  ADD PRIMARY KEY (`id_logiciel`);

--
-- Indexes for table `ub`
--
ALTER TABLE `ub`
  ADD PRIMARY KEY (`cat_id`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_besoin` (`id_besoin`);

--
-- Indexes for table `ul`
--
ALTER TABLE `ul`
  ADD PRIMARY KEY (`id_ub`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_logiciel` (`id_logiciel`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `besoin`
--
ALTER TABLE `besoin`
  MODIFY `id_besoin` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `logiciel`
--
ALTER TABLE `logiciel`
  MODIFY `id_logiciel` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
