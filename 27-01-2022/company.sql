
use org;
select * from worker;
use worker_tb;
drop table worker_tb;
create table worker(work_id int not null primary key auto_increment,
first_name varchar(34)not null,
last_name varchar(23) not null,
salary int(14) not null,
joining_date datetime,
department varchar(34));

insert into worker(work_id, first_name, last_name, salary, joining_date, department) values 
(001, 'monika', 'arora', '100000', '14-02-20 09.00.00', 'HR'),
(002, 'niharika', 'verma', 80000, '14-04-20', 'admin'),
(003, 'vishal', 'singhal', 30000, '14-03-20', 'HR'),
(004, 'amitabh', 'bachchan', 10000, '14-01-20', 'admin'),
(005, 'salman', 'bhai', 15000, '14-06-20', 'admin'),
(006, 'surya', 'bhim', 170000, '14-05-20', 'account'),
(007, 'amir', 'azad', 25000, '14-06-20', 'account'),
(008, 'pandu', 'kapate', 90000, '14-07-02', 'admin');
select * from bonus;
create table bonus(
worker_ref_id int,
bonus_amount int(13),
bonus_date datetime,
foreign key(worker_ref_id) references worker(work_id) on delete cascade);

insert into bonus(worker_ref_id, bonus_amount, bonus_date) values(001, 5000, '16-02-20'),
(001, 5000, '16-02-20'),
(002, 3000, '16-06-11'),
(003, 4000, '16-02-20'),
(001, 4500, '16-02-20'),
(002, 3500, '16-06-11');

select * from title;

create table title(worker_ref_id int, worker_title varchar(24),affected_from datetime, foreign key(worker_ref_id) references worker(work_id) on delete cascade );

insert into title(worker_ref_id, worker_title, affected_from ) values 
(001, 'manager', '2016-02-20 00:00:00'),
(002, 'executive', '2016-06-11 00:00:00'),
(008, 'executive', '2016-06-11 00:00:00'),
(005, 'manager', '2016-06-11 00:00:00'),
(004, 'assi.manager', '2016-06-11 00:00:00'),
(007, 'executive', '2016-06-11 00:00:00'),
(006, 'lead', '2016-06-11 00:00:00'),
(003, 'lead', '2016-06-11 00:00:00');

show tables;
select first_name as worker_name from worker; 

select upper(first_name) from worker;

select substring(first_name,1,3) from worker;

select instr(first_name, binary 'b') from worker where first_name='amitabh';

select rtrim(first_name) from worker;

select rtrim(department) from worker;

select distinct length(department) from worker;

select replace(first_name,'a','A') from worker;
select concat(first_name,' ',last_name) as 'complete_name' from worker;

select * from worker order by first_name asc, department desc;
select * from worker where first_name in ('monika','amitabh');

select * from worker where department like 'admin%';
select * from worker where first_name like '%a';

select * from worker where first_name like 'a%';
select * from worker where first_name like '______h';

select * from worker where salary between 25000 and 100000;
select * from worker where year(joining_date)=2014 and month(joining_date)=2;