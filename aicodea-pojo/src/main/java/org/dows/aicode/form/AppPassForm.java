package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用pass(AppPass)实体类
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
@Schema(name = "AppPass对象", title = "应用pass")
public class AppPassForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "节点ID")
    private Long id;


    @Schema(title = "应用schemaId")
    private String appSchemaId;


    @Schema(title = "应用passId")
    private String appPassId;


    @Schema(title = "pass名称")
    private String passName;


    @Schema(title = "passCode")
    private String passCode;


    @Schema(title = "主机地址")
    private String host;


    @Schema(title = "环境")
    private String env;


    @Schema(title = "端点配置")
    private String endpointConfig;


    @Schema(title = "是否集群")
    private Boolean cluster;


}

