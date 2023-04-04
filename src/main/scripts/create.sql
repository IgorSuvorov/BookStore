CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone VARCHAR(255) NOT NULL,
    roles VARCHAR(255) NOT NULL
);

CREATE TABLE items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(1024) NOT NULL,
    shipping_option_1_name VARCHAR(255) NOT NULL,
    shipping_option_1_price DECIMAL(10, 2) NOT NULL,
    shipping_option_2_name VARCHAR(255) NOT NULL,
    shipping_option_2_price DECIMAL(10, 2) NOT NULL
);

INSERT INTO users (username, password, email, phone, roles) VALUES
('user1', '{bcrypt}$2a$10$gFICp.QKxvH8W1D/7yA9gOT11oNZjz8W0T2N.2NcWyb2rJq3jKgU6', 'user1@example.com', '111-111-1111', 'ROLE_USER'),
('user2', '{bcrypt}$2a$10$fq3r.wQ6MwLMKfZcSlBpJe7RtnR6yKo7ow.bK9HlJ57s20eWwTfQi', 'user2@example.com', '222-222-2222', 'ROLE_USER');

INSERT INTO items (name, description, shipping_option_1_name, shipping_option_1_price, shipping_option_2_name, shipping_option_2_price) VALUES
('Item 1', 'Description for Item 1', 'Standard Shipping', 5.99, 'Express Shipping', 12.99),
('Item 2', 'Description for Item 2', 'Standard Shipping', 6.99, 'Express Shipping', 14.99),
('Item 3', 'Description for Item 3', 'Standard Shipping', 7.99, 'Express Shipping', 16.99),
('Item 4', 'Description for Item 4', 'Standard Shipping', 8.99, 'Express Shipping', 18.99);

