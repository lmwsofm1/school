package org.example.school.controller;

import org.example.school.common.exception.MyBlogException;
import org.example.school.common.lang.Result;
import org.example.school.domain.entity.Class;
import org.example.school.domain.entity.User;
import org.example.school.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 班级信息表 前端控制器
 * </p>
 *
 * @author lmw
 * @since 2024-04-05
 */
@RestController
@RequestMapping("/class")
public class ClassController {


    @Autowired
    ClassService classService;

    @RequestMapping("/classlist")
    public Result Listclass(){
        List<Class>Listclass = classService.Listclass();
        if (Listclass.size()<=0){
            throw new MyBlogException("没有班级信息");
        }
        return Result.success(Listclass);
    }


//    @RequestMapping("/classlist")
//    public  List<Class>Listclass(){
//        return classService.Listclass();
//    }

}
