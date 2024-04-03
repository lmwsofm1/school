package org.example.school.service.impl;

import org.example.school.domain.entity.User;
import org.example.school.mapper.UserMapper;

import org.example.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author lmw
 * @since 2024-03-31
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }


}
