USE assignment;
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    PhoneNumber VARCHAR(10),
    HireDate DATE NOT NULL,
    JobTitle VARCHAR(50),
    DepartmentID INT,
    Salary DECIMAL(10, 2) CHECK (Salary > 0),
    ManagerID INT, 
    created_by INT NOT NULL,
    updated_by INT NOT NULL,
    created_at TIMESTAMP  NOT NULL,
    updated_at TIMESTAMP NOT NULL
);
