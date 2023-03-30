package org.dows.aicode.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppAuditEntity;
import org.dows.aicode.form.AppAuditForm;
import org.dows.aicode.service.AppAuditService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用审核(AppAudit)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用审核(AppAudit)", description = "应用审核")
@RestController
@RequestMapping("appAudit")
public class AppAuditRest implements MybatisCrudRest<AppAuditForm, AppAuditEntity, AppAuditService> {


}

