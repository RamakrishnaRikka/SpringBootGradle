
create table User(
      id int not null primary key,
      name varchar_ignorecase(50),
      password varchar_ignorecase(50),
      shopName varchar_ignorecase(50),
      address varchar_ignorecase(50),
      role varchar_ignorecase(50),
      phonenum1 varchar_ignorecase(50),
      phonenum2 varchar_ignorecase(50),
      licensenumber varchar_ignorecase(50),
      salesperson varchar_ignorecase(50),
      typeOfUser varchar_ignorecase(50),
      email varchar_ignorecase(50)
      );
create table ContactUs(
      id int not null primary key,
      name varchar_ignorecase(50),
      email varchar_ignorecase(50),
      subject varchar_ignorecase(50),
      message varchar_ignorecase(50)
      );
      
      
create table orders(order_id int not null primary key,
customer_id int,
total_price float,
order_date date,
salesperson varchar_ignorecase(50),
order_status varchar_ignorecase(50),
constraint FK_customerId foreign key (customer_id) references user(id)
); 
      
create table payments(payment_id int not null primary key,
payment_mode varchar_ignorecase(50),
payment_date date,
allowed varchar_ignorecase(50
));      
      
      
create table products(product_id int not null primary key, 
product_name varchar_ignorecase(50),
product_price float,
product_weight int,
picture varchar_ignorecase(100)
);
      
create table order_details(orderdetails_id int not null primary key, 
order_id int,
product_id int,
product_quantity int,
payment_id int,
constraint FK_orderId foreign key(order_id) references orders(order_id),
constraint FK_productId foreign key(product_id) references products(product_id),
constraint FK_paymentId foreign key(payment_id) references payments(payment_id)
);      
      
create table product_details(productdetails_id int not null primary key,
product_id int, 
product_name varchar_ignorecase(50),
product_price float,
product_weight int,
units_in_stock int,
product_date date,
product_expiry_date date,
product_description varchar_ignorecase(100),
constraint FK_PIDdetails foreign key(product_id) references products(product_id)
);
    