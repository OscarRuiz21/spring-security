/*
insert into users (username, password, enabled) VALUES
                                                    ('admin', 'to_be_encoded', true),
                                                    ('user', 'to_be_encoded', true);

insert into authorities (username, authority) VALUES
                                                  ('admin', 'admin'),
                                                  ('user', 'user');

insert into customers (email, pwd, rol) VALUES
                                            ('super_user@example.com', 'to_be_encoded', 'admin'),
                                            ('basic_user@example.com', 'to_be_encoded', 'user');

 */

/*
insert into customers (email, pwd, rol) VALUES
                                            ('super_user@example.com', 'to_be_encoded', 'admin'),
                                            ('basic_user@example.com', 'to_be_encoded', 'user');

 */

insert into customers (email, pwd) values
                                       ('account@ru_learning.com', 'to_be_encoded'),
                                       ('cards@ru_learning.com', 'to_be_encoded'),
                                       ('loans@ru_learning.com', 'to_be_encoded'),
                                       ('balance@ru_learning.com', 'to_be_encoded');
/*
insert into roles(role_name, description, id_customer) values
                                                           ('VIEW_ACCOUNT', 'cant view account endpoint', 1),
                                                           ('VIEW_CARDS', 'cant view cards endpoint', 2),
                                                           ('VIEW_LOANS', 'cant view loans endpoint', 3),
                                                           ('VIEW_BALANCE', 'cant view balance endpoint', 4);

 */
insert into roles(role_name, description, id_customer) values
                                                           ('ROLE_ADMIN', 'cant view account endpoint', 1),
                                                           ('ROLE_ADMIN', 'cant view cards endpoint', 2),
                                                           ('ROLE_USER', 'cant view loans endpoint', 3),
                                                           ('ROLE_USER', 'cant view balance endpoint', 4);