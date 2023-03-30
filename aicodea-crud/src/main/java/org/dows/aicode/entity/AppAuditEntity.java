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
 * 应用审核(AppAudit)实体类
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
@Schema(name = "AppAudit", title = "应用审核")
@TableName("app_audit")
public class AppAuditEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "主键ID")
    private Long id;

    @Schema(title = "应用审核ID")
    private String appAuditId;

    @Schema(title = "应用ID")
    private String appId;

    @Schema(title = "审核人")
    private String checkedUser;

    @Schema(title = "审核时间")
    private Date checkedTime;

    @Schema(title = "审核描述")
    private String checkedDescr;

    @Schema(title = "审核人员名称")
    private String checkedUserName;

    @Schema(title = "申请人名称")
    private String accountName;

    @Schema(title = "备注")
    private String remark;

    @Schema(title = "申请状态(0：不通过，1：通过,2:审核中)")
    private Integer status;

    @Schema(title = "0启用1禁用")
    private Boolean disabled;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "逻辑删除")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "时间戳")
    private Date dt;

}

