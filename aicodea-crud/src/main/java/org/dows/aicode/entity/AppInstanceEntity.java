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
 * 应用-实例(AppInstance)实体类
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
@Schema(name = "AppInstance", title = "应用-实例")
@TableName("app_instance")
public class AppInstanceEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "数据库ID")
    private Long id;

    @Schema(title = "应用实例ID")
    private String appInstanceId;

    @Schema(title = "应用分类ID")
    private String categId;

    @Schema(title = "应用名称")
    private String categName;

    @Schema(title = "应用schemaId")
    private String appSchemaId;

    @Schema(title = "应用 id")
    private String appId;

    @Schema(title = "应用名称")
    private String appName;

    @Schema(title = "应用CODE")
    private String appCode;

    @Schema(title = "顺序")
    private Integer sorted;

    @Schema(title = "乐观锁, 默认: 0")
    private Integer ver;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "是否逻辑删")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "")
    private Date dt;

}

