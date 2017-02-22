CREATE TABLE country (
	id bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	iso varchar(2) NOT NULL,
	name varchar(256) NOT NULL,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT 'country';


INSERT INTO country(name, iso) VALUES ('Belgium', 'BE');
INSERT INTO country(name, iso) VALUES ('Netherlands', 'NL');
INSERT INTO country(name, iso) VALUES ('Germany', 'DE');
INSERT INTO country(name, iso) VALUES ('France', 'FR');