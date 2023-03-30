package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用-表单字段(AppFormItem)实体类
 *
 * @author lait
 * @since 2023-03-30 10:42:29
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name = "AppFormItem对象", title = "应用-表单字段")
public class AppFormItemForm {

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


}

