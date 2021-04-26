package com.zhu.base.util;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/26  11:16
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultUtil<T> {

    private Integer code;

    private String message;

    private T info;

    public ResultUtil<T> success() {



        return null;
    }

}
