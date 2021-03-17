CREATE SCHEMA `vacation` ;
CREATE TABLE `vacation`.`vacation_detail` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  `from_date` VARCHAR(100) NULL,
  `to_date` VARCHAR(100) NULL,
  `type` VARCHAR(100) NULL,
  PRIMARY KEY (`id`));
