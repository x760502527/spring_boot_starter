package com.hag.basic.entity.system;

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
@ApiModel(value="SysFilesUploads对象", description="")
public class SysFilesUploads implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文件名")
    @TableField("FILE_NAME")
    private String fileName;

    @TableField("BASE_PATH")
    private String basePath;

    @ApiModelProperty(value = "路径")
    @TableField("PATH")
    private String path;

    @ApiModelProperty(value = "文件大小")
    @TableField("FILE_SIZE")
    private String fileSize;

    @ApiModelProperty(value = "文件类型")
    @TableField("FILE_TYPE")
    private String fileType;

    @ApiModelProperty(value = "主键ID")
    @TableField("MASTER_ID")
    private String masterId;

    @ApiModelProperty(value = "状态（0有效 1无效）")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "上传人ID")
    @TableField("CREATE_ID")
    private String createId;

    @ApiModelProperty(value = "上传时间")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;


}
