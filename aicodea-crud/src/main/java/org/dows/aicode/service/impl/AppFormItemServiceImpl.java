package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppFormItemMapper;
import org.dows.aicode.entity.AppFormItemEntity;
import org.dows.aicode.service.AppFormItemService;
import org.springframework.stereotype.Service;


/**
 * 应用-表单字段(AppFormItem)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:39
 */
@Service("appFormItemService")
public class AppFormItemServiceImpl extends MybatisCrudServiceImpl<AppFormItemMapper, AppFormItemEntity> implements AppFormItemService {

}

