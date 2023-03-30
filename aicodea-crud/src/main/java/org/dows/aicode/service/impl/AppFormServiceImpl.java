package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppFormMapper;
import org.dows.aicode.entity.AppFormEntity;
import org.dows.aicode.service.AppFormService;
import org.springframework.stereotype.Service;


/**
 * 应用-表单(AppForm)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:38
 */
@Service("appFormService")
public class AppFormServiceImpl extends MybatisCrudServiceImpl<AppFormMapper, AppFormEntity> implements AppFormService {

}

