package org.example.school.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.school.domain.entity.User;


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

}
