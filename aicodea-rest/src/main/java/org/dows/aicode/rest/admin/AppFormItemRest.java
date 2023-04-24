package org.dows.aicode.rest.admin;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppFormItemEntity;
import org.dows.aicode.form.AppFormItemForm;
import org.dows.aicode.service.AppFormItemService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用-表单字段(AppFormItem)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用-表单字段(AppFormItem)", description = "应用-表单字段")
@RestController
@RequestMapping("appFormItem")
public class AppFormItemRest implements MybatisCrudRest<AppFormItemForm, AppFormItemEntity, AppFormItemService> {


}

