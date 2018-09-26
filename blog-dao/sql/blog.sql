/*博客文章  */
CREATE TABLE `article` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(50)  NOT NULL ,
  `pictureUrl` varchar(50) default NULL,
  `summary` varchar(255) default NULL,
  `content` text,
  `cateoryid`  int(11) DEFAULT NULL,
  `hits` int(11) default '0',
  `createDate` datetime  NOT NULL,
  `modifyDate` datetime  NOT NULL,
  PRIMARY KEY  (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=610 DEFAULT CHARSET=utf8;

/*博客分类  */
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `num` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;






/*博客标签  */
CREATE TABLE `tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8;

/*博客文章与标签关系表  */
CREATE TABLE `relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `article_id` int(11) DEFAULT NULL,
  `tag_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8;