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
 * 申请资料条目(AppApplyItem)实体类
 *
 * @author lait
 * @since 2023-03-29 15:18:36
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppApplyItem对象", description = "申请资料条目")
@TableName("app_apply_item")
public class AppApplyItemEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("申请资料条目ID")
    private String appApplyItemId;

    @ApiModelProperty("应用ID")
    private String appId;

    @ApiModelProperty("小程序名称")
    private String appName;

    @ApiModelProperty("应用或小程序申请订单编号")
    private String applyOrderNo;

    @ApiModelProperty("第三方平台申请单号（第三放平台回填）")
    private String platformOrderNo;

    @ApiModelProperty("")
    private String platformAccount;

    @ApiModelProperty("营业执照编号")
    private String certNo;

    @ApiModelProperty("营业执照名称")
    private String certName;

    @ApiModelProperty("法人")
    private String legalName;

    @ApiModelProperty("联系人手机")
    private String contactPhone;

    @ApiModelProperty("联系人")
    private String contactName;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("逻辑删除")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("时间戳")
    private Date dt;

}

