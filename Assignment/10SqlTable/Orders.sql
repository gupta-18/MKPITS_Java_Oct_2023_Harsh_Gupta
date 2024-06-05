
USE assignment;
CREATE TABLE Orders (
    OrderID INT PRIMARY KEY AUTO_INCREMENT,
    CustomerID INT,
    OrderDate DATE NOT NULL,
    TotalAmount DECIMAL(10, 2) CHECK (TotalAmount >= 0) NOT NULL,
    ShippingAddress VARCHAR(100) NOT NULL,
    ShippingCity VARCHAR(40) NOT NULL,
    ShippingState VARCHAR(50) NOT NULL,
    ShippingPinCode VARCHAR(10) NOT NULL,
    ShippingCountry VARCHAR(50) NOT NULL, 
    created_by INT NOT NULL,
    updated_by INT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL
);
