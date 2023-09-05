-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 01 Sep 2023 pada 02.29
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jv_quiz`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tablequiz`
--

CREATE TABLE `tablequiz` (
  `NoCustemer` varchar(25) NOT NULL,
  `Nama` varchar(25) NOT NULL,
  `Dari` varchar(25) NOT NULL,
  `Tujuan` varchar(25) NOT NULL,
  `Jarak` varchar(25) NOT NULL,
  `Harga` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tablequiz`
--

INSERT INTO `tablequiz` (`NoCustemer`, `Nama`, `Dari`, `Tujuan`, `Jarak`, `Harga`) VALUES
('01', 'Samsudin', 'Tangerang', 'Serang', '4', '10000'),
('02', 'Ratih', 'Cilegon', 'Serang', '2', '10000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
