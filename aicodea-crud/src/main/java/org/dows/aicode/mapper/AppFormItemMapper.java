package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppFormItemEntity;

/**
 * 应用-表单字段(AppFormItem)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:39
 */
@Mapper
public interface AppFormItemMapper extends MybatisCrudMapper<AppFormItemEntity> {

}

