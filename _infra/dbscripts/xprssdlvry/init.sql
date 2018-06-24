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