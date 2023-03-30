package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppMindEntity;

/**
 * 应用脑图(AppMind)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:41
 */
@Mapper
public interface AppMindMapper extends MybatisCrudMapper<AppMindEntity> {

}

