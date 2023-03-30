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
 * 应用-序列号(AppLicence)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:39
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppLicence对象", description = "应用-序列号")
@TableName("app_licence")
public class AppLicenceEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键（数据库自增）")
    private Long id;

    @ApiModelProperty("应用序列号ID")
    private String appLicenceId;

    @ApiModelProperty("secretId")
    private String secretId;

    @ApiModelProperty("secretKey")
    private String secretKey;

    @ApiModelProperty("应用key")
    private String appKey;

    @ApiModelProperty("应用ID")
    private String appId;

    @ApiModelProperty("账号ID")
    private String accountId;

    @ApiModelProperty("租户ID")
    private String tenantId;

    @ApiModelProperty("状态（0:关，1:开,默认关）")
    private Boolean status;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("逻辑删除")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("时间戳")
    private Date dt;

}

