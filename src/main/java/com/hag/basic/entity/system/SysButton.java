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
@ApiModel(value="SysButton对象", description="")
public class SysButton implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("BUTTON_ID")
    private String buttonId;

    @TableField("BUTTON_NAME")
    private String buttonName;

    @TableField("BUTTON_CODE")
    private String buttonCode;

    @TableField("BUTTON_ORDER")
    private String buttonOrder;

    @TableField("BUTTON_DESCP")
    private String buttonDescp;


}
