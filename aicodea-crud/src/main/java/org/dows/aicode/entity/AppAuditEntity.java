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
 * 应用审核(AppAudit)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:37
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppAudit对象", description = "应用审核")
@TableName("app_audit")
public class AppAuditEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("应用审核ID")
    private String appAuditId;

    @ApiModelProperty("应用ID")
    private String appId;

    @ApiModelProperty("审核人")
    private String checkedUser;

    @ApiModelProperty("审核时间")
    private Date checkedTime;

    @ApiModelProperty("审核描述")
    private String checkedDescr;

    @ApiModelProperty("审核人员名称")
    private String checkedUserName;

    @ApiModelProperty("申请人名称")
    private String accountName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("申请状态(0：不通过，1：通过,2:审核中)")
    private Integer status;

    @ApiModelProperty("0启用1禁用")
    private Boolean disabled;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("逻辑删除")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("时间戳")
    private Date dt;

}

