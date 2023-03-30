package org.dows.aicode.entity;

import java.util.Date;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.mybatis.CrudEntity;

/**
 * 应用pass(AppPass)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:42
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppPass对象", description = "应用pass")
@TableName("app_pass")
public class AppPassEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("节点ID")
    private Long id;

    @ApiModelProperty("应用schemaId")
    private String appSchemaId;

    @ApiModelProperty("应用passId")
    private String appPassId;

    @ApiModelProperty("pass名称")
    private String passName;

    @ApiModelProperty("passCode")
    private String passCode;

    @ApiModelProperty("主机地址")
    private String host;

    @ApiModelProperty("环境")
    private String env;

    @ApiModelProperty("端点配置")
    private String endpointConfig;

    @ApiModelProperty("是否集群")
    private Boolean cluster;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("")
    private Date dt;

}

