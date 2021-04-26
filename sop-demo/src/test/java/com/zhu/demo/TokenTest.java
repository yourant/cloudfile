package com.zhu.demo;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.UUID;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/26  14:53
 */
public class TokenTest {

    @Test
    public void testToken() {
        String s = StringUtils.replace(String.valueOf(UUID.randomUUID()), "-", "") + "_"
                + RandomUtil.randomInt(1, 1000) + "_" + DateUtil.current();
        System.out.println(s);
    }

}
