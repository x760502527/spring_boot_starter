package com.hag.basic.entity.pipeline;

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
 * 管道标定数据
 * </p>
 *
 * @author dxcr
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TPpStandardization对象", description="管道标定数据")
public class TPpStandardization implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    @TableId("S_ID")
    private String sId;

    @ApiModelProperty(value = "管道编号")
    @TableField("PP_ID")
    private String ppId;

    @ApiModelProperty(value = "拐点坐标编号")
    @TableField("PMI_ID")
    private String pmiId;

    @ApiModelProperty(value = "拐点坐标顺序编号")
    @TableField("PMI_ORD_BY")
    private Integer pmiOrdBy;

    @ApiModelProperty(value = "光纤标定设备类型")
    @TableField("EQ_TYPE_ID")
    private String eqTypeId;

    @ApiModelProperty(value = "光纤标定位置")
    @TableField("S_FIB_STA_LOC")
    private Double sFibStaLoc;

    @ApiModelProperty(value = "备注")
    @TableField("S_REMARK")
    private String sRemark;

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
