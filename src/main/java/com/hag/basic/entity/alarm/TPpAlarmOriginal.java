package com.hag.basic.entity.alarm;

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
@ApiModel(value="TPpAlarmOriginal对象", description="")
public class TPpAlarmOriginal implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "设备编号")
    private String eqId;

    @ApiModelProperty(value = "设备分区编号")
    private String eptId;

    @ApiModelProperty(value = "报警级别ID")
    private String levelId;

    @ApiModelProperty(value = "报警光纤位置")
    private Integer fibLoc;

    @ApiModelProperty(value = "报警值")
    private Double value;

    @ApiModelProperty(value = "报警时间")
    private LocalDateTime datetime;

    @ApiModelProperty(value = "超过阈值次数")
    private Integer num;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "报警类型code（yx预警，wb误报，报警）")
    private String stateCode;

    @ApiModelProperty(value = "处理状态code(处理中，已解决，未处理)")
    private String disposeStatus;


}
