package org.dows.aicode.rest.tenant;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.dows.aicode.entity.AppApplyItemEntity;
import org.dows.aicode.form.AppApplyItemForm;
import org.dows.aicode.service.AppApplyItemService;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 申请资料条目(AppApplyItem)表控制层
 *
 * @author lait
 * @since 2023-03-30 12:07:41
 */
@Tag(name = "申请资料条目(AppApplyItem)", description = "申请资料条目")
@RestController
@RequestMapping("appApplyItem")
public class AppApplyItemRest implements MybatisCrudRest<AppApplyItemForm, AppApplyItemEntity, AppApplyItemService> {


}

