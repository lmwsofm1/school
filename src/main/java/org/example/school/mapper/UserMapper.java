package org.example.school.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.school.domain.entity.User;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author lmw
 * @since 2024-03-31
 */
@Mapper
public interface UserMapper {

    List<User> list();

    User findByUserNameAndPassword(String userName, String passWord);

}
