create table category(
	id bigInt(20) primary key auto_increment,
	category_id bigint(11),
	category_name varchar(255),
	category_code varchar(255),
	category_desc varchar(255),
	status bigint(11),
	sale_status bigint(11),
	parent_id bigint(11),
	tree_path varchar(255),
	grade bigint(11),
	category_order bigint(11),
	is_leaf bigint(11),
	create_person varchar(255),
	update_person varchar(255),
	create_time timestamp,
	update_time timestamp
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE='utf8_general_ci'
;
alter table category auto_increment = 6000;

create table brand(
	id bigInt(20) primary key auto_increment,
	brand_id bigint(11),
	brand_name varchar(255),
	brand_code varchar(255),
	brand_logo varchar(255),
	status bigint(11),
	introduction varchar(255),
	brand_order bigint(11),
	attribution varchar(255),
	category_id bigint(11),
	category_name varchar(255),
	category_ids varchar(255),
	category_codes varchar(255),
	create_person varchar(255),
	update_person varchar(255),
	create_time timestamp,
	update_time timestamp
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE='utf8_general_ci'
;
alter table brand auto_increment = 6000;
