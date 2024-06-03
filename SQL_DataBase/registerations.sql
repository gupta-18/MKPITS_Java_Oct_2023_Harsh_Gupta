
use registrationDatabase;
drop table userdetails;
create table userdetails( id int auto_increment not null primary key ,
 username varchar(100) not null,
 mobile varchar(12) not null ,
email varchar(150) not null, 
city varchar(100) not null,
 gender varchar(10) not null,
 password  varchar(100) not null);