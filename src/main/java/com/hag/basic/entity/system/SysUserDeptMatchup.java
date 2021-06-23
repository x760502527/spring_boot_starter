package com.hag.basic.entity.system;

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
 * 用户与班组对应联系表
 * </p>
 *
 * @author dxcr
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysUserDeptMatchup对象", description="用户与班组对应联系表")
public class SysUserDeptMatchup implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    @TableId("UDM_ID")
    private String udmId;

    @ApiModelProperty(value = "班组编号")
    @TableField("DEPT_ID")
    private String deptId;

    @ApiModelProperty(value = "员工编号")
    @TableField("USER_ID")
    private String userId;

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
