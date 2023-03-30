package org.dows.aicode.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.api.CrudEntity;

/**
 * 应用申请(AppApply)实体类
 *
 * @author lait
 * @since 2023-03-30 19:50:42
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name = "AppApply", title = "应用申请")
@TableName("app_apply")
public class AppApplyEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "主键ID")
    private Long id;

    @Schema(title = "应用申请ID")
    private String appApplyId;

    @Schema(title = "应用类型")
    private String categId;

    @Schema(title = "应用或小程序申请订单编号(全局唯一)")
    private String applyOrderNo;

    @Schema(title = "应用ID(申请审核通过后回填)")
    private String appId;

    @Schema(title = "应用名称")
    private String appName;

    @Schema(title = "")
    private String platform;

    @Schema(title = "第三方平台申请单号（第三放平台审核通过后回填）")
    private String platformOrderNo;

    @Schema(title = "第三方平台关联应用ID（第三放平台审核通过后回填）")
    private String platformAppId;

    @Schema(title = "申请人")
    private String applicant;

    @Schema(title = "租户名称（付费对象）")
    private String tenantName;

    @Schema(title = "租户ID")
    private String tenantId;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "逻辑删除")
    private Boolean deleted;

    @Schema(title = "申请通过时间")
    private Date appliedTime;

    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "时间戳")
    private Date dt;

}

