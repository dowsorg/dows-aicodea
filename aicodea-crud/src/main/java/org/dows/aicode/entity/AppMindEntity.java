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
 * 应用脑图(AppMind)实体类
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
@ApiModel(value = "AppMind对象", description = "应用脑图")
@TableName("app_mind")
public class AppMindEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("数据库ID")
    private Long id;

    @ApiModelProperty("应用脑图ID")
    private String appMindId;

    @ApiModelProperty("应用schemaId")
    private String appSchemaId;

    @ApiModelProperty("接口json")
    private String apiJson;

    @ApiModelProperty("ddlJson")
    private String ddlJson;

    @ApiModelProperty("构建json")
    private String buildJson;

    @ApiModelProperty("配置json")
    private String configJson;

    @ApiModelProperty("版本")
    private String mindVersion;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("")
    private Date dt;

}

