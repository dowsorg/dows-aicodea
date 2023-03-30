package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppApplyEntity;

/**
 * 应用申请(AppApply)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:36
 */
@Mapper
public interface AppApplyMapper extends MybatisCrudMapper<AppApplyEntity> {

}

