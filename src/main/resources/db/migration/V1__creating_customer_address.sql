-- db/migration/V10__create_customer_table.sql

CREATE TABLE customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    externalId VARCHAR(255) UNIQUE,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    age INT,
    gender VARCHAR(10), -- Assuming Gender is a string, adjust the size accordingly
    creation_time TIMESTAMP,
    update_time TIMESTAMP
);
-- db/migration/V11__create_address_table.sql

CREATE TABLE address (
    address_id INT AUTO_INCREMENT PRIMARY KEY,
    externalAddress_Id VARCHAR(36) UNIQUE,
    house_number VARCHAR(255) NOT NULL,
    street VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    province VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL,
    pincode VARCHAR(20) NOT NULL
);
