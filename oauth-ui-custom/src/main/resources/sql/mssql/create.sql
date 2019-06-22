CREATE TABLE USERS (
user_id INT(10) UNSIGNED NOT NULL PRIMARY KEY,
user_name VARCHAR(50) NOT NULL,
password VARCHAR(50) NOT NULL,
enabled boolean
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE USERS_ROLES (
  user_role_id INT(10) UNSIGNED NOT NULL PRIMARY KEY,
  user_id INT(10) UNSIGNED NOT NULL,
  authority VARCHAR(45) NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO users (user_id, user_name, password, enabled)
VALUES (101, 'mukesh', 'mukesh123', true),
       (102, 'ravi', 'ravi123', true),
       (103, 'amit', 'amit123', true);
 
INSERT INTO user_roles (user_role_id, user_id, authority)
VALUES (101, 101, 'ROLE_ADMIN'),
       (102, 102, 'ROLE_ADMIN'),
       (103, 103, 'ROLE_ADMIN');