CREATE TABLE favorite (
	id bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	attraction_id bigint NOT NULL,
	user_id bigint NOT NULL,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT 'favorite';

INSERT INTO favorite(attraction_id, user_id) VALUES (1, 1);