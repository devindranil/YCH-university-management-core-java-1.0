use universitymanagementsystem;

create table studentDetails(fname varchar(40), ffname varchar(40), rollno varchar(20), dob varchar(40), address varchar(100), phone varchar(20), email varchar(40), class_x varchar(20), class_xii varchar(20), aadhar varchar(20), course varchar(40), branch varchar(40));

create table teacher(fname varchar(40), ffname varchar(40), empID varchar(20), dob varchar(40), address varchar(100), phone varchar(20), email varchar(40), class_x varchar(20), class_xii varchar(20), aadhar varchar(20), education varchar(40), department varchar(40));

SELECT * from teacher;

create table studentleave(rollno varchar(20), date varchar(50), duration varchar(20));

select * from studentleave;

create table teacherleave(empID varchar(20), date varchar(50), duration varchar(20));

select * from teacherleave;

select * from student;

create table subject(rollno varchar(20), semester varchar(20), subject1 varchar(50), subject2 varchar(50), subject3 varchar(50), subject4 varchar(50), subject5 varchar(50));
create table marks(rollno varchar(20), semester varchar(20), marks1 varchar(50), marks2 varchar(50), marks3 varchar(50), marks4 varchar(50), marks5 varchar(50));

select * from subject,marks;

create table fee(course varchar(20), semester1 varchar(20), semester2 varchar(20), semester3 varchar(20), semester4 varchar(20), semester5 varchar(20), semester6 varchar(20));
ALTER TABLE fee DROP COLUMN semester7, DROP COLUMN semester8;
ALTER TABLE fee ADD COLUMN semester7 varchar(20), ADD COLUMN semester8 varchar(20);
insert into fee values("B.Tech","65000","45000","45000","45000","45000","45000","45000","45000");
insert into fee values("BCA","65000","45000","45000","45000","45000","45000","","");
insert into fee values("B.Sc","15000","10000","10000","10000","10000","10000","","");
insert into fee values("BBA","55000","35000","35000","25000","35000","15000","","");

create table collegefee(rollno varchar(20), course varchar(20), branch varchar(20), semester varchar(20), total varchar(20));

select * from login;
