package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppAuditMapper;
import org.dows.aicode.entity.AppAuditEntity;
import org.dows.aicode.service.AppAuditService;
import org.springframework.stereotype.Service;


/**
 * 应用审核(AppAudit)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:37
 */
@Service("appAuditService")
public class AppAuditServiceImpl extends MybatisCrudServiceImpl<AppAuditMapper, AppAuditEntity> implements AppAuditService {

}

