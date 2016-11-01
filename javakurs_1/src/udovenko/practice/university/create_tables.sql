CREATE TABLE `student` (
    `st_id` INT(5) NOT NULL AUTO_INCREMENT,
    `fname` VARCHAR(50) NOT NULL,
    `lname` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`st_id`),
    INDEX (`lname`)
);
CREATE TABLE `lecture` (
    `lc_id` INT(5) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL,
    `lname_lect` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`lc_id`),
    INDEX (`name`)
);
CREATE TABLE `register` (
    `reg_id` INT(5) NOT NULL AUTO_INCREMENT,
    `date` DATE NOT NULL,
    `lecture` INT(5) NOT NULL,
    `student` INT(5) NOT NULL,
    PRIMARY KEY (`reg_id`)
);