package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用脑图(AppMind)实体类
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
@Schema(name = "AppMind对象", title = "应用脑图")
public class AppMindForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "数据库ID")
    private Long id;


    @Schema(title = "应用脑图ID")
    private String appMindId;


    @Schema(title = "应用schemaId")
    private String appSchemaId;


    @Schema(title = "接口json")
    private String apiJson;


    @Schema(title = "ddlJson")
    private String ddlJson;


    @Schema(title = "构建json")
    private String buildJson;


    @Schema(title = "配置json")
    private String configJson;


    @Schema(title = "版本")
    private String mindVersion;


}

