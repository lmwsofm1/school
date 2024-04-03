package org.example.school.handler;

import lombok.extern.slf4j.Slf4j;
import org.example.school.common.exception.MyBlogException;
import org.example.school.common.lang.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    // 修改异常处理类返回值
    @ExceptionHandler(MyBlogException.class)
    public Result handleException(MyBlogException e) {
        log.error("报错信息：{}", e.getMessage());
        return Result.fail(e.getCode(), e.getMsg());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        log.error("报错信息：{}", e.getMessage());
        return Result.fail(e.getMessage());
    }

}
