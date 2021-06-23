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
 * 管道拐点坐标
 * </p>
 *
 * @author dxcr
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TPpInflexCoordinate对象", description="管道拐点坐标")
public class TPpInflexCoordinate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("IPC_ID")
    private String ipcId;

    @TableField("PP_ID")
    private String ppId;

    @TableField("IPC_ORD_BY")
    private Integer ipcOrdBy;

    @TableField("IPC_LNG")
    private Double ipcLng;

    @TableField("IPC_LAT")
    private Double ipcLat;

    @TableField("IPC_REMARK")
    private String ipcRemark;

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

    @ApiModelProperty(value = "所在管道米数")
    @TableField("IPC_LOC")
    private Integer ipcLoc;


}
