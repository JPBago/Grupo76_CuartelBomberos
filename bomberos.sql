-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:44:54
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberos`
--
CREATE DATABASE IF NOT EXISTS `bomberos` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bomberos`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `codBombero` int(11) NOT NULL,
  `DNI` int(8) NOT NULL,
  `nombreApe` varchar(50) NOT NULL,
  `grupoSang` varchar(5) NOT NULL,
  `fechaNac` date NOT NULL,
  `celular` bigint(10) NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`codBombero`, `DNI`, `nombreApe`, `grupoSang`, `fechaNac`, `celular`, `codBrigada`, `activo`) VALUES
(2, 40588238, 'Perez, Jaime', '(A+)', '2023-10-04', 3816200440, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bridaga`
--

CREATE TABLE `bridaga` (
  `codBrigada` int(11) NOT NULL,
  `nombreBrig` varchar(20) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `codCuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `bridaga`
--

INSERT INTO `bridaga` (`codBrigada`, `nombreBrig`, `especialidad`, `libre`, `codCuartel`) VALUES
(1, 'Alpha', 'Incendios', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `codCuartel` int(11) NOT NULL,
  `nombreCuartel` varchar(40) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_X` double NOT NULL,
  `coord_Y` double NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombreCuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `email`) VALUES
(1, 'Bomberos Voluntarios de Yerba Buena', ' José Ignacio Thames y Perú', -26.807350037502317, -65.29288883443192, '3814252670', 'bomberosvoluntariosyb@hotmail.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `cod_siniestro` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fechaSinietro` date NOT NULL,
  `coord_X` double NOT NULL,
  `coord_Y` double NOT NULL,
  `detalles` text NOT NULL,
  `fechaResoluc` date NOT NULL,
  `puntuacion` tinyint(4) NOT NULL,
  `codBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`codBombero`),
  ADD UNIQUE KEY `DNI` (`DNI`),
  ADD KEY `bombero_ibfk_1` (`codBrigada`);

--
-- Indices de la tabla `bridaga`
--
ALTER TABLE `bridaga`
  ADD PRIMARY KEY (`codBrigada`),
  ADD KEY `codCuartel` (`codCuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`cod_siniestro`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `codBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `bridaga`
--
ALTER TABLE `bridaga`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `cod_siniestro` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `bridaga` (`codBrigada`);

--
-- Filtros para la tabla `bridaga`
--
ALTER TABLE `bridaga`
  ADD CONSTRAINT `bridaga_ibfk_1` FOREIGN KEY (`codCuartel`) REFERENCES `cuartel` (`codCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `bridaga` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
