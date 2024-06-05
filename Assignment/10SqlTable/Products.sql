USE assignment;
CREATE TABLE Products (
    ProductID INT PRIMARY KEY AUTO_INCREMENT,
    ProductName VARCHAR(100) NOT NULL,
    Category VARCHAR(50) NOT NULL,
    Price DECIMAL(10, 2) CHECK (Price >= 0) NOT NULL,
    Stock INT CHECK (Stock >= 0) NOT NULL,
    Description TEXT,
    Manufacturer VARCHAR(100) NOT NULL,
    WarrantyPeriod INT,
    created_by INT NOT NULL,
    updated_by INT NOT NULL,
    created_at TIMESTAMP NOT NULL ,
    updated_at TIMESTAMP NOT NULL
);