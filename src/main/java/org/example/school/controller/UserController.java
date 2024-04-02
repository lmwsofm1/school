package org.example.school.controller;

import org.example.school.common.exception.MyBlogException;
import org.example.school.common.lang.Result;
import org.example.school.domain.entity.User;
import org.example.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author lmw
 * @since 2024-03-31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public Result list(){
        List<User> list=userService.list();
        if (list.size()<=0){
            throw new MyBlogException("当前用户不存在");
        }
        return Result.success(list);
    }


}
