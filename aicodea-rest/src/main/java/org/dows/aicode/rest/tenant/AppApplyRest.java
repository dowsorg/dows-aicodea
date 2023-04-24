package org.dows.aicode.rest.tenant;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppApplyEntity;
import org.dows.aicode.form.AppApplyForm;
import org.dows.aicode.service.AppApplyService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用申请(AppApply)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:40
 */
@Tag(name = "应用申请(AppApply)", description = "应用申请")
@RestController
@RequestMapping("appApply")
public class AppApplyRest implements MybatisCrudRest<AppApplyForm, AppApplyEntity, AppApplyService> {


}

