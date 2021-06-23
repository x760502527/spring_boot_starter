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
@ApiModel(value="SysDictionaries对象", description="")
public class SysDictionaries implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("NAME")
    private String name;

    @TableField("CODE")
    private String code;

    @TableField("SORTORDER")
    private Integer sortorder;

    @TableField("PID")
    private String pid;

    @TableField("LEVELS")
    private Integer levels;

    @TableField("PCODE")
    private String pcode;

    @TableField("DESCP")
    private String descp;

    @TableField("ISDEL")
    private String isdel;


}
