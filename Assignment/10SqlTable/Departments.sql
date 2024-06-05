USE assignment;
CREATE TABLE Departments (
    DepartmentNumber INT PRIMARY KEY AUTO_INCREMENT ,
    DepartmentName VARCHAR(100) NOT NULL,
    ManagerID INT NOT NULL,
    CreatedDate DATE NOT NULL,
    NumberOfEmployees INT CHECK (NumberOfEmployees >= 0) NOT NULL,
    DeparmentPhoneNumber VARCHAR(10) NOT NULL,
    DepartmentEmail VARCHAR(50) NOT NULL,
    created_by INT NOT NULL,
    updated_by INT NOT NULL,
    created_at TIMESTAMP  NOT NULL,
    updated_at TIMESTAMP NOT NULL
);
