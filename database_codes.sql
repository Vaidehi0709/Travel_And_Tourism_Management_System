create database travelmanagementsystem;

show databases;

use travelmanagementsystem;

create table account(username varchar(30), name varchar(30), password varchar(30), securityQue varchar(100), answer varchar(50))

select * from account;

create table customer(username varchar(30), id varchar(30), idNumber varchar(30), name varchar(30), gender varchar(30),  country varchar(30), address varchar(50), phone varchar(15), email varchar(50))

select * from customer;

create table bookpackage(username varchar(30), package varchar(30), persons varchar(30), id varchar(30), idNumber varchar(30), phone varchar(15), price varchar(30))
 
 select * from bookpackage;
 
 create table hotel(name varchar(50), costPerPerson varchar(30), acRoom varchar(30), foodIncluded varchar(30));
 
insert into hotel values('JW Marriot Hotel', '4500', '5200', '6220');
insert into hotel values('Madarian Oriental Hotel', '4000', '1800', '2010');
insert into hotel values('Four Seasons Hotel', '3400', '1000', '1300');
insert into hotel values('Raddisson Blue Hotel', '5800', '2200', '1240');
insert into hotel values('Taj Mahal Palace', '5000', '1800', '1210');
insert into hotel values('The Oberoi Hotel', '5800', '2000', '2400');
insert into hotel values('Lemon Tree Hotel', '4500', '1600', '1450');
insert into hotel values('Hyatt Hotel', '2500', '1200', '1265');
insert into hotel values('Hotel Tip Top', '6500', '2500', '3200');
insert into hotel values('The Bay Club Hotel', '4500','1450','1425');

select * from hotel;

create table bookhotel(username varchar(30), name varchar(50), persons varchar(30), days varchar(10), ac varchar(20), food varchar(20) ,id varchar(30), idNumber varchar(30), phone varchar(15), price varchar(30));

select * from bookhotel;
