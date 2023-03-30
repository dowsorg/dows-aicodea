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
 * 应用-表单字段(AppFormItem)实体类
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
@ApiModel(value = "AppFormItem对象", description = "应用-表单字段")
@TableName("app_form_item")
public class AppFormItemEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("账号-菜单ID")
    private Long id;

    @ApiModelProperty("应用schemaId")
    private String appSchemaId;

    @ApiModelProperty("表单字段ID")
    private String appFormItemId;

    @ApiModelProperty("应用表单ID")
    private String appFormId;

    @ApiModelProperty("所属表名")
    private String affiliation;

    @ApiModelProperty("字段名称")
    private String fieldName;

    @ApiModelProperty("字段CODE")
    private String fieldCode;

    @ApiModelProperty("字段类型")
    private String fieldTyp;

    @ApiModelProperty("长度")
    private String length;

    @ApiModelProperty("字段输入类型(txt|input|select|checkbox..)")
    private String inputTyp;

    @ApiModelProperty("功能接口")
    private String funcApi;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("")
    private Date dt;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删除")
    private Boolean deleted;

}

