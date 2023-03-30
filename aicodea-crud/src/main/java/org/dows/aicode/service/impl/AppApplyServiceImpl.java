package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppApplyMapper;
import org.dows.aicode.entity.AppApplyEntity;
import org.dows.aicode.service.AppApplyService;
import org.springframework.stereotype.Service;


/**
 * 应用申请(AppApply)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:36
 */
@Service("appApplyService")
public class AppApplyServiceImpl extends MybatisCrudServiceImpl<AppApplyMapper, AppApplyEntity> implements AppApplyService {

}

