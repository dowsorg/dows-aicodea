
-- 若库不存在创建一个
CREATE DATABASE IF NOT EXISTS `dows_aicodea`;
USE `dows_aicodea`;

drop table if exists `app_category`;
CREATE TABLE IF NOT EXISTS `app_category`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '资源类目ID',
    `pid` bigint(19) DEFAULT NULL COMMENT '父节点ID',
    `app_category_id` varchar(64) DEFAULT NULL COMMENT '分类ID(分布式ID)',
    `categ_name` varchar(64) DEFAULT NULL COMMENT '应用分类名称',
    `categ_code` varchar(64) DEFAULT NULL COMMENT '应用分类code',
    `descr` varchar(64) DEFAULT NULL COMMENT '描述',
    `sorted` int DEFAULT NULL COMMENT '顺序',
    `ver` int DEFAULT NULL COMMENT '乐观锁, 默认: 0',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删除: 0 未删除(false), 1 已删除(true); 默认: 0',
    `dt` datetime DEFAULT NULL COMMENT '',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用分类';

drop table if exists `app_schema`;
CREATE TABLE IF NOT EXISTS `app_schema`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '节点ID',
    `app_category_id` varchar(64) DEFAULT NULL COMMENT '分类ID(分布式ID)',
    `app_schema_id` varchar(64) DEFAULT NULL COMMENT '应用schemaId',
    `categ_id` varchar(64) DEFAULT NULL COMMENT '应用类型',
    `categ_name` varchar(64) DEFAULT NULL COMMENT '分类名称',
    `app_name` varchar(64) DEFAULT NULL COMMENT '应用名',
    `app_code` varchar(64) DEFAULT NULL COMMENT '应用CODE',
    `app_home` varchar(64) DEFAULT NULL COMMENT '应用主页',
    `descr` varchar(64) DEFAULT NULL COMMENT '描述',
    `creator` varchar(64) DEFAULT NULL COMMENT '创建者',
    `tenant_id` varchar(64) DEFAULT NULL COMMENT '租户ID',
    `app_typ` integer DEFAULT NULL COMMENT '应用类型（0：app ，1：pc，2：云）',
    `sorted` integer DEFAULT NULL COMMENT '顺序',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删除: 0 未删除(false), 1 已删除(true); 默认: 0',
    `dt` datetime DEFAULT NULL COMMENT '',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用schema';

drop table if exists `app_page`;
CREATE TABLE IF NOT EXISTS `app_page`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `app_page_id` varchar(64) DEFAULT NULL COMMENT '应用页面ID',
    `app_schema_id` varchar(64) DEFAULT NULL COMMENT '应用schemaId',
    `app_name` varchar(64) DEFAULT NULL COMMENT '应用名',
    `app_code` varchar(64) DEFAULT NULL COMMENT '应用码',
    `page_id` varchar(64) DEFAULT NULL COMMENT '页面ID',
    `page_no` varchar(64) DEFAULT NULL COMMENT '页面编号',
    `page_name` varchar(64) DEFAULT NULL COMMENT '页面名称',
    `page_code` varchar(64) DEFAULT NULL COMMENT '页面code',
    `page_url` varchar(64) DEFAULT NULL COMMENT '页面url',
    `descr` varchar(64) DEFAULT NULL COMMENT '页面描述',
    `sorted` integer DEFAULT NULL COMMENT '顺序',
    `ver` integer DEFAULT NULL COMMENT '乐观锁, 默认: 0',
    `dt` datetime DEFAULT NULL COMMENT '',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删除',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用-页面';

drop table if exists `app_page_style`;
CREATE TABLE IF NOT EXISTS `app_page_style`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `app_page_style_id` varchar(64) DEFAULT NULL COMMENT '页面样式ID',
    `app_schema_id` varchar(64) DEFAULT NULL COMMENT '应用schemaId',
    `page_id` varchar(64) DEFAULT NULL COMMENT '页面ID',
    `css_style` varchar(64) DEFAULT NULL COMMENT '样式文件',
    `dt` datetime DEFAULT NULL COMMENT '',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删除',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用-页面样式';

drop table if exists `app_form`;
CREATE TABLE IF NOT EXISTS `app_form`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '资源类目ID',
    `app_form_id` varchar(64) DEFAULT NULL COMMENT '应用表单ID',
    `app_schema_id` varchar(64) DEFAULT NULL COMMENT '应用schemaId',
    `app_name` varchar(64) DEFAULT NULL COMMENT '应用名',
    `app_code` varchar(64) DEFAULT NULL COMMENT '应用码',
    `page_id` varchar(64) DEFAULT NULL COMMENT '页面ID',
    `form_id` varchar(64) DEFAULT NULL COMMENT '表单ID',
    `form_name` varchar(64) DEFAULT NULL COMMENT '表单名称',
    `form_code` varchar(64) DEFAULT NULL COMMENT '表单code',
    `sorted` integer DEFAULT NULL COMMENT '顺序',
    `dt` datetime DEFAULT NULL COMMENT '',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删除',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用-表单';

drop table if exists `app_form_item`;
CREATE TABLE IF NOT EXISTS `app_form_item`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '账号-菜单ID',
    `app_schema_id` varchar(64) DEFAULT NULL COMMENT '应用schemaId',
    `app_form_item_id` varchar(64) DEFAULT NULL COMMENT '表单字段ID',
    `app_form_id` varchar(64) DEFAULT NULL COMMENT '应用表单ID',
    `affiliation` varchar(64) DEFAULT NULL COMMENT '所属表名',
    `field_name` varchar(64) DEFAULT NULL COMMENT '字段名称',
    `field_code` varchar(64) DEFAULT NULL COMMENT '字段CODE',
    `field_typ` varchar(64) DEFAULT NULL COMMENT '字段类型',
    `length` varchar(64) DEFAULT NULL COMMENT '长度',
    `input_typ` varchar(64) DEFAULT NULL COMMENT '字段输入类型(txt|input|select|checkbox..)',
    `func_api` varchar(64) DEFAULT NULL COMMENT '功能接口',
    `dt` datetime DEFAULT NULL COMMENT '',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删除',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用-表单字段';

drop table if exists `app_menu`;
CREATE TABLE IF NOT EXISTS `app_menu`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '账号-菜单ID',
    `pid` bigint(19) DEFAULT NULL COMMENT '父节点ID, 如果没有父节点则为: -1',
    `app_schema_id` varchar(64) DEFAULT NULL COMMENT '应用schemaId',
    `app_menu_id` varchar(64) DEFAULT NULL COMMENT '应用菜单ID',
    `page_id` varchar(64) DEFAULT NULL COMMENT '页面ID',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用 id',
    `menu_code` varchar(64) DEFAULT NULL COMMENT '英文码',
    `menu_name` varchar(64) DEFAULT NULL COMMENT '菜单名称',
    `menu_val` varchar(64) DEFAULT NULL COMMENT '菜单值',
    `icon` varchar(64) DEFAULT NULL COMMENT '图标',
    `level` integer DEFAULT NULL COMMENT '层级',
    `sorted` integer DEFAULT NULL COMMENT '排序',
    `frame` tinyint(4) DEFAULT NULL COMMENT '是否iframe: 1是, 0不是, 默认: 1',
    `dt` datetime DEFAULT NULL COMMENT '',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删除:',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用-菜单';

drop table if exists `app_pass`;
CREATE TABLE IF NOT EXISTS `app_pass`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '节点ID',
    `app_schema_id` varchar(64) DEFAULT NULL COMMENT '应用schemaId',
    `app_pass_id` varchar(64) DEFAULT NULL COMMENT '应用passId',
    `pass_name` varchar(64) DEFAULT NULL COMMENT 'pass名称',
    `pass_code` varchar(64) DEFAULT NULL COMMENT 'passCode',
    `host` varchar(64) DEFAULT NULL COMMENT '主机地址',
    `env` varchar(64) DEFAULT NULL COMMENT '环境',
    `endpoint_config` varchar(64) DEFAULT NULL COMMENT '端点配置',
    `cluster` tinyint(4) DEFAULT NULL COMMENT '是否集群',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删',
    `dt` datetime DEFAULT NULL COMMENT '',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用pass';

drop table if exists `app_mind`;
CREATE TABLE IF NOT EXISTS `app_mind`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '数据库ID',
    `app_mind_id` varchar(64) DEFAULT NULL COMMENT '应用脑图ID',
    `app_schema_id` varchar(64) DEFAULT NULL COMMENT '应用schemaId',
    `api_json` varchar(64) DEFAULT NULL COMMENT '接口json',
    `ddl_json` varchar(64) DEFAULT NULL COMMENT 'ddlJson',
    `build_json` varchar(64) DEFAULT NULL COMMENT '构建json',
    `config_json` varchar(64) DEFAULT NULL COMMENT '配置json',
    `mind_version` varchar(64) DEFAULT NULL COMMENT '版本',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删',
    `dt` datetime DEFAULT NULL COMMENT '',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用脑图';

drop table if exists `app_instance`;
CREATE TABLE IF NOT EXISTS `app_instance`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '数据库ID',
    `app_instance_id` varchar(64) DEFAULT NULL COMMENT '应用实例ID',
    `categ_id` varchar(64) DEFAULT NULL COMMENT '应用分类ID',
    `categ_name` varchar(64) DEFAULT NULL COMMENT '应用名称',
    `app_schema_id` varchar(64) DEFAULT NULL COMMENT '应用schemaId',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用 id',
    `app_name` varchar(64) DEFAULT NULL COMMENT '应用名称',
    `app_code` varchar(64) DEFAULT NULL COMMENT '应用CODE',
    `sorted` integer DEFAULT NULL COMMENT '顺序',
    `ver` integer DEFAULT NULL COMMENT '乐观锁, 默认: 0',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '是否逻辑删',
    `dt` datetime DEFAULT NULL COMMENT '',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用-实例';

drop table if exists `app_apply`;
CREATE TABLE IF NOT EXISTS `app_apply`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `app_apply_id` varchar(64) DEFAULT NULL COMMENT '应用申请ID',
    `categ_id` varchar(64) DEFAULT NULL COMMENT '应用类型',
    `apply_order_no` varchar(64) DEFAULT NULL COMMENT '应用或小程序申请订单编号(全局唯一)',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID(申请审核通过后回填)',
    `app_name` varchar(64) DEFAULT NULL COMMENT '应用名称',
    `platform` varchar(64) DEFAULT NULL COMMENT '',
    `platform_order_no` varchar(64) DEFAULT NULL COMMENT '第三方平台申请单号（第三放平台审核通过后回填）',
    `platform_app_id` varchar(64) DEFAULT NULL COMMENT '第三方平台关联应用ID（第三放平台审核通过后回填）',
    `applicant` varchar(64) DEFAULT NULL COMMENT '申请人',
    `tenant_name` varchar(64) DEFAULT NULL COMMENT '租户名称（付费对象）',
    `tenant_id` varchar(64) DEFAULT NULL COMMENT '租户ID',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '逻辑删除',
    `applied_time` datetime DEFAULT NULL COMMENT '申请通过时间',
    `dt` datetime DEFAULT NULL COMMENT '时间戳',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用申请';

drop table if exists `app_apply_item`;
CREATE TABLE IF NOT EXISTS `app_apply_item`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `app_apply_item_id` varchar(64) DEFAULT NULL COMMENT '申请资料条目ID',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `app_name` varchar(64) DEFAULT NULL COMMENT '小程序名称',
    `apply_order_no` varchar(64) DEFAULT NULL COMMENT '应用或小程序申请订单编号',
    `platform_order_no` varchar(64) DEFAULT NULL COMMENT '第三方平台申请单号（第三放平台回填）',
    `platform_account` varchar(64) DEFAULT NULL COMMENT '',
    `cert_no` varchar(64) DEFAULT NULL COMMENT '营业执照编号',
    `cert_name` varchar(64) DEFAULT NULL COMMENT '营业执照名称',
    `legal_name` varchar(64) DEFAULT NULL COMMENT '法人',
    `contact_phone` varchar(64) DEFAULT NULL COMMENT '联系人手机',
    `contact_name` varchar(64) DEFAULT NULL COMMENT '联系人',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '逻辑删除',
    `dt` datetime DEFAULT NULL COMMENT '时间戳',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='申请资料条目';

drop table if exists `app_audit`;
CREATE TABLE IF NOT EXISTS `app_audit`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `app_audit_id` varchar(64) DEFAULT NULL COMMENT '应用审核ID',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `checked_user` varchar(64) DEFAULT NULL COMMENT '审核人',
    `checked_time` datetime DEFAULT NULL COMMENT '审核时间',
    `checked_descr` varchar(64) DEFAULT NULL COMMENT '审核描述',
    `checked_user_name` varchar(64) DEFAULT NULL COMMENT '审核人员名称',
    `account_name` varchar(64) DEFAULT NULL COMMENT '申请人名称',
    `remark` varchar(64) DEFAULT NULL COMMENT '备注',
    `status` int DEFAULT NULL COMMENT '申请状态(0：不通过，1：通过,2:审核中)',
    `disabled` tinyint(4) DEFAULT NULL COMMENT '0启用1禁用',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '逻辑删除',
    `dt` datetime DEFAULT NULL COMMENT '时间戳',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用审核';

drop table if exists `app_licence`;
CREATE TABLE IF NOT EXISTS `app_licence`(
    `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键（数据库自增）',
    `app_licence_id` varchar(64) DEFAULT NULL COMMENT '应用序列号ID',
    `secret_id` varchar(64) DEFAULT NULL COMMENT 'secretId',
    `secret_key` varchar(64) DEFAULT NULL COMMENT 'secretKey',
    `app_key` varchar(64) DEFAULT NULL COMMENT '应用key',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `account_id` varchar(64) DEFAULT NULL COMMENT '账号ID',
    `tenant_id` varchar(64) DEFAULT NULL COMMENT '租户ID',
    `status` tinyint(4) DEFAULT NULL COMMENT '状态（0:关，1:开,默认关）',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '逻辑删除',
    `dt` datetime DEFAULT NULL COMMENT '时间戳',
    PRIMARY KEY (`id`) 
) ENGINE=InnoDB COMMENT='应用-序列号';


