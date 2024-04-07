package org.example.school.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.school.domain.entity.Class;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 班级信息表 Mapper 接口
 * </p>
 *
 * @author lmw
 * @since 2024-04-05
 */
@Mapper
public interface ClassMapper {

    List<Class>Listclass();

}
