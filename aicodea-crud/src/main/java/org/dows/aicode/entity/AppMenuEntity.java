package org.dows.aicode.entity;

import java.util.Date;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.mybatis.CrudEntity;

/**
 * 应用-菜单(AppMenu)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:40
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppMenu对象", description = "应用-菜单")
@TableName("app_menu")
public class AppMenuEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("账号-菜单ID")
    private Long id;

    @ApiModelProperty("父节点ID, 如果没有父节点则为: -1")
    private Long pid;

    @ApiModelProperty("应用schemaId")
    private String appSchemaId;

    @ApiModelProperty("应用菜单ID")
    private String appMenuId;

    @ApiModelProperty("页面ID")
    private String pageId;

    @ApiModelProperty("应用 id")
    private String appId;

    @ApiModelProperty("英文码")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    private String menuName;

    @ApiModelProperty("菜单值")
    private String menuVal;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("层级")
    private Integer level;

    @ApiModelProperty("排序")
    private Integer sorted;

    @ApiModelProperty("是否iframe: 1是, 0不是, 默认: 1")
    private Boolean frame;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("")
    private Date dt;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删除:")
    private Boolean deleted;

}

