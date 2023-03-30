package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用-表单(AppForm)实体类
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
@Schema(name = "AppForm对象", title = "应用-表单")
public class AppFormForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "资源类目ID")
    private Long id;


    @Schema(title = "应用表单ID")
    private String appFormId;


    @Schema(title = "应用schemaId")
    private String appSchemaId;


    @Schema(title = "应用名")
    private String appName;


    @Schema(title = "应用码")
    private String appCode;


    @Schema(title = "页面ID")
    private String pageId;


    @Schema(title = "表单ID")
    private String formId;


    @Schema(title = "表单名称")
    private String formName;


    @Schema(title = "表单code")
    private String formCode;


    @Schema(title = "顺序")
    private Integer sorted;


}

