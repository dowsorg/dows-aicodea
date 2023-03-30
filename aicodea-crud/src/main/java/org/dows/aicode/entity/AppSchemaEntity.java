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
 * 应用schema(AppSchema)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:43
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppSchema对象", description = "应用schema")
@TableName("app_schema")
public class AppSchemaEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("节点ID")
    private Long id;

    @ApiModelProperty("分类ID(分布式ID)")
    private String appCategoryId;

    @ApiModelProperty("应用schemaId")
    private String appSchemaId;

    @ApiModelProperty("应用类型")
    private String categId;

    @ApiModelProperty("分类名称")
    private String categName;

    @ApiModelProperty("应用名")
    private String appName;

    @ApiModelProperty("应用CODE")
    private String appCode;

    @ApiModelProperty("应用主页")
    private String appHome;

    @ApiModelProperty("描述")
    private String descr;

    @ApiModelProperty("创建者")
    private String creator;

    @ApiModelProperty("租户ID")
    private String tenantId;

    @ApiModelProperty("应用类型（0：app ，1：pc，2：云）")
    private Integer appTyp;

    @ApiModelProperty("顺序")
    private Integer sorted;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删除: 0 未删除(false), 1 已删除(true); 默认: 0")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("")
    private Date dt;

}

