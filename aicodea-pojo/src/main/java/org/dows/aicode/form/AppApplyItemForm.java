package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 申请资料条目(AppApplyItem)实体类
 *
 * @author lait
 * @since 2023-03-30 10:42:29
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name = "AppApplyItem对象", title = "申请资料条目")
public class AppApplyItemForm {

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


}

