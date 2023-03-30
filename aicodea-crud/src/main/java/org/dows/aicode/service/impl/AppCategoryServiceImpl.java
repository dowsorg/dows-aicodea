package org.dows.aicode.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.aicode.mapper.AppCategoryMapper;
import org.dows.aicode.entity.AppCategoryEntity;
import org.dows.aicode.service.AppCategoryService;
import org.springframework.stereotype.Service;


/**
 * 应用分类(AppCategory)表服务实现类
 *
 * @author lait
 * @since 2023-03-29 15:18:38
 */
@Service("appCategoryService")
public class AppCategoryServiceImpl extends MybatisCrudServiceImpl<AppCategoryMapper, AppCategoryEntity> implements AppCategoryService {

}

