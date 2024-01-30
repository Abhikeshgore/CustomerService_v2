 ALTER TABLE address
ADD COLUMN ca_fk INT;


ALTER TABLE address
ADD CONSTRAINT fk_address_customer FOREIGN KEY (ca_fk) REFERENCES customer(id);


