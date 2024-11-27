<!-- E-R Diagram and Queries to Create a Database
The Entity-Relationship (E-R) Diagram visually represents entities, attributes, 
and relationships in a database.
 It is often the first step in designing a database, 
 which then translates into SQL queries to create tables and relationships. -->


create databse database_name;

use databse_name;

CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Age INT,
    Gender VARCHAR(10),
    Major VARCHAR(50)
);
