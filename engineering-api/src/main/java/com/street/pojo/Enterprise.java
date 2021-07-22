package com.street.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/22 14:54
 * @desc:
 */
@Data
@TableName("user")
@ApiModel(value = "企业实体类")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)     //链式写法
public class Enterprise {
    @ApiModelProperty(value = "主键Id")
    private int enterprise_id;
}
