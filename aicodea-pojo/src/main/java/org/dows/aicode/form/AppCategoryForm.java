package org.dows.aicode.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 应用分类(AppCategory)实体类
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
@Schema(name = "AppCategory对象", title = "应用分类")
public class AppCategoryForm {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "资源类目ID")
    private Long id;


    @Schema(title = "父节点ID")
    private Long pid;


    @Schema(title = "分类ID(分布式ID)")
    private String appCategoryId;


    @Schema(title = "应用分类名称")
    private String categName;


    @Schema(title = "应用分类code")
    private String categCode;


    @Schema(title = "描述")
    private String descr;


    @Schema(title = "顺序")
    private Integer sorted;


    @Schema(title = "乐观锁, 默认: 0")
    private Integer ver;


}

