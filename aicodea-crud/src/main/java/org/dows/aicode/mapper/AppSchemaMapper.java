package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppSchemaEntity;

/**
 * 应用schema(AppSchema)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:43
 */
@Mapper
public interface AppSchemaMapper extends MybatisCrudMapper<AppSchemaEntity> {

}

