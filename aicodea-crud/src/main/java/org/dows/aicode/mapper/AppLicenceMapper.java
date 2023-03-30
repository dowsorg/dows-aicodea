package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppLicenceEntity;

/**
 * 应用-序列号(AppLicence)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:40
 */
@Mapper
public interface AppLicenceMapper extends MybatisCrudMapper<AppLicenceEntity> {

}

