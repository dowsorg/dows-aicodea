package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用-页面(AppPage)实体类
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
@Schema(name = "AppPage对象", title = "应用-页面")
public class AppPageForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "主键ID")
    private Long id;


    @Schema(title = "应用页面ID")
    private String appPageId;


    @Schema(title = "应用schemaId")
    private String appSchemaId;


    @Schema(title = "应用名")
    private String appName;


    @Schema(title = "应用码")
    private String appCode;


    @Schema(title = "页面ID")
    private String pageId;


    @Schema(title = "页面编号")
    private String pageNo;


    @Schema(title = "页面名称")
    private String pageName;


    @Schema(title = "页面code")
    private String pageCode;


    @Schema(title = "页面url")
    private String pageUrl;


    @Schema(title = "页面描述")
    private String descr;


    @Schema(title = "顺序")
    private Integer sorted;


    @Schema(title = "乐观锁, 默认: 0")
    private Integer ver;


}

