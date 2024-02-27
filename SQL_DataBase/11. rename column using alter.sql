 use mkpits_database;
 show tables;
alter table sub_employee 
add number int(10);
alter table sub_employee modify Number varchar(5);
desc sub_employee;
alter table sub_employee rename column Number to Rollno;