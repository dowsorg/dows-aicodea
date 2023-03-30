package org.dows.aicode.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppLicenceEntity;
import org.dows.aicode.form.AppLicenceForm;
import org.dows.aicode.service.AppLicenceService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用-序列号(AppLicence)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用-序列号(AppLicence)", description = "应用-序列号")
@RestController
@RequestMapping("appLicence")
public class AppLicenceRest implements MybatisCrudRest<AppLicenceForm, AppLicenceEntity, AppLicenceService> {


}

