package org.example.school.service.impl;

import org.example.school.domain.entity.Class;
import org.example.school.mapper.ClassMapper;
import org.example.school.service.ClassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 班级信息表 服务实现类
 * </p>
 *
 * @author lmw
 * @since 2024-04-05
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassMapper classMapper;


    @Override
    public List<Class> Listclass() {
        return classMapper.Listclass();
    }
}
