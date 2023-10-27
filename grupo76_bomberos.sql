-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 23:43:56
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
-- Base de datos: `grupo76_bomberos`
--
CREATE DATABASE IF NOT EXISTS `grupo76_bomberos` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `grupo76_bomberos`;

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
  `celular` varchar(11) NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`codBombero`, `DNI`, `nombreApe`, `grupoSang`, `fechaNac`, `celular`, `codBrigada`, `activo`) VALUES
(2, 40588238, 'Perez, Jaime', '(A+)', '2023-10-04', '381-6200440', 1, 1),
(6, 32554661, 'Pablo Gomez', '(O+)', '2023-06-23', '11-31326198', 2, 1),
(7, 31107911, 'JuanPablo Bago', '(O+)', '1985-08-10', '381-5500107', 3, 0),
(11, 35911107, 'Evelyn Diaz', '(B+)', '1992-03-29', '343-4659881', 4, 1),
(12, 17547376, 'Claudia Szelest', '(A-)', '1965-10-09', '11-61680379', 2, 1),
(13, 50145674, 'Thomas Gomez', '(O-)', '2010-03-13', '11-68589148', 2, 1);

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
(1, 'Alpha', 'Incendios', 1, 1),
(2, 'Alfa', 'Rescates_de_Trafico', 1, 1),
(3, 'Beta', 'Incendios', 1, 2),
(4, 'Charly', 'Rescate_en_derrumbes', 1, 3),
(5, 'Charly', 'Inundaciones', 0, 1),
(6, 'Bravo', 'Rescates_de_Montaña', 1, 1);

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
  `telefono` varchar(11) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombreCuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `email`) VALUES
(1, 'Bomberos Voluntarios de Yerba Buena', ' José Ignacio Thames y Perú', -26.807350037502317, -65.29288883443192, '381-4252670', 'bomberosvoluntariosyb@hotmail.com'),
(2, 'Bomberos Voluntarios', 'Av. San Martín 1107,Adrogue', -34.802958974133006, -58.38684081026497, '11-4294222', 'altebrownbomberos@hotmail.com'),
(3, 'Bomberos Voluntarios', 'Luis María Drago 2107, Burzaco', -34.841756365593376, -58.413866979480936, '11-42380703', 'altebrownbomberos@hotmail.com'),
(4, 'Sociedad de Bomberos', 'Av. Hipólito Yrigoyen 18371, L', -34.860449008143206, -58.38981913629471, '11-42942222', 'altebrownbomberos@hotmail.com'),
(5, 'Marco Licinio Craso', 'Avenida Lacaze Crispi', -34.80709108395119, -58.340781582065674, '11-42912500', 'pablitopdg@gmail.com.ar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `cod_siniestro` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fechaSinietro` datetime NOT NULL,
  `coord_X` double NOT NULL,
  `coord_Y` double NOT NULL,
  `detalles` text NOT NULL,
  `fechaResoluc` date NOT NULL,
  `puntuacion` tinyint(4) NOT NULL,
  `codBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`cod_siniestro`, `tipo`, `fechaSinietro`, `coord_X`, `coord_Y`, `detalles`, `fechaResoluc`, `puntuacion`, `codBrigada`) VALUES
(2, 'Incendios', '2023-10-01 00:00:00', -62, -20, 'Incendio en residencia precaria.', '2023-10-31', 3, 1),
(3, 'Rescates_de_Trafico', '2023-10-12 02:39:22', -34.841756365593376, -58.340781582065674, 'Accidente de trafico en calle de una sola mano. Posibles heridos mortales.', '0000-00-00', 0, 2),
(4, 'Rescate_en_derrumbes', '2023-10-12 02:41:33', -58.340781582065674, -96.35628656358546, 'Derrumbe en alta montaña', '0000-00-00', 0, 4),
(5, 'Incendios', '2023-10-12 02:45:49', -5.623, -63.25638, 'ASDADASDad', '0000-00-00', 0, 1),
(6, 'Rescates_de_Trafico', '2023-10-19 16:01:02', -2.365683, -3.23156465465, 'Accidente en moto.', '2023-10-12', 8, 2),
(7, 'Incendios', '2023-10-10 11:25:24', -63, 56, 'Incendio en alguna parte del país.', '0000-00-00', 0, 3),
(8, 'Incendios', '2023-10-18 21:00:47', -26, -5, 'Fuego', '2023-10-19', 9, 3),
(9, 'Inundaciones', '2023-10-19 21:43:21', -63.123456, -2.15623, 'Desborde del Río Seco.', '0000-00-00', 0, 5),
(10, 'Incendios', '2023-10-01 19:49:32', -26.356, -65.326, 'Incendio', '2023-10-04', 8, 3);

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
  MODIFY `codBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `bridaga`
--
ALTER TABLE `bridaga`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `cod_siniestro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

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
