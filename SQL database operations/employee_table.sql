create database employee_management_db;
use employee_management_db;
create table employees(id int primary key auto_increment, employeeId int not null, employeeUsername varchar(50), employeePassword varchar(50), employeeFirstName varchar(50), employeeLastName varchar(50), employeeEmail varchar(50), employeeMobile varchar(10), createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP);
desc employees;
Select * from employees;

 