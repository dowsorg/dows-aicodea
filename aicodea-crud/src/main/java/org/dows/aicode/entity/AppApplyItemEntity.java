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
 * 申请资料条目(AppApplyItem)实体类
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
@Schema(name = "AppApplyItem", title = "申请资料条目")
@TableName("app_apply_item")
public class AppApplyItemEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "主键ID")
    private Long id;

    @Schema(title = "申请资料条目ID")
    private String appApplyItemId;

    @Schema(title = "应用ID")
    private String appId;

    @Schema(title = "小程序名称")
    private String appName;

    @Schema(title = "应用或小程序申请订单编号")
    private String applyOrderNo;

    @Schema(title = "第三方平台申请单号（第三放平台回填）")
    private String platformOrderNo;

    @Schema(title = "")
    private String platformAccount;

    @Schema(title = "营业执照编号")
    private String certNo;

    @Schema(title = "营业执照名称")
    private String certName;

    @Schema(title = "法人")
    private String legalName;

    @Schema(title = "联系人手机")
    private String contactPhone;

    @Schema(title = "联系人")
    private String contactName;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "逻辑删除")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "时间戳")
    private Date dt;

}

