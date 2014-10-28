# ���ݿ����� geek_coder_news
# ���ݿ��category �ṹ��Ϣ
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` int(5) NOT NULL AUTO_INCREMENT,
  `pid` int(5) DEFAULT NULL COMMENT 'parentCategory�ϼ�����',
  `name` varchar(20) DEFAULT NULL COMMENT '��������',
  PRIMARY KEY (`cid`)
) ENGINE=MyISAM AUTO_INCREMENT=54 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='���ŷ����' ;

# ���ݿ��news �ṹ��Ϣ
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` mediumint(8) NOT NULL AUTO_INCREMENT,
  `cid` smallint(3) DEFAULT NULL COMMENT '���ڷ���',
  `title` varchar(200) DEFAULT NULL COMMENT '���ű���',
  `keywords` varchar(50) DEFAULT NULL COMMENT '���¹ؼ���',
  `description` mediumtext COMMENT '��������',
  `status` tinyint(1) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL COMMENT '����ժҪ',
  `published` int(10) DEFAULT NULL,
  `update_time` int(10) DEFAULT NULL,
  `content` text,
  `aid` smallint(3) DEFAULT NULL COMMENT '������UID',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='���ű�' ;