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
 * 应用schema(AppSchema)实体类
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
@Schema(name = "AppSchema", title = "应用schema")
@TableName("app_schema")
public class AppSchemaEntity implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "节点ID")
    private Long id;

    @Schema(title = "分类ID(分布式ID)")
    private String appCategoryId;

    @Schema(title = "应用schemaId")
    private String appSchemaId;

    @Schema(title = "应用类型")
    private String categId;

    @Schema(title = "分类名称")
    private String categName;

    @Schema(title = "应用名")
    private String appName;

    @Schema(title = "应用CODE")
    private String appCode;

    @Schema(title = "应用主页")
    private String appHome;

    @Schema(title = "描述")
    private String descr;

    @Schema(title = "创建者")
    private String creator;

    @Schema(title = "租户ID")
    private String tenantId;

    @Schema(title = "应用类型（0：app ，1：pc，2：云）")
    private Integer appTyp;

    @Schema(title = "顺序")
    private Integer sorted;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "是否逻辑删除: 0 未删除(false), 1 已删除(true); 默认: 0")
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "")
    private Date dt;

}

