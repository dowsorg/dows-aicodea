package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppPageMapper;
import org.dows.aicode.entity.AppPageEntity;
import org.dows.aicode.service.AppPageService;
import org.springframework.stereotype.Service;


/**
 * 应用-页面(AppPage)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:41
 */
@Service("appPageService")
public class AppPageServiceImpl extends MybatisCrudServiceImpl<AppPageMapper, AppPageEntity> implements AppPageService {

}

