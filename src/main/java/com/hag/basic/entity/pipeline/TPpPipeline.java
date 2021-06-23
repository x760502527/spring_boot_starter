package com.hag.basic.entity.pipeline;

import java.time.LocalDate;
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
@ApiModel(value="TPpPipeline对象", description="")
public class TPpPipeline implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("PP_ID")
    private String ppId;

    @TableField("PP_NAME")
    private String ppName;

    @TableField("PP_ALIAS")
    private String ppAlias;

    @TableField("PP_TYPE_ID")
    private String ppTypeId;

    @TableField("PP_DEP")
    private String ppDep;

    @TableField("PP_LEN")
    private Integer ppLen;

    @TableField("PP_COMMISSION_DATE")
    private LocalDate ppCommissionDate;

    @TableField("PP_ORD_BY")
    private Integer ppOrdBy;

    @TableField("PP_REMARK")
    private String ppRemark;

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
