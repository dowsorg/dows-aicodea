package org.dows.aicode.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppMenuEntity;
import org.dows.aicode.form.AppMenuForm;
import org.dows.aicode.service.AppMenuService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用-菜单(AppMenu)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用-菜单(AppMenu)", description = "应用-菜单")
@RestController
@RequestMapping("appMenu")
public class AppMenuRest implements MybatisCrudRest<AppMenuForm, AppMenuEntity, AppMenuService> {


}

