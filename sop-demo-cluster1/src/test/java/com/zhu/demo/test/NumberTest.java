package com.zhu.demo.test;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author: ZhuHaiBo
 * @date: 2021/5/14  15:03
 */
public class NumberTest {

    @Test
    public void numberTest1() {
        Long num = 0L;

        System.out.println(ObjectUtil.isNotNull(num));

        System.out.println(NumberUtil.isNumber(StrUtil.toString(null)));
        System.out.println(NumberUtil.isNumber(StrUtil.toString(num)));
        System.out.println(NumberUtil.isGreater(new BigDecimal(0),new BigDecimal(0)));
    }


}
