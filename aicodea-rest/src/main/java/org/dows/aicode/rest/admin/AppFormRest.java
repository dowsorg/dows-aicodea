package org.dows.aicode.rest.admin;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppFormEntity;
import org.dows.aicode.form.AppFormForm;
import org.dows.aicode.service.AppFormService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用-表单(AppForm)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用-表单(AppForm)", description = "应用-表单")
@RestController
@RequestMapping("appForm")
public class AppFormRest implements MybatisCrudRest<AppFormForm, AppFormEntity, AppFormService> {


}

