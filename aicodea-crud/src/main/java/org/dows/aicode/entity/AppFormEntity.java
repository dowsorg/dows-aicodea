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
 * 应用-表单(AppForm)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:38
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppForm对象", description = "应用-表单")
@TableName("app_form")
public class AppFormEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("资源类目ID")
    private Long id;

    @ApiModelProperty("应用表单ID")
    private String appFormId;

    @ApiModelProperty("应用schemaId")
    private String appSchemaId;

    @ApiModelProperty("应用名")
    private String appName;

    @ApiModelProperty("应用码")
    private String appCode;

    @ApiModelProperty("页面ID")
    private String pageId;

    @ApiModelProperty("表单ID")
    private String formId;

    @ApiModelProperty("表单名称")
    private String formName;

    @ApiModelProperty("表单code")
    private String formCode;

    @ApiModelProperty("顺序")
    private Integer sorted;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("")
    private Date dt;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删除")
    private Boolean deleted;

}

