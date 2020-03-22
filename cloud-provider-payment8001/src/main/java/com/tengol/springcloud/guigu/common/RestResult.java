package com.tengol.springcloud.guigu.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用返回结果
 *
 * @author dongrui
 * @date 2020/3/20 22:48
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestResult<T> {
    public static final Integer CODE_SUCCESS = 0;
    public static final Integer CODE_FAIL = -1;
    public static final String MSG_SUCCESS = "success";
    public static final String MSG_FAIL = "fail";

    @Builder.Default
    private int code = CODE_SUCCESS;

    @Builder.Default
    private String msg = MSG_SUCCESS;

    private T data;

    public static RestResult fail() {
        return RestResult.builder().code(CODE_FAIL).msg(MSG_FAIL).build();
    }

    public static RestResult fail(String msg) {
        return RestResult.builder().code(CODE_FAIL).msg(msg).build();
    }

    public static RestResult fail(int code, String msg) {
        return RestResult.builder().code(code).msg(msg).build();
    }

    public static RestResult success() {
        return RestResult.builder().code(CODE_SUCCESS).msg(MSG_SUCCESS).build();
    }

    public static RestResult success(Object data) {
        return RestResult.builder().code(CODE_SUCCESS).msg(MSG_SUCCESS).data(data).build();
    }
}
