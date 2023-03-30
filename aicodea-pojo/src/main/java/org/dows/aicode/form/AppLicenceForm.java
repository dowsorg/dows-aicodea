package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用-序列号(AppLicence)实体类
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
@Schema(name = "AppLicence对象", title = "应用-序列号")
public class AppLicenceForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "主键（数据库自增）")
    private Long id;


    @Schema(title = "应用序列号ID")
    private String appLicenceId;


    @Schema(title = "secretId")
    private String secretId;


    @Schema(title = "secretKey")
    private String secretKey;


    @Schema(title = "应用key")
    private String appKey;


    @Schema(title = "应用ID")
    private String appId;


    @Schema(title = "账号ID")
    private String accountId;


    @Schema(title = "租户ID")
    private String tenantId;


    @Schema(title = "状态（0:关，1:开,默认关）")
    private Boolean status;


}

