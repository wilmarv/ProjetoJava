-- MySQL Workbench Forward Engineering
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
-- -----------------------------------------------------
-- Schema agendagrupo
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema agendagrupo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `agendagrupo` DEFAULT CHARACTER SET utf8 ;
USE `agendagrupo` ;
-- -----------------------------------------------------
-- Table `agendagrupo`.`guild`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agendagrupo`.`guild` (
  `Nome` VARCHAR(10) NOT NULL,
  `Leader` VARCHAR(10) NOT NULL,
  `server` VARCHAR(10) NOT NULL,
  `grupos` INT NULL DEFAULT '0',
  PRIMARY KEY (`Nome`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
-- -----------------------------------------------------
-- Table `agendagrupo`.`grupos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agendagrupo`.`grupos` (
  `Nome` VARCHAR(10) NOT NULL,
  `Guild_Nome` VARCHAR(10) NOT NULL,
  `tipo` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`Nome`),
  INDEX `fk_Grupos_Guild_idx` (`Guild_Nome` ASC) VISIBLE,
  CONSTRAINT `fk_Grupos_Guild`
    FOREIGN KEY (`Guild_Nome`)
    REFERENCES `agendagrupo`.`guild` (`Nome`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
-- -----------------------------------------------------
-- Table `agendagrupo`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agendagrupo`.`player` (
  `Nick` VARCHAR(10) NOT NULL,
  `ILVL` INT NOT NULL,
  `AtributoPrimario` INT NOT NULL,
  `AcertoCritico` INT NOT NULL,
  `Maestria` INT NOT NULL,
  `Aceleracao` INT NOT NULL,
  `funcao` VARCHAR(10) NULL,
  `classe` VARCHAR(10) NULL,
  `grupos_Nome` VARCHAR(10) NOT NULL,
  `raca`VARCHAR(10) NULL,
  PRIMARY KEY (`Nick`),
  INDEX `fk_player_grupos1_idx` (`grupos_Nome` ASC) VISIBLE,
  CONSTRAINT `fk_player_grupos1`
    FOREIGN KEY (`grupos_Nome`)
    REFERENCES `agendagrupo`.`grupos` (`Nome`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
-- -----------------------------------------------------
-- Table `agendagrupo`.`pesquisa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agendagrupo`.`pesquisa` (
  `Nome` VARCHAR(10) NULL,
  `idpe` INT NOT NULL,
  PRIMARY KEY (`idpe`))
ENGINE = InnoDB;
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
INSERT INTO `agendagrupo`.`pesquisa` (`Nome`, `idpe`) VALUES ('ini', '1');
INSERT INTO `agendagrupo`.`pesquisa` (`Nome`, `idpe`) VALUES ('ini', '2');