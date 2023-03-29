package org.dows.aicode.api.schema.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;
import java.math.BigDecimal;

/**
* @description 
*
* @author 
* @date 
*/
@Data
@NoArgsConstructor
@ApiModel(value = "AppSchema 对象", description = "应用概要")
public class AppSchemaRequest{
    @ApiModelProperty("应用分类ID")
    private String appCategoryId;

    @ApiModelProperty("应用名")
    private String appName;

    @ApiModelProperty("应用CODE")
    private String appCode;

    @ApiModelProperty("pass配置")
    private String passConfig;


}
