package org.dows.aicode.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.aicode.entity.AppMenuEntity;

/**
 * 应用-菜单(AppMenu)表数据库访问层
 *
 * @author lait
 * @since 2023-03-29 15:18:40
 */
@Mapper
public interface AppMenuMapper extends MybatisCrudMapper<AppMenuEntity> {

}

