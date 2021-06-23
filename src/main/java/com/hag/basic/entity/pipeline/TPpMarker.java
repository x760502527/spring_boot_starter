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
@ApiModel(value="TPpMarker对象", description="")
public class TPpMarker implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("M_ID")
    private String mId;

    @TableField("PP_ID")
    private String ppId;

    @TableField("M_TYPE_ID")
    private String mTypeId;

    @TableField("M_NAME")
    private String mName;

    @TableField("M_LON")
    private Double mLon;

    @TableField("M_LAT")
    private Double mLat;

    @TableField("M_MAPALARM")
    private String mMapalarm;

    @TableField("M_MAPSHOW")
    private String mMapshow;

    @TableField("M_REMARK")
    private String mRemark;

    @TableField("M_PP_LOC")
    private String mPpLoc;

    @TableField("M_FIB_LOC")
    private String mFibLoc;

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
