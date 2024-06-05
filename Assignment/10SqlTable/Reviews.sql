USE assignment;
CREATE TABLE Reviews (
    ReviewID INT PRIMARY KEY AUTO_INCREMENT,
    ProductID INT NOT NULL,
    CustomerID INT NOT NULL,
    Rating INT CHECK (Rating BETWEEN 1 AND 5) NOT NULL,
    ReviewText TEXT,
    ReviewDate DATE NOT NULL,
     created_by INT NOT NULL,
    updated_by INT NOT NULL,
    created_at TIMESTAMP  NOT NULL,
    updated_at TIMESTAMP NOT NULL
);
