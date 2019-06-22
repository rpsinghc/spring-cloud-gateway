INSERT INTO users (user_id, user_name, password, enabled)
VALUES (101, 'mukesh', 'mukesh123', true),
       (102, 'ravi', 'ravi123', true),
       (103, 'amit', 'amit123', true);
 
INSERT INTO user_roles (user_role_id, user_id, authority)
VALUES (101, 101, 'ROLE_ADMIN'),
       (102, 102, 'ROLE_ADMIN'),
       (103, 103, 'ROLE_ADMIN');