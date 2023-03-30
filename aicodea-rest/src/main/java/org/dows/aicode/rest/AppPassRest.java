package org.dows.aicode.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppPassEntity;
import org.dows.aicode.form.AppPassForm;
import org.dows.aicode.service.AppPassService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用pass(AppPass)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用pass(AppPass)", description = "应用pass")
@RestController
@RequestMapping("appPass")
public class AppPassRest implements MybatisCrudRest<AppPassForm, AppPassEntity, AppPassService> {


}

