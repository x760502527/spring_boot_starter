package com.hag.basic.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author dxcr
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysDept对象", description="")
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("DEPT_ID")
    private String deptId;

    @TableField("DEPT_NAME")
    private String deptName;

    @TableField("DEPT_ORDER")
    private String deptOrder;

    @TableField("PARENT_ID")
    private String parentId;


}
