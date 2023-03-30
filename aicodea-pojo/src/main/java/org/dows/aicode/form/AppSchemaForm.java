package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用schema(AppSchema)实体类
 *
 * @author lait
 * @since 2023-03-30 10:42:30
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name = "AppSchema对象", title = "应用schema")
public class AppSchemaForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "节点ID")
    private Long id;


    @Schema(title = "分类ID(分布式ID)")
    private String appCategoryId;


    @Schema(title = "应用schemaId")
    private String appSchemaId;


    @Schema(title = "应用类型")
    private String categId;


    @Schema(title = "分类名称")
    private String categName;


    @Schema(title = "应用名")
    private String appName;


    @Schema(title = "应用CODE")
    private String appCode;


    @Schema(title = "应用主页")
    private String appHome;


    @Schema(title = "描述")
    private String descr;


    @Schema(title = "创建者")
    private String creator;


    @Schema(title = "租户ID")
    private String tenantId;


    @Schema(title = "应用类型（0：app ，1：pc，2：云）")
    private Integer appTyp;


    @Schema(title = "顺序")
    private Integer sorted;


}

