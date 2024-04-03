package org.example.school.controller;


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
     public String login(@RequestBody(required = false) UserLoginDTO userLoginDTO) {

        return loginService.loginUser(userLoginDTO);

    }
}
