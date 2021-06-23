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
 * 管道与设备对应关系
 * </p>
 *
 * @author dxcr
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TPpPipelineEquipMatchup对象", description="管道与设备对应关系")
public class TPpPipelineEquipMatchup implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("PEM_ID")
    private String pemId;

    @TableField("PP_ID")
    private String ppId;

    @TableField("EQ_ID")
    private String eqId;

    @TableField("PP_START_LOC")
    private Integer ppStartLoc;

    @TableField("PP_END_LOC")
    private Integer ppEndLoc;

    @TableField("FIB_START_LOC")
    private Integer fibStartLoc;

    @TableField("FIB_END_LOC")
    private Integer fibEndLoc;

    @TableField("EQ_DET_ORI_ID")
    private String eqDetOriId;

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
