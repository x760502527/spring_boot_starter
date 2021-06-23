package com.hag.basic.entity.equipment;

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
@ApiModel(value="TEqThreshold对象", description="")
public class TEqThreshold implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "关联设备表ID")
    @TableField("EQ_ID")
    private String eqId;

    @ApiModelProperty(value = "分区名称")
    private String name;

    @ApiModelProperty(value = "开始长度")
    @TableField("startLoc")
    private Integer startloc;

    @ApiModelProperty(value = "结束长度")
    @TableField("endLoc")
    private Integer endloc;

    @ApiModelProperty(value = "一级报警")
    @TableField("firstAlarm")
    private Integer firstalarm;

    @ApiModelProperty(value = "二级报警")
    @TableField("secordAlarm")
    private Integer secordalarm;

    @ApiModelProperty(value = "三级报警")
    @TableField("thirdAlarm")
    private Integer thirdalarm;

    @ApiModelProperty(value = "温升")
    @TableField("temperatureRise")
    private Integer temperaturerise;

    @ApiModelProperty(value = "温差")
    @TableField("temperatureDifference")
    private Integer temperaturedifference;


}
