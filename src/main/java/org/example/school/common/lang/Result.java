package org.example.school.common.lang;

import lombok.Data;

@Data
public class Result {

    private Integer code;

    private String msg;

    private Object data;

    public static Result success() {
        return success(null);
    }

    public static Result success(Object data) {
        return success(200, data);
    }

    public static Result success(Integer code, Object data) {
        return common(code, "操作成功", data);
    }

    public static Result fail() {
        return fail(null);
    }

    public static Result fail(Integer code, String msg) {
        return common(code, msg, null);
    }

    public static Result fail(String msg) {
        return common(400, msg, null);
    }

    public static Result fail(Integer code, Object data) {
        return common(code, "操作失败", data);
    }


    // 静态方法，返回一个失败的结果对象
    public static Result failure(String message) {
        return common(500, "账号密码错误", null);
    }



    public static Result common(Integer code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    // 静态方法，返回一个失败的结果对象
    public static Result failure(Integer code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return  result;
    }
}

