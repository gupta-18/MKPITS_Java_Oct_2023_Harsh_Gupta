
USE assignment;
CREATE TABLE Suppliers (
    SupplierID INT PRIMARY KEY AUTO_INCREMENT,
    SupplierName VARCHAR(30) NOT NULL,
    ContactEmail VARCHAR(40) NOT NULL,
    PhoneNumber VARCHAR(10) NOT NULL,
    Address VARCHAR(100)NOT NULL,
    City VARCHAR(50),
    State VARCHAR(50),
    PinCode VARCHAR(10),
    Country VARCHAR(50),
    created_by INT NOT NULL,
    updated_by INT NOT NULL,
    created_at TIMESTAMP  NOT NULL,
    updated_at TIMESTAMP NOT NULL
);