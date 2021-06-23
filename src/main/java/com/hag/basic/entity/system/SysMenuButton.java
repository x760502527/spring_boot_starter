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
@ApiModel(value="SysMenuButton对象", description="")
public class SysMenuButton implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "菜单id")
    @TableField("MENU_ID")
    private String menuId;

    @ApiModelProperty(value = "按钮id")
    @TableField("BUTTON_ID")
    private String buttonId;

    @ApiModelProperty(value = "MB_ID")
    @TableId("MB_ID")
    private Integer mbId;


}
