package com.hag.basic.entity.equipment;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 设备阈值数据
 * </p>
 *
 * @author dxcr
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TPpEquipmentThresholdValue对象", description="设备阈值数据")
public class TPpEquipmentThresholdValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    @TableId("ETV_ID")
    private String etvId;

    @ApiModelProperty(value = "设备编号")
    @TableField("EQ_ID")
    private String eqId;

    @ApiModelProperty(value = "设备分区编号")
    @TableField("EPT_ID")
    private String eptId;

    @ApiModelProperty(value = "报警类型")
    @TableField("EQ_ALARM_TYPE_ID")
    private String eqAlarmTypeId;

    @ApiModelProperty(value = "报警级别")
    @TableField("EQ_ALARM_LEVEL_ID")
    private String eqAlarmLevelId;

    @ApiModelProperty(value = "备注")
    @TableField("ETV_REMARK")
    private String etvRemark;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATE_UID")
    private String createUid;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private LocalDate createTime;

    @ApiModelProperty(value = "修改人")
    @TableField("CHANGE_UID")
    private String changeUid;

    @ApiModelProperty(value = "修改时间")
    @TableField("CHANGE_TIME")
    private LocalDate changeTime;

    @ApiModelProperty(value = "逻辑删除标识(1未删除、0或null已删除)")
    @TableField("DEL_STATE")
    private String delState;


}
