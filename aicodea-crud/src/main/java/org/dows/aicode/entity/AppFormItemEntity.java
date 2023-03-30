package org.dows.aicode.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.api.CrudEntity;

/**
 * 应用-表单字段(AppFormItem)实体类
 *
 * @author lait
 * @since 2023-03-30 19:50:42
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name = "AppFormItem", title = "应用-表单字段")
@TableName("app_form_item")
public class AppFormItemEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "账号-菜单ID")
    private Long id;

    @Schema(title = "应用schemaId")
    private String appSchemaId;

    @Schema(title = "表单字段ID")
    private String appFormItemId;

    @Schema(title = "应用表单ID")
    private String appFormId;

    @Schema(title = "所属表名")
    private String affiliation;

    @Schema(title = "字段名称")
    private String fieldName;

    @Schema(title = "字段CODE")
    private String fieldCode;

    @Schema(title = "字段类型")
    private String fieldTyp;

    @Schema(title = "长度")
    private String length;

    @Schema(title = "字段输入类型(txt|input|select|checkbox..)")
    private String inputTyp;

    @Schema(title = "功能接口")
    private String funcApi;

    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "")
    private Date dt;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "是否逻辑删除")
    private Boolean deleted;

}

