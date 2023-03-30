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
 * 应用-页面样式(AppPageStyle)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:42
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppPageStyle对象", description = "应用-页面样式")
@TableName("app_page_style")
public class AppPageStyleEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("页面样式ID")
    private String appPageStyleId;

    @ApiModelProperty("应用schemaId")
    private String appSchemaId;

    @ApiModelProperty("页面ID")
    private String pageId;

    @ApiModelProperty("样式文件")
    private String cssStyle;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("")
    private Date dt;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删除")
    private Boolean deleted;

}

