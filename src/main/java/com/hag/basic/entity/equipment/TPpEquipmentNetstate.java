package com.hag.basic.entity.equipment;

import java.time.LocalDateTime;
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
@ApiModel(value="TPpEquipmentNetstate对象", description="")
public class TPpEquipmentNetstate implements Serializable {

    private static final long serialVersionUID = 1L;

    private String deviceName;

    private String deviceId;

    @ApiModelProperty(value = "设备状态")
    private Boolean deviceState;

    private String piplineId;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTimes;


}
