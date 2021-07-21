package com.street.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @date: 2021/7/20 22:57
 * @desc:
 */
//123
    ///1234444444
@Data
@TableName("user")
@ApiModel(value = "用户实体类")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)     //链式写法
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键Id")
    private int id;

    @ApiModelProperty(value = "用户名")
    private String name;

}
