package com.hag.basic.entity.pipeline;

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
@ApiModel(value="TPpPipelineDeptAssociated对象", description="")
public class TPpPipelineDeptAssociated implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("DEPT_ID")
    private String deptId;

    @TableField("PP_ID")
    private String ppId;


}
