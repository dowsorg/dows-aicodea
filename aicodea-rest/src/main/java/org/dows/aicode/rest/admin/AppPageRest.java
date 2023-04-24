package org.dows.aicode.rest.admin;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppPageEntity;
import org.dows.aicode.form.AppPageForm;
import org.dows.aicode.service.AppPageService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用-页面(AppPage)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用-页面(AppPage)", description = "应用-页面")
@RestController
@RequestMapping("appPage")
public class AppPageRest implements MybatisCrudRest<AppPageForm, AppPageEntity, AppPageService> {


}

