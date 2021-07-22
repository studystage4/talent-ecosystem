package com.street.controller;

import com.street.pojo.Enterprise;
import com.street.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/21 09:43
 * @desc:
 */

@RestController
public class UserController {
    @ApiOperation("用户实体类")
    @GetMapping("/user")
    @ResponseBody
    public User user(){
        User user = new User();
        return user;
    }

    @ApiOperation("企业实体类")
    @GetMapping("/enterprise")
    @ResponseBody
    public Enterprise enterprise(){
        Enterprise enterprise = new Enterprise();
        return enterprise;
    }
}
