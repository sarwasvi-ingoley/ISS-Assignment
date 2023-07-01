Use practicedb;

-- stored procedures
DELIMITER &&
Create procedure getNameCount(in studName varchar (50))
begin
	Select count(*) as totalNoOfNames from Students where studentName = studName;
end &&
DELIMITER ;

call getNameCount("Aditi");
drop procedure getNameCount;
