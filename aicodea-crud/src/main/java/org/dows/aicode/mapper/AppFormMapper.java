package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppFormEntity;

/**
 * 应用-表单(AppForm)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:38
 */
@Mapper
public interface AppFormMapper extends MybatisCrudMapper<AppFormEntity> {

}

