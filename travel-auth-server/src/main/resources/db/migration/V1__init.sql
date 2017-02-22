CREATE TABLE user (
	id bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	username varchar(16) NOT NULL,
	password varchar(256) NOT NULL,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT 'user';


CREATE TABLE role (
	id bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	role varchar(16) NOT NULL,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT 'role';


CREATE TABLE user_role (
  user_id bigint NOT NULL,
  role_id bigint NOT NULL
);

INSERT INTO user(username, password) values ('travel-admin','travel-password');
INSERT INTO user(username, password) values ('travel-user','travel-password');

INSERT INTO role(role) values ('ROLE_ADMIN');
INSERT INTO role(role) values ('ROLE_USER');

INSERT INTO user_role(user_id, role_id) values (1,1);
INSERT INTO user_role(user_id, role_id) values (2,2);