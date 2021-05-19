-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2021 at 02:30 PM
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpus_desktop`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `idAnggota` int(11) NOT NULL,
  `namaAnggota` varchar(50) NOT NULL,
  `noTelp` varchar(30) NOT NULL,
  `jenisKelamin` enum('laki laki','perempuan') NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`idAnggota`, `namaAnggota`, `noTelp`, `jenisKelamin`, `alamat`) VALUES
(1, 'Agung', '0812345678', 'laki laki', 'Bekasi'),
(2, 'towbot', '0832147321', 'laki laki', 'Karawang'),
(3, 'iqbal', '081535689874', 'laki laki', 'Karawang'),
(4, 'Adit', '081232146547', 'laki laki', 'Bekasi'),
(5, 'Luxan', '087978451236', 'laki laki', 'Bandung');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `idBuku` int(11) NOT NULL,
  `judulBuku` varchar(50) NOT NULL,
  `pengarang` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `tahun` int(5) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`idBuku`, `judulBuku`, `pengarang`, `penerbit`, `tahun`, `stok`) VALUES
(1, 'Bintang Kehidupan', 'Agung', 'Pustaka Media', 2021, 12),
(2, 'Bumi', 'Tere Liye', 'Media Pustaka', 2015, 40),
(3, 'Koala Kumal', 'Raditya Dika', 'FC Depan UNSIKA', 2018, 98),
(4, 'Sangkuriang', 'Aditya', 'FC Depan UBP', 2020, 48);

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `idPeminjaman` int(11) NOT NULL,
  `idAnggota` int(11) NOT NULL,
  `idBuku` int(11) NOT NULL,
  `tglPinjam` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `jumlah` int(20) NOT NULL,
  `statusPinjam` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`idPeminjaman`, `idAnggota`, `idBuku`, `tglPinjam`, `jumlah`, `statusPinjam`) VALUES
(1, 5, 4, '2021-01-08 15:31:36', 1, 'dikembalikan'),
(2, 2, 4, '2021-01-08 19:31:29', 1, 'dipinjam'),
(3, 3, 1, '2021-01-08 19:44:07', 1, 'dikembalikan'),
(4, 1, 3, '2021-01-08 20:54:42', 1, 'dipinjam');

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE `pengembalian` (
  `idPengembalian` int(11) NOT NULL,
  `idPeminjaman` int(11) NOT NULL,
  `idAnggota` int(11) NOT NULL,
  `idBuku` int(11) NOT NULL,
  `tglPengembalian` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `statusPengembalian` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengembalian`
--

INSERT INTO `pengembalian` (`idPengembalian`, `idPeminjaman`, `idAnggota`, `idBuku`, `tglPengembalian`, `statusPengembalian`) VALUES
(1, 1, 5, 4, '2021-01-08 15:44:52', 'dikembalikan'),
(2, 3, 3, 1, '2021-01-12 20:28:17', 'dikembalikan');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `idUser` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `level` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`idUser`, `username`, `password`, `level`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'pegawai1', 'pegawai1', 'pegawai');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`idAnggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`idBuku`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`idPeminjaman`),
  ADD KEY `idAnggota` (`idAnggota`,`idBuku`),
  ADD KEY `idBuku` (`idBuku`);

--
-- Indexes for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`idPengembalian`),
  ADD KEY `idPeminjaman` (`idPeminjaman`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anggota`
--
ALTER TABLE `anggota`
  MODIFY `idAnggota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `idBuku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `idPeminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pengembalian`
--
ALTER TABLE `pengembalian`
  MODIFY `idPengembalian` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`idBuku`) REFERENCES `buku` (`idBuku`),
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`idAnggota`) REFERENCES `anggota` (`idAnggota`);

--
-- Constraints for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD CONSTRAINT `pengembalian_ibfk_1` FOREIGN KEY (`idPeminjaman`) REFERENCES `peminjaman` (`idPeminjaman`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
