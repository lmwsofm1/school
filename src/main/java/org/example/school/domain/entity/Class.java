package org.example.school.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 班级信息表
 * </p>
 *
 * @author lmw
 * @since 2024-04-05
 */
@Getter
@Setter
public class Class {

    @TableId(value = "classId", type = IdType.AUTO)
    private Integer classId;

    /**
     * 班级名称
     */
    private String className;
}
