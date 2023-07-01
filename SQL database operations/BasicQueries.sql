-- Create and use database
create database practicedb;
Use practicedb;
-- drop database practicedb;

-- Create table with default constraint
Create table Students(studentID int, studentName varchar(50), studentAge int default 22, studentGender varchar(20) default "not defined");

-- Insert Into
Insert into students values (1, "Sarwasvi", 21, "F");
Insert into students(studentID, studentName, studentAge) values (2, "Swaroop", 21);
Insert into students values (3, "Nitin", 23, "M");
Insert into students values (4, "Nitin", 21, "M");
Insert into students(studentID, studentName, studentGender) values (5, "Aditi", "F");
Insert into students values (6, "Aditi", 21, "F");
Insert into students values (7, "Amit", 21, "M");

-- Select:
Select * from students;
Select studentName from students;

-- Distinct: 
Select distinct studentName from students;

-- Where
Select studentID from students where studentAge = 21;

-- And and Or
Select studentID from students where studentName="Aditi" and studentGender="F";
Select studentID from students where studentName="Aditi" or studentAge="23";

-- Order By
 Select studentName, studentAge from students order by studentAge;
 Select studentName, studentAge from students order by studentAge desc;
 
 -- SET SQL_SAFE_UPDATES = 0; 
 
 -- Update
 Update students set studentAge=22 where studentID = 7;
 
 -- Delette
 Delete from students where studentID = 7;
 Insert into students values (7, "Amit", 21, "M");
 
 -- Select TOP/LIMIT
 Select * from students order by studentAge desc limit 3; 
 
  -- Like and Wilcards
  Select * from students where studentName like 's%';
  Select * from students where studentName like '%i';
  Select * from students where studentName like 's%i';
  Select * from students where studentName like '_diti';
  Select * from students where studentName like '[as]%';
  
  -- In
  Select studentName from students where studentAge in (23,22);
  
  -- Between
  Select studentName from students where studentID between 1 and 4;
  
  -- Alias
  Select studentName as Name, studentGender as Gender from students;
  
  -- Primary key contraint
  alter table students add primary key (studentID);
  
  -- Course table with foreign key constraint
  Create table Course(courseID int, courseName varchar(50), studentID int, foreign key (studentID) references students(studentID));
  Insert into course values(1, "Data Structure", 1);
  Insert into course values(1, "Data Structure", 2);
  Insert into course values(2, "DBMS", 3);
  Insert into course values(3, "OOP", 4);
  Insert into course values(3, "OOP", 5);
  Insert into course values(2, "DBMS", 6);
  Select * from course;
  
-- Join
-- Inner
Select course.courseID, students.studentName from course inner join students on course.studentID = students.studentID;
-- Left
Select course.courseID, students.studentName from course left join students on course.studentID = students.studentID;
-- Right
Select course.courseID, students.studentName from course right join students on course.studentID = students.studentID;
-- Full
Select course.courseID, students.studentName from course full join students on course.studentID = students.studentID;

-- Union
Select studentID from course union Select studentID from students;
Select studentID from course union all Select studentID from students;

-- Not Null
Alter Table students modify studentID int not null;

-- Unique
 Alter Table students add unique(studentID);
 
 -- group by
select studentGender, count(studentID) as noOfStudents from students group by studentGender;
-- having 
select studentGender, count(studentID) as noOfStudents from students group by studentGender having count(studentID) > 1;


    
 