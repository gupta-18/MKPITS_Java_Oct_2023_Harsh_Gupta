CREATE TABLE `bank`.`accounts` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `account_type` VARCHAR(20) NOT NULL,
  `rate_of_interest` DECIMAL(5,2)   Not NULL DEFAULT 0.0 ,
  `balance` DECIMAL(15.2) NOT NULL,
  `created_by` INT NULL,
  `created_at` DATETIME NULL,
  `updated_by` INT NULL,
  `updated_at` DATETIME NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC) VISIBLE,
  INDEX `Acc_Users_FK_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `Acc_Users_FK`
    FOREIGN KEY (`user_id`)
    REFERENCES `bank`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);