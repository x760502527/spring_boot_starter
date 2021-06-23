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
 * 管道分区数据
 * </p>
 *
 * @author dxcr
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TPpPipelinePart对象", description="管道分区数据")
public class TPpPipelinePart implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    @TableId("PPT_ID")
    private String pptId;

    @ApiModelProperty(value = "管道编号")
    @TableField("PP_ID")
    private String ppId;

    @ApiModelProperty(value = "管道分区顺序编号")
    @TableField("PPT_ORD_BY")
    private Integer pptOrdBy;

    @ApiModelProperty(value = "名称")
    @TableField("PPT_NAME")
    private String pptName;

    @ApiModelProperty(value = "起始位置")
    @TableField("PPT_START_LOC")
    private Integer pptStartLoc;

    @ApiModelProperty(value = "长度")
    @TableField("PPT_LEN")
    private Integer pptLen;

    @ApiModelProperty(value = "备注")
    @TableField("PPT_REMARK")
    private String pptRemark;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATE_UID")
    private String createUid;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改人")
    @TableField("CHANGE_UID")
    private String changeUid;

    @ApiModelProperty(value = "修改时间")
    @TableField("CHANGE_TIME")
    private LocalDateTime changeTime;

    @ApiModelProperty(value = "逻辑删除标识(1未删除、0或null已删除)")
    @TableField("DEL_STATE")
    private String delState;


}
