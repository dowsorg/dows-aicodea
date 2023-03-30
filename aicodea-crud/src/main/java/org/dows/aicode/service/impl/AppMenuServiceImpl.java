package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppMenuMapper;
import org.dows.aicode.entity.AppMenuEntity;
import org.dows.aicode.service.AppMenuService;
import org.springframework.stereotype.Service;


/**
 * 应用-菜单(AppMenu)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:40
 */
@Service("appMenuService")
public class AppMenuServiceImpl extends MybatisCrudServiceImpl<AppMenuMapper, AppMenuEntity> implements AppMenuService {

}

