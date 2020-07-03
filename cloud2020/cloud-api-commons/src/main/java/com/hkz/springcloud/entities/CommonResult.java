package com.hkz.springcloud.entities;


/**
 * @auther zzyy
 * @create 2020-02-18 17:23
 */
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message, T o) {

        this.code = code;
        this.message = message;
        this.data = o;

    }
}
