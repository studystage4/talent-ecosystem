package com.street.controller;

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
    @ApiOperation("用户欢迎页")
    @GetMapping("/hello")
    @ResponseBody
    public User hello(){
        User user = new User();
        user.setId(1).setName("234");
        return user;
    }
}
