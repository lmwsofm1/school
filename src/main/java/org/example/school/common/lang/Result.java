package org.example.school.common.lang;

import jdk.dynalink.beans.StaticClass;
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

    public static Result common(Integer code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}

