create database `mybatis`;

use `mybatis`;

create table `user`
(
    `id`   int(20) not null,
    `name` varchar(30) default null,
    `pwd`  varchar(30) default null,
    primary key (`id`)
) engine = innodb default charset = utf8;

insert into `user`(`id`,`name`,`pwd`) values 
(1,'小明','123456'),
(2,'张三','123456'),
(3,'李四','123456');