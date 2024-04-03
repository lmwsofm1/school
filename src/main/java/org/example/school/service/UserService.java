package org.example.school.service;

import org.apache.ibatis.annotations.Param;
import org.example.school.domain.entity.User;

import java.util.List;

/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author lmw
 * @since 2024-03-31
 */
    public interface UserService {

    List<User>list();


    User login(String userName, String passWord);


}
