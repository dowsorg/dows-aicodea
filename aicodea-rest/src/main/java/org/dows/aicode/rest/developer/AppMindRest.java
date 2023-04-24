package org.dows.aicode.rest.developer;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppMindEntity;
import org.dows.aicode.form.AppMindForm;
import org.dows.aicode.service.AppMindService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用脑图(AppMind)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用脑图(AppMind)", description = "应用脑图")
@RestController
@RequestMapping("appMind")
public class AppMindRest implements MybatisCrudRest<AppMindForm, AppMindEntity, AppMindService> {


}

