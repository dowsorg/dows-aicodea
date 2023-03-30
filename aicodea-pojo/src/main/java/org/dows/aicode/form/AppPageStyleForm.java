package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用-页面样式(AppPageStyle)实体类
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
@Schema(name = "AppPageStyle对象", title = "应用-页面样式")
public class AppPageStyleForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "主键ID")
    private Long id;


    @Schema(title = "页面样式ID")
    private String appPageStyleId;


    @Schema(title = "应用schemaId")
    private String appSchemaId;


    @Schema(title = "页面ID")
    private String pageId;


    @Schema(title = "样式文件")
    private String cssStyle;


}

