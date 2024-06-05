create database assignment;
USE assignment;
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(30) NOT NULL,
    LastName VARCHAR(30) NOT NULL,
    Email VARCHAR(50) UNIQUE NOT NULL,
    PhoneNumber VARCHAR(10) NOT NULL,
    Address VARCHAR(100) ,
    City VARCHAR(50),
    State VARCHAR(50),
    PinCode VARCHAR(10),
    Country VARCHAR(30),
    DateOfBirth DATE,
    created_by INT NOT NULL,
    updated_by INT NOT NULL,
    created_at TIMESTAMP NOT NULL ,
    updated_at TIMESTAMP NOT NULL
);
