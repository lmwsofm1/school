package org.example.school.service.impl;

import org.example.school.domain.entity.UserLoginDTO;
import org.example.school.mapper.LoginMapper;
import org.example.school.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper userMapper;
    @Override
    public String loginUser(UserLoginDTO userLoginDTO) {
        return null;
    }
}
