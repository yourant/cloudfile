package com.zhu.demo;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import org.junit.Test;

import java.util.Date;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/28  11:52
 */
public class TimeTest {

    @Test
    public void timeTest1() {
        Date date = new Date();
        String now = DateUtil.now();

        long time = date.getTime();
        DateTime dateTime = new DateTime(date);
        long time1 = dateTime.getTime();
        System.out.println(time);
        System.out.println(time1);

    }
}
