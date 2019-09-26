create table `product_info`(
	`product_id` VARCHAR(32) not null,
	`product_name` VARCHAR(32) not null comment '商品名称',
	`product_price` DECIMAL(8,2) not null comment '单价',
	`product_stock` int not null comment '库存',
	`product_description` VARCHAR(64) comment '描述',
	`product_icon` VARCHAR(512) comment '小图标',
	`category_type` int not null comment '类目编号',
	`create_time` TIMESTAMP not null default CURRENT_TIMESTAMP comment '创建时间',
	`update_time` TIMESTAMP not null default CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP comment '修改时间',
	PRIMARY KEY (`product_id`)
) comment '商品表';

create table `product_category`(
	`category_id` int not null auto_increment,
	`category_name` VARCHAR(32) not null comment '类目名称',
	`category_type` int not null comment '类目编号',
	`create_time` TIMESTAMP not null default CURRENT_TIMESTAMP comment '创建时间',
	`update_time` TIMESTAMP not null default CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP comment '修改时间',
	PRIMARY KEY (`category_id`),
	UNIQUE key `uq_category_type` (`category_type`)
) comment '类目表';

create table `order_master`(
	`order_id` VARCHAR(32) not null,
	`buyer_name` VARCHAR(32) not null comment '买家名字',
	`buyer_phone` VARCHAR(32) not null comment '买家电话',
	`buyer_address` VARCHAR(128) not null comment '买家地址',
	`buyer_openid` VARCHAR(128) not null comment '买家微信openid',
	`order_amount` DECIMAL(8,2) not null comment '订单总金额',
	`order_status` TINYINT not null DEFAULT '0' comment '订单状态，默认为0，新订单',
	`pay_status` TINYINT not null DEFAULT '0' comment '支付状态，默认为0，未支付',
	`create_time` TIMESTAMP not null default CURRENT_TIMESTAMP comment '创建时间',
	`update_time` TIMESTAMP not null default CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP comment '修改时间',
	PRIMARY KEY (`order_id`),
	key `index_buyer_openid` (`buyer_openid`)
) comment '订单主表';

create table `order_detail`(
	`detail_id` VARCHAR(32) not null,
	`order_id` VARCHAR(32) not null comment '订单id',
	`product_id` VARCHAR(32) not null comment '商品id',
	`product_name` VARCHAR(32) not null comment '商品名称',
	`product_price` DECIMAL(8,2) not null comment '商品价格',
	`product_quantity` int not null comment '商品数量',
	`product_icon` VARCHAR(512) not null comment '商品小图标',
	`create_time` TIMESTAMP not null default CURRENT_TIMESTAMP comment '创建时间',
	`update_time` TIMESTAMP not null default CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP comment '修改时间',
	PRIMARY KEY (`detail_id`),
	key `index_order_id` (`order_id`)
) comment '订单详情表';
