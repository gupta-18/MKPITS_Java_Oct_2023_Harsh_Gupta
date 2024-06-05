USE assignment;
CREATE TABLE Payments (
    PaymentID INT PRIMARY KEY AUTO_INCREMENT,
    OrderID INT NOT NULL,
    PaymentDate DATE NOT NULL,
    PaymentAmount DECIMAL(10, 2) CHECK (PaymentAmount >= 0) NOT NULL,
    PaymentMethod VARCHAR(10) NOT NULL,
    PaymentStatus VARCHAR(10),
    TransactionID VARCHAR(18)NOT NULL,
    CardNumber VARCHAR(16),
    CardType VARCHAR(20),
	created_by INT NOT NULL,
    updated_by INT NOT NULL,
    created_at TIMESTAMP  NOT NULL,
    updated_at TIMESTAMP NOT NULL
);
