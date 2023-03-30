package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppMindMapper;
import org.dows.aicode.entity.AppMindEntity;
import org.dows.aicode.service.AppMindService;
import org.springframework.stereotype.Service;


/**
 * 应用脑图(AppMind)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:41
 */
@Service("appMindService")
public class AppMindServiceImpl extends MybatisCrudServiceImpl<AppMindMapper, AppMindEntity> implements AppMindService {

}

