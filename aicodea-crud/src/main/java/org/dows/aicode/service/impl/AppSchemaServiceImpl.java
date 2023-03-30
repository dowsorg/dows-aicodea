package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppSchemaMapper;
import org.dows.aicode.entity.AppSchemaEntity;
import org.dows.aicode.service.AppSchemaService;
import org.springframework.stereotype.Service;


/**
 * 应用schema(AppSchema)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:43
 */
@Service("appSchemaService")
public class AppSchemaServiceImpl extends MybatisCrudServiceImpl<AppSchemaMapper, AppSchemaEntity> implements AppSchemaService {

}

