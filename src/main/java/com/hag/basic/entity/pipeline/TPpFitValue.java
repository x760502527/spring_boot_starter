package com.hag.basic.entity.pipeline;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 多参量拟合表
 * </p>
 *
 * @author dxcr
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TPpFitValue对象", description="多参量拟合表")
public class TPpFitValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "数据时间")
    private Long dtTime;

    @ApiModelProperty(value = "管道id")
    private String ppId;

    @ApiModelProperty(value = "设备id")
    private String eqId;

    @ApiModelProperty(value = "管道开始")
    private Integer startLen;

    @ApiModelProperty(value = "管道结束")
    private Integer endLen;

    @ApiModelProperty(value = "输差")
    private BigDecimal range;

    @ApiModelProperty(value = "报警米数")
    private BigDecimal alarmDistance;

    @ApiModelProperty(value = "报警级别")
    private String alarmType;

    private BigDecimal fitValue;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


}
