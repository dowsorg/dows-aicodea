package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppLicenceMapper;
import org.dows.aicode.entity.AppLicenceEntity;
import org.dows.aicode.service.AppLicenceService;
import org.springframework.stereotype.Service;


/**
 * 应用-序列号(AppLicence)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:40
 */
@Service("appLicenceService")
public class AppLicenceServiceImpl extends MybatisCrudServiceImpl<AppLicenceMapper, AppLicenceEntity> implements AppLicenceService {

}

