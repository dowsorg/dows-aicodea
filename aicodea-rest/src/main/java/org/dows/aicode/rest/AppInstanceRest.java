package org.dows.aicode.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppInstanceEntity;
import org.dows.aicode.form.AppInstanceForm;
import org.dows.aicode.service.AppInstanceService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用-实例(AppInstance)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用-实例(AppInstance)", description = "应用-实例")
@RestController
@RequestMapping("appInstance")
public class AppInstanceRest implements MybatisCrudRest<AppInstanceForm, AppInstanceEntity, AppInstanceService> {


}

