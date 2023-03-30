package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppInstanceMapper;
import org.dows.aicode.entity.AppInstanceEntity;
import org.dows.aicode.service.AppInstanceService;
import org.springframework.stereotype.Service;


/**
 * 应用-实例(AppInstance)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:39
 */
@Service("appInstanceService")
public class AppInstanceServiceImpl extends MybatisCrudServiceImpl<AppInstanceMapper, AppInstanceEntity> implements AppInstanceService {

}

