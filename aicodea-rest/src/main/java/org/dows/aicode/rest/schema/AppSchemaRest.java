package org.dows.aicode.rest.schema;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.dows.framework.api.Response;
import org.dows.aicode.api.schema.request.AppSchemaRequest;
import org.dows.aicode.biz.schema.AppSchemaBiz;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
* @description project descr:元数据:档案分类字典接口
*
* @author lait.zhang
* @date 2023年3月29日 下午2:25:05
*/
@RequiredArgsConstructor
@RestController
@Api(tags = "档案分类字典接口")
public class AppSchemaRest {
    private final AppSchemaBiz appSchemaBiz;

    /**
    * 创建应用元数概要
    * @param
    * @return
    */
    @ApiOperation("创建应用元数概要")
    @PostMapping("v1/schema/appSchema/createAppSchema")
    public String createAppSchema(@RequestBody @Validated AppSchemaRequest appSchema ) {
        return appSchemaBiz.createAppSchema(appSchema);
    }


}