package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppPassEntity;

/**
 * 应用pass(AppPass)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:43
 */
@Mapper
public interface AppPassMapper extends MybatisCrudMapper<AppPassEntity> {

}

