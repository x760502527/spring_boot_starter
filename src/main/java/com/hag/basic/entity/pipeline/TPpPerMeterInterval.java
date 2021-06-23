package com.hag.basic.entity.pipeline;

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
@ApiModel(value="TPpPerMeterInterval对象", description="")
public class TPpPerMeterInterval implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("PMI_ID")
    private String pmiId;

    @TableField("PP_ID")
    private String ppId;

    @TableField("IPC_ID")
    private String ipcId;

    @TableField("IPC_ORD_BY")
    private Integer ipcOrdBy;

    @TableField("PMI_LNG")
    private Double pmiLng;

    @TableField("PMI_LAT")
    private Double pmiLat;

    @TableField("PMI_REMARK")
    private String pmiRemark;

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
