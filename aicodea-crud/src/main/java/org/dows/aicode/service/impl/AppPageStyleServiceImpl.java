package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppPageStyleMapper;
import org.dows.aicode.entity.AppPageStyleEntity;
import org.dows.aicode.service.AppPageStyleService;
import org.springframework.stereotype.Service;


/**
 * 应用-页面样式(AppPageStyle)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:42
 */
@Service("appPageStyleService")
public class AppPageStyleServiceImpl extends MybatisCrudServiceImpl<AppPageStyleMapper, AppPageStyleEntity> implements AppPageStyleService {

}

