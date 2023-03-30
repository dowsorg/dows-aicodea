package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppPassMapper;
import org.dows.aicode.entity.AppPassEntity;
import org.dows.aicode.service.AppPassService;
import org.springframework.stereotype.Service;


/**
 * 应用pass(AppPass)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:42
 */
@Service("appPassService")
public class AppPassServiceImpl extends MybatisCrudServiceImpl<AppPassMapper, AppPassEntity> implements AppPassService {

}

