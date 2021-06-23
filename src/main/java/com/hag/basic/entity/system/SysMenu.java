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
@ApiModel(value="SysMenu对象", description="")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("MENU_ID")
    private String menuId;

    @TableField("MENU_NAME")
    private String menuName;

    @TableField("MENU_URL")
    private String menuUrl;

    @TableField("PARENT_ID")
    private String parentId;

    @TableField("MENU_ORDER")
    private String menuOrder;

    @TableField("MENU_ICON")
    private String menuIcon;

    @TableField("MENU_TYPE")
    private String menuType;

    @TableField("MENU_CODE")
    private String menuCode;

    @TableField("MENU_SHOW")
    private String menuShow;

    @TableField("MENU_ISDEL")
    private String menuIsdel;


}
