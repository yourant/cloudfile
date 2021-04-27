package com.zhu.base.util;


import com.zhu.base.constant.ResultCodeConstant;
import com.zhu.base.constant.ResultMessageConstant;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/26  11:16
 */
@Data
public class ResultUtil<T> implements Serializable {

    /**
     * 状态码
     * {@link com.zhu.base.constant.ResultCodeConstant}
     */
    private Integer code;

    /**
     * 状态信息
     * {@link com.zhu.base.constant.ResultMessageConstant}
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;


    public static <T> ResultUtil<T> success(T data) {
        return new ResultUtil<>(ResultCodeConstant.SUCCESS, ResultMessageConstant.SUCCESS_MESSAGE, data);
    }

    public static ResultUtil<Void> success() {
        return new ResultUtil<>(ResultCodeConstant.SUCCESS, ResultMessageConstant.SUCCESS_MESSAGE);
    }

    public static <T> ResultUtil<T> error(T data) {
        return new ResultUtil<>(ResultCodeConstant.ERROR, ResultMessageConstant.ERROR_MESSAGE, data);
    }

    public static ResultUtil<Void> error() {
        return new ResultUtil<>(ResultCodeConstant.ERROR,ResultMessageConstant.ERROR_MESSAGE);
    }

    public ResultUtil(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultUtil(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultUtil() {
    }

}
