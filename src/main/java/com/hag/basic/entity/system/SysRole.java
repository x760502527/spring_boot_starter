package com.hag.basic.entity.system;

import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="SysRole对象", description="")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ROLE_ID")
    private String roleId;

    @TableField("ROLE_NAME")
    private String roleName;

    @TableField("ROLE_ORDER")
    private String roleOrder;

    @TableField("ROLE_VIS")
    private Integer roleVis;

    @TableField("ROLE_CODE")
    private String roleCode;


}
