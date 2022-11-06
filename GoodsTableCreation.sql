DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`(
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT 'GoodsID',
    `title` varchar(200) NOT NULL COMMENT 'GoodsTitle',
    `number` varchar(100) NOT NULL COMMENT 'GoodsNumber',
    `brand` varchar(100) NOT NULL COMMENT 'GoodsBrand',
    `image` varchar(500) NOT NULL COMMENT 'GoodsImage',
    `description` varchar(1000) NOT NULL COMMENT 'GoodsDescription',
    `price` int NOT NULL COMMENT 'GoodsPriceInCents',
    `status` int NOT NULL COMMENT 'status -1 : deleted, 0 : off-shelt, 1 : on-sale',
    `keywords` varchar(200) DEFAULT NULL COMMENT 'GoodsKeyword',
    `category` varchar(100) NOT NULL COMMENT 'GoodsCategory',
    `available_stock` int NOT NULL DEFAULT '0' COMMENT 'GoodsAvailability',
    `lock_stock` int DEFAULT '0' COMMENT 'GoodsLockedStock',
    `sale_num` int NOT NULL DEFAULT '0' COMMENT 'GoodsSaleNum',
    `create-time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT 'GoodsCreatedTime',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COMMENT='GoodsTable';