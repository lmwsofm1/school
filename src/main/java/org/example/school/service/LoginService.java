package org.example.school.service;

import org.example.school.domain.entity.UserLoginDTO;

public interface LoginService {
    String loginUser(UserLoginDTO userLoginDTO);
}
