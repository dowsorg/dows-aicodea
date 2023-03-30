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
 * 应用-页面(AppPage)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:41
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppPage对象", description = "应用-页面")
@TableName("app_page")
public class AppPageEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("应用页面ID")
    private String appPageId;

    @ApiModelProperty("应用schemaId")
    private String appSchemaId;

    @ApiModelProperty("应用名")
    private String appName;

    @ApiModelProperty("应用码")
    private String appCode;

    @ApiModelProperty("页面ID")
    private String pageId;

    @ApiModelProperty("页面编号")
    private String pageNo;

    @ApiModelProperty("页面名称")
    private String pageName;

    @ApiModelProperty("页面code")
    private String pageCode;

    @ApiModelProperty("页面url")
    private String pageUrl;

    @ApiModelProperty("页面描述")
    private String descr;

    @ApiModelProperty("顺序")
    private Integer sorted;

    @ApiModelProperty("乐观锁, 默认: 0")
    private Integer ver;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("")
    private Date dt;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删除")
    private Boolean deleted;

}

