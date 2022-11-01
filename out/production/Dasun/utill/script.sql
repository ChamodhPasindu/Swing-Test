CREATE DATABASE IF NOT EXISTS Dasun;
USE Dasun;
CREATE TABLE IF NOT EXISTS employee(
    empID INT NOT NULL AUTO_INCREMENT,
    nic VARCHAR (15),
    name VARCHAR (255),
    phone VARCHAR (20),
    email VARCHAR (50),
    address VARCHAR (255),
    jobRole VARCHAR (50),
    CONSTRAINT PRIMARY KEY (empID)
    );

CREATE TABLE IF NOT EXISTS jobRole(
    jobID INT NOT NULL AUTO_INCREMENT,
    jobRole VARCHAR(50),
    CONSTRAINT PRIMARY KEY (jobID)
    );

CREATE TABLE IF NOT EXISTS salary(
    salaryID INT NOT NULL AUTO_INCREMENT,
    empID INT,
    otHours INT ,
    otRate INT,
    date VARCHAR (100),
    basic DECIMAL(8,2),
    total DECIMAL (8,2),
    CONSTRAINT PRIMARY KEY (salaryID),
    CONSTRAINT FOREIGN KEY (empID) REFERENCES employee (empID) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS account(
    accountID INT NOT NULL AUTO_INCREMENT,
    username VARCHAR (50),
    password VARCHAR (50),
    role VARCHAR (50),
    CONSTRAINT PRIMARY KEY (accountID)
);

INSERT INTO account VALUES(1,"admin","admin1234","Admin")
