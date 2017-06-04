
drop table t_user;

create table t_user(
userid int primary key auto_increment,
username varchar(20),
password varchar(20),
email varchar(20),
rig_date varchar(50)
);