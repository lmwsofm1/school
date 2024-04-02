package org.example.school.controller;


import org.example.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController{


    @GetMapping("/login")
  public String login(@RequestParam("userName") String userName,
                    @RequestParam("passWord") String passWord) {
    // 假设用户验证逻辑，这里简单地判断用户名和密码是否匹配
    if ("admin".equals(userName) && "password".equals(passWord)) {
        // 登录成功，跳转到首页或者其他页面
        return "redirect:/home";
    } else {
        // 登录失败，返回登录页面并显示错误消息
        return "redirect:/login?error";
    }
}
}
