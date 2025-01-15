CREATE DATABASE IF NOT EXISTS FREEBIES_APP;

USE FREEBIES_APP;

CREATE TABLE items(
itemID int NOT NULL AUTO_INCREMENT,
description VARCHAR(255),
image VARCHAR(255),
location VARCHAR(255),
name VARCHAR(255),
price DOUBLE,
zipcode INT,
PRIMARY KEY(itemID)

);

INSERT INTO items(description,image,location,name,price,zipcode) VALUES ("something","www.com","newark","house",'23','19805');