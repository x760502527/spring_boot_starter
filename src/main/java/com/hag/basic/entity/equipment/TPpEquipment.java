package com.hag.basic.entity.equipment;

import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="TPpEquipment对象", description="")
public class TPpEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("EQ_ID")
    private String eqId;

    @TableField("EQT_ID")
    private String eqtId;

    @TableField("EQ_SERIAL_NUM")
    private String eqSerialNum;

    @TableField("EQ_NAME")
    private String eqName;

    @TableField("EQ_TYPE_ID")
    private String eqTypeId;

    @TableField("EQ_SUB_TYPE_ID")
    private String eqSubTypeId;

    @TableField("EQ_CHN_NUM")
    private Integer eqChnNum;

    @TableField("EQ_PHONE")
    private String eqPhone;

    @TableField("EQ_IP")
    private String eqIp;

    @TableField("EQ_PORT")
    private Integer eqPort;

    @TableField("EQ_REMARK")
    private String eqRemark;

    @TableField("CREATE_UID")
    private String createUid;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("CHANGE_UID")
    private String changeUid;

    @TableField("CHANGE_TIME")
    private LocalDateTime changeTime;

    @TableField("DEL_STATE")
    private String delState;


}
