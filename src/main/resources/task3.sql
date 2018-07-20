CREATE TABLE clients (
  client_id INTEGER(11) NOT NULL AUTO_INCREMENT,
  client_name VARCHAR(50) COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (client_id)
);

CREATE TABLE orders (
  order_id INTEGER(11) NOT NULL AUTO_INCREMENT,
  client_id INTEGER(11) DEFAULT NULL,
  order_sum INTEGER(11) DEFAULT NULL,
  order_date DATE DEFAULT NULL,
  PRIMARY KEY (order_id)
);

INSERT INTO clients (client_id, client_name) VALUES (1, 'client01');
INSERT INTO clients (client_id, client_name) VALUES (2, 'client02');
INSERT INTO clients (client_id, client_name) VALUES (3, 'client03');
COMMIT;

INSERT INTO orders (order_id, client_id, order_sum, order_date) VALUES   (1, 1, 10, '2001-01-15');
INSERT INTO orders (order_id, client_id, order_sum, order_date) VALUES   (2, 1, 50, '2001-01-15');
INSERT INTO orders (order_id, client_id, order_sum, order_date) VALUES   (3, 2, 101, '2001-01-15');
INSERT INTO orders (order_id, client_id, order_sum, order_date) VALUES   (4, 3, 40, '2001-01-15');
INSERT INTO orders (order_id, client_id, order_sum, order_date) VALUES   (5, 3, 30, '2001-01-15');
INSERT INTO orders (order_id, client_id, order_sum, order_date) VALUES   (6, 3, 37, '2001-01-15');
COMMIT;

-- a- list of clients, which have an order with order_sum > 50
select c.client_name, o.order_sum 
from orders o
INNER JOIN clients c on o.client_id=c.client_id
where o.order_sum > 50;

-- b- clients, whose total sum of orders exceeds 100
select c.client_name, sum(o.order_sum) total 
from orders o
INNER JOIN clients c on o.client_id=c.client_id
group by(c.client_id)
having sum(o.order_sum) > 100;
