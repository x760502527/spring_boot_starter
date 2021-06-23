package com.hag.basic.a.entity;

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
@ApiModel(value="TAlarmDisposeHistory对象", description="")
public class TAlarmDisposeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String alarmId;

    private String stateCode;

    private String disposeStatus;

    private String remarks;

    @ApiModelProperty(value = "处理类别")
    private String disposeType;

    @ApiModelProperty(value = "处理时间")
    private LocalDateTime disposeTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "处理人")
    private String createBy;

    private String delFlag;


}
