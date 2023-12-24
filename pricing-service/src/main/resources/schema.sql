CREATE TABLE IF NOT EXISTS PRICE (
    vehicleId LONG PRIMARY KEY auto_increment,
    currency VARCHAR(10),
    price DECIMAL(6,2)
);