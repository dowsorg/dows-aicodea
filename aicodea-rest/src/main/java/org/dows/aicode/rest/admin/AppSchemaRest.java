package org.dows.aicode.rest.admin;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppSchemaEntity;
import org.dows.aicode.form.AppSchemaForm;
import org.dows.aicode.service.AppSchemaService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用schema(AppSchema)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "应用schema(AppSchema)", description = "应用schema")
@RestController
@RequestMapping("appSchema")
public class AppSchemaRest implements MybatisCrudRest<AppSchemaForm, AppSchemaEntity, AppSchemaService> {


}

