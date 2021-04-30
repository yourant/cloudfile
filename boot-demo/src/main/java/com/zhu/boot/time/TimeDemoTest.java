package com.zhu.boot.time;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/29  21:44
 */
@Slf4j
public class TimeDemoTest {

    @Test
    public void test1() {
        Date date = new Date(1618577642000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String format = simpleDateFormat.format(date);
        log.info("result:{}", format);
    }

    @Test
    public void test2() {
        JSONObject jsonObject = JSONUtil.parseObj(new Object());
        //System.out.println(jsonObject);
        //System.out.println(jsonObject.toString());
        //System.out.println();
    }

}
