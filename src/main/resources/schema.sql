create table product(
      id int not null primary key,
      name varchar_ignorecase(50));
      
create table User(
      id int not null primary key,
      name varchar_ignorecase(50),
      password varchar_ignorecase(50),
      shopName varchar_ignorecase(50),
      address varchar_ignorecase(50),
      role varchar_ignorecase(50),
      phoneNum1 varchar_ignorecase(50),
      phoneNum2 varchar_ignorecase(50),
      licenseNumber varchar_ignorecase(50),
      salesPerson varchar_ignorecase(50),
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
    