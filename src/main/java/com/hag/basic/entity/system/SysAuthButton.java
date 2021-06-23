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
@ApiModel(value="SysAuthButton对象", description="")
public class SysAuthButton implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("AUTH_ID")
    private String authId;

    @TableField("ROLE_ID")
    private String roleId;

    @TableField("MENU_ID")
    private String menuId;

    @TableField("BUTTON_ID")
    private String buttonId;


}
