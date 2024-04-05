package org.example.school.service.impl;

import org.example.school.domain.entity.UserLoginDTO;
import org.example.school.mapper.LoginMapper;
import org.example.school.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
     LoginMapper loginMapper;


    @Override
    public boolean loginUser(UserLoginDTO userLoginDTO) {

        String userName = userLoginDTO.getUserName();
        String passWord = userLoginDTO.getPassWord();

        // 进行登录验证逻辑
        UserLoginDTO dto = loginMapper.selectUserByUsernameAndPassword(userName, passWord);

        return dto.getUserName().equals(userName) && dto.getPassWord().equals(passWord);
    }

}
