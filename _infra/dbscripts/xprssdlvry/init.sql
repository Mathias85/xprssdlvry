CREATE TABLE xprssdlvrydb.xd_restaurant
(
    rest_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    description varchar(255),
    date_created timestamp NOT NULL,
    street varchar(255),
    city varchar(255),
    state varchar(255),
    country varchar(255),
    latitude int,
    longitude int
);
CREATE UNIQUE INDEX xd_restaurant_rest_id_uindex ON xprssdlvrydb.xd_restaurant (rest_id);

CREATE TABLE xprssdlvrydb.xd_food
(
    food_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    description varchar(255),
    price double NOT NULL,
    rest_id int NOT NULL,
    CONSTRAINT xd_food_fd_restaurant_rest_id_fk FOREIGN KEY (rest_id) REFERENCES xprssdlvrydb.xd_restaurant (rest_id)
);
CREATE UNIQUE INDEX fd_food_food_id_uindex ON xprssdlvrydb.fd_food (food_id);

CREATE TABLE xprssdlvrydb.xd_user
(
    user_id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username varchar(100) NOT NULL,
    email varchar(150) NOT NULL,
    user_since timestamp DEFAULT CURRENT_TIMESTAMP,
    auth_provider varchar(100) NOT NULL
);
CREATE UNIQUE INDEX xd_user_user_id_uindex ON xprssdlvrydb.xd_user (user_id);
CREATE UNIQUE INDEX xd_user_username_uindex ON xprssdlvrydb.xd_user (username);

CREATE TABLE xprssdlvrydb.xd_order
(
    order_id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    date_created timestamp DEFAULT CURRENT_TIMESTAMP,
    user_id int(11) NOT NULL,
    rest_id int(11) NOT NULL,
    order_status varchar(100) NOT NULL,
    total_price double NOT NULL,
    payment_type varchar(100) NOT NULL,
    delivery_fee double NOT NULL,
    CONSTRAINT xd_order_xd_user_user_id_fk FOREIGN KEY (user_id) REFERENCES xprssdlvrydb.xd_user (user_id),
    CONSTRAINT xd_order_xd_restaurant_rest_id_fk FOREIGN KEY (rest_id) REFERENCES xprssdlvrydb.xd_restaurant (rest_id)
);
CREATE UNIQUE INDEX xd_order_order_id_uindex ON xprssdlvrydb.xd_order (order_id);
CREATE INDEX xd_order_xd_user_user_id_fk ON xprssdlvrydb.xd_order (user_id);
CREATE INDEX xd_order_xd_restaurant_rest_id_fk ON xprssdlvrydb.xd_order (rest_id);

CREATE TABLE xprssdlvrydb.xd_order_food
(
    order_food_id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    order_id int(11) NOT NULL,
    food_id int(11) NOT NULL,
    amount int(11) NOT NULL,
    price double NOT NULL,
    CONSTRAINT xd_order_food_xd_order_order_id_fk FOREIGN KEY (order_id) REFERENCES xprssdlvrydb.xd_order (order_id),
    CONSTRAINT xd_order_food_xd_food_food_id_fk FOREIGN KEY (food_id) REFERENCES xprssdlvrydb.xd_food (food_id)
);
CREATE UNIQUE INDEX xd_order_food_order_food_id_uindex ON xprssdlvrydb.xd_order_food (order_food_id);
CREATE INDEX xd_order_food_xd_order_order_id_fk ON xprssdlvrydb.xd_order_food (order_id);
CREATE INDEX xd_order_food_xd_food_food_id_fk ON xprssdlvrydb.xd_order_food (food_id);

-- DML
-- RESTAURANT
INSERT INTO xprssdlvrydb.xd_restaurant (rest_id, name, description, date_created, street, city, state, country, latitude, longitude) VALUES (1, 'Subway', null, '2018-06-24 17:37:58', 'Street', 'City', 'State', 'Country', null, null);
INSERT INTO xprssdlvrydb.xd_restaurant (rest_id, name, description, date_created, street, city, state, country, latitude, longitude) VALUES (2, 'Burguer King', null, '2018-06-24 17:38:34', 'Street', 'City', 'State', 'Country', null, null);
INSERT INTO xprssdlvrydb.xd_restaurant (rest_id, name, description, date_created, street, city, state, country, latitude, longitude) VALUES (3, 'Mc Donald''s', null, '2018-06-24 17:38:56', 'Street', 'City', 'State', 'Country', null, null);

-- FOOD
INSERT INTO xprssdlvrydb.xd_food (food_id, name, description, price, rest_id) VALUES (1, 'BLT', 'Bacon - Lettuce - Tomato', 8.9, 1);
INSERT INTO xprssdlvrydb.xd_food (food_id, name, description, price, rest_id) VALUES (2, 'Cream Cheese', 'Cream Cheese', 7.9, 1);
INSERT INTO xprssdlvrydb.xd_food (food_id, name, description, price, rest_id) VALUES (3, 'Triple Stacker', null, 15.9, 2);
INSERT INTO xprssdlvrydb.xd_food (food_id, name, description, price, rest_id) VALUES (4, 'Whooper', null, 16.9, 2);
INSERT INTO xprssdlvrydb.xd_food (food_id, name, description, price, rest_id) VALUES (5, 'Big Mac', null, 18.9, 3);
INSERT INTO xprssdlvrydb.xd_food (food_id, name, description, price, rest_id) VALUES (6, 'Cheddar', null, 16.9, 3);
INSERT INTO xprssdlvrydb.xd_food (food_id, name, description, price, rest_id) VALUES (7, 'Triple Burger', null, 15.9, 3);

--USER
INSERT INTO xprssdlvrydb.xd_user (user_id, username, email, user_since, auth_provider) VALUES (1, 'Admin User', 'admin@skip.ca', '2018-06-24 20:11:39', 'PASSWORD');

-- ORDER
INSERT INTO xprssdlvrydb.xd_order (order_id, date_created, user_id, rest_id, order_status, total_price, payment_type, delivery_fee) VALUES (3, '2018-06-24 17:14:08', 1, 2, 'PROCESSING', 67.5, 'CASH', 4.76);

-- ORDER FOOD

INSERT INTO xprssdlvrydb.xd_order_food (order_food_id, order_id, food_id, amount, price) VALUES (3, 3, 3, 2, 25.8);
INSERT INTO xprssdlvrydb.xd_order_food (order_food_id, order_id, food_id, amount, price) VALUES (4, 3, 4, 1, 15.9);