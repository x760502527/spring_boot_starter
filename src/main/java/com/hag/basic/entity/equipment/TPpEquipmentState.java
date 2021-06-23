package com.hag.basic.entity.equipment;

import java.time.LocalDateTime;
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
@ApiModel(value="TPpEquipmentState对象", description="")
public class TPpEquipmentState implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("disksUsed")
    private String disksused;

    @TableField("EQ_ID")
    private String eqId;

    @TableField("exBytes")
    private String exbytes;

    @TableField("txBytes")
    private String txbytes;

    @TableField("cpuUsed")
    private String cpuused;

    @TableField("freeUsed")
    private String freeused;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
