package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用-菜单(AppMenu)实体类
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
@Schema(name = "AppMenu对象", title = "应用-菜单")
public class AppMenuForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "账号-菜单ID")
    private Long id;


    @Schema(title = "父节点ID, 如果没有父节点则为: -1")
    private Long pid;


    @Schema(title = "应用schemaId")
    private String appSchemaId;


    @Schema(title = "应用菜单ID")
    private String appMenuId;


    @Schema(title = "页面ID")
    private String pageId;


    @Schema(title = "应用 id")
    private String appId;


    @Schema(title = "英文码")
    private String menuCode;


    @Schema(title = "菜单名称")
    private String menuName;


    @Schema(title = "菜单值")
    private String menuVal;


    @Schema(title = "图标")
    private String icon;


    @Schema(title = "层级")
    private Integer level;


    @Schema(title = "排序")
    private Integer sorted;


    @Schema(title = "是否iframe: 1是, 0不是, 默认: 1")
    private Boolean frame;


}

