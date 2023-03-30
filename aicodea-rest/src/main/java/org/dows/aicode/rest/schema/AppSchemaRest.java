//package org.dows.aicode.rest.schema;
//
//import io.swagger.annotations.ApiOperation;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.Parameters;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import jakarta.annotation.Resource;
//import lombok.RequiredArgsConstructor;
//import org.dows.aicode.api.schema.request.AppSchemaRequest;
//import org.dows.aicode.biz.schema.AppSchemaBiz;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
///**
// * @author lait.zhang
// * @description project descr:元数据:档案分类字典接口
// * @date 2023年3月29日 下午2:25:05
// */
//@RequiredArgsConstructor
//@RestController
//@Tag(name = "档案分类字典接口", description = "系统用户接口")
//public class AppSchemaRest {
//    private final AppSchemaBiz appSchemaBiz;
//
//    /**
//     * 创建应用元数概要
//     *
//     * @param
//     * @return
//     */
//    @ApiResponse(responseCode = "2xx",description = "动物园实体对象")
//    @Operation(summary = "创建应用元数概要")
//    @PostMapping("v1/schema/appSchema/createAppSchema")
//    public String createAppSchema(@RequestBody @Validated AppSchemaRequest appSchema) {
//        return appSchemaBiz.createAppSchema(appSchema);
//    }
//
//}