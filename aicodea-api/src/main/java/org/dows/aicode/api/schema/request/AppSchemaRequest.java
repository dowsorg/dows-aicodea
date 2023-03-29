package org.dows.aicode.api.schema.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author
 * @description
 * @date
 */
@Data
@NoArgsConstructor
@Schema(name = "AppSchema 对象", title = "应用概要")
public class AppSchemaRequest {
    @Schema(title = "应用分类ID")
    private String appCategoryId;

    @Schema(title = "应用名")
    private String appName;

    @Schema(title = "应用CODE")
    private String appCode;

    @Schema(title = "pass配置")
    private String passConfig;


}
