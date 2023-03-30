package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppApplyItemEntity;

/**
 * 申请资料条目(AppApplyItem)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:37
 */
@Mapper
public interface AppApplyItemMapper extends MybatisCrudMapper<AppApplyItemEntity> {

}

