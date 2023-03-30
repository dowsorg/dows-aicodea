package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppApplyItemMapper;
import org.dows.aicode.entity.AppApplyItemEntity;
import org.dows.aicode.service.AppApplyItemService;
import org.springframework.stereotype.Service;


/**
 * 申请资料条目(AppApplyItem)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:36
 */
@Service("appApplyItemService")
public class AppApplyItemServiceImpl extends MybatisCrudServiceImpl<AppApplyItemMapper, AppApplyItemEntity> implements AppApplyItemService {

}

