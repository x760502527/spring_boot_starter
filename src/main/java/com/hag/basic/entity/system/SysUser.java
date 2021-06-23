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
 * 
 * </p>
 *
 * @author dxcr
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysUser对象", description="")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("USER_ID")
    private String userId;

    @TableField("USERNAME")
    private String username;

    @TableField("PASSWORD")
    private String password;

    @TableField("NAME")
    private String name;

    @TableField("LAST_LOGIN")
    private String lastLogin;

    @TableField("IP")
    private String ip;

    @TableField("STATUS")
    private String status;

    @TableField("BZ")
    private String bz;

    @TableField("SKIN")
    private String skin;

    @TableField("EMAIL")
    private String email;

    @TableField("SNUMBER")
    private String snumber;

    @TableField("PHONE")
    private String phone;

    @TableField("DEPT_ID")
    private Integer deptId;

    @TableField("NEED_GUIDE")
    private String needGuide;

    @TableField("CREATE_UID")
    private String createUid;

    @ApiModelProperty(value = "datetime")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("CHANGE_UID")
    private String changeUid;

    @TableField("CHANGE_TIME")
    private LocalDateTime changeTime;

    @TableField("DEL_STATE")
    private String delState;


}
