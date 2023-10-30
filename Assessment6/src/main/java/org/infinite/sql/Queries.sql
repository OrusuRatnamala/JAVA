CREATE DATABASE IF NOT EXISTS assessment6;

 

USE assessment6;

 

DROP TABLE IF EXISTS cart;


CREATE TABLE IF NOT EXISTS cart (
 Product_Id int auto_increment primary key,
 Product_Name varchar(50),
 Amount int,
 Quantity int,
 Total_Price int
 );