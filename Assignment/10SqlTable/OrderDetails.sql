USE assignment;
CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY AUTO_INCREMENT,
    OrderID INT NOT NULL,
    ProductID INT NOT NULL,
    Quantity INT CHECK (Quantity > 0) NOT NULL,
    Price DECIMAL(10, 2) CHECK (Price >= 0) NOT NULL,
    ShippingMethod VARCHAR(20),
    ShipmentDate DATE,
    DeliveryDate DATE,
    created_by INT NOT NULL,
    updated_by INT NOT NULL,
    created_at TIMESTAMP  NOT NULL,
    updated_at TIMESTAMP NOT NULL
);
