create database employer;
use employer;
drop table employer_table;
create table employer_table(
emp_ID INT PRIMARY KEY, 
emp_name varchar(20), 
emp_salary DECIMAL(7,2),
emp_doj date,
emp_location varchar(30)
);
insert into employer_table values
(1,'Jayashree',50000,'2024-12-12','chennai'),
(2,'Jothika',45000,'2022-12-05','coimbatore'),
(3,'Mouniga',55000,'2020-05-12','chennai'),
(4,'Kowsalya',40000,'2023-10-11','Bangalore');

DELIMITER $$
create procedure getyear (IN emp_ID INT)
begin
	select * from employer_table where year(emp_doj)=2024;
end $$
DELIMITER ;
drop procedure getyear;
call getyear(2024);

