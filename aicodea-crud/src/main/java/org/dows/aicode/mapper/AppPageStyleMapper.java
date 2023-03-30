package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppPageStyleEntity;

/**
 * 应用-页面样式(AppPageStyle)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:42
 */
@Mapper
public interface AppPageStyleMapper extends MybatisCrudMapper<AppPageStyleEntity> {

}

