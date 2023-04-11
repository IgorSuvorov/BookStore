CREATE TABLE items (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(1024) NOT NULL,
    shipping_option_1_name VARCHAR(255) NOT NULL,
    shipping_option_1_price DECIMAL(10, 2) NOT NULL,
    shipping_option_2_name VARCHAR(255) NOT NULL,
    shipping_option_2_price DECIMAL(10, 2) NOT NULL
);
