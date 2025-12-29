create database kql;
use kql;
create table bloodclat (
placing int auto_increment primary key,
gamer_tag varchar(100) unique not null,
gamer_style enum('hard', 'agressive', 'crazy', 'fantastic'),
dob date,
created_at timestamp default current_timestamp
);
