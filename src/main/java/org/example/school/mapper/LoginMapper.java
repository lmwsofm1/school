package org.example.school.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.school.domain.entity.UserLoginDTO;

@Mapper
public interface LoginMapper {
    UserLoginDTO selectUserByUsernameAndPassword(String username,String password);
}
