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
 * 应用-实例(AppInstance)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:39
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppInstance对象", description = "应用-实例")
@TableName("app_instance")
public class AppInstanceEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("数据库ID")
    private Long id;

    @ApiModelProperty("应用实例ID")
    private String appInstanceId;

    @ApiModelProperty("应用分类ID")
    private String categId;

    @ApiModelProperty("应用名称")
    private String categName;

    @ApiModelProperty("应用schemaId")
    private String appSchemaId;

    @ApiModelProperty("应用 id")
    private String appId;

    @ApiModelProperty("应用名称")
    private String appName;

    @ApiModelProperty("应用CODE")
    private String appCode;

    @ApiModelProperty("顺序")
    private Integer sorted;

    @ApiModelProperty("乐观锁, 默认: 0")
    private Integer ver;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("")
    private Date dt;

}

