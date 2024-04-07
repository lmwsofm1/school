package org.example.school.controller;



import org.example.school.common.lang.Result;
import org.example.school.domain.entity.UserLoginDTO;
import org.example.school.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController{



    @Autowired
    LoginService loginService;
    @RequestMapping("/login")
    public Result login(@RequestBody UserLoginDTO userLoginDTO)  {
        boolean loginSuccess = loginService.loginUser(userLoginDTO);

        if (loginSuccess) {
            return Result.success("登录成功");
        } else {
            return Result.failure("用户名或密码错误");
        }
    }

}
