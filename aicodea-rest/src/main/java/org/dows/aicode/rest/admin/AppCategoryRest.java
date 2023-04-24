package org.dows.aicode.rest.admin;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.dows.aicode.entity.AppCategoryEntity;
import org.dows.aicode.form.AppCategoryForm;
import org.dows.aicode.service.AppCategoryService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用分类(AppCategory)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用分类(AppCategory)", description = "应用分类")
@RestController
@RequestMapping("appCategory")
public class AppCategoryRest implements MybatisCrudRest<AppCategoryForm, AppCategoryEntity, AppCategoryService> {


}

