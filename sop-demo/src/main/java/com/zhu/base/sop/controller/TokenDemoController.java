package com.zhu.base.sop.controller;


import cn.hutool.core.date.DateUtil;
import com.zhu.base.entity.BaseEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/26  11:28
 */
@Slf4j
@RestController
public class TokenDemoController {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 验证SOP平台，ACCESS_TOKEN
     *
     * @return
     */
    //@Open(value = "checkToken", version = "1.0", needToken = true)
    @PostMapping("/checkToken")
    public BaseEntity checkToken() {
        //OpenContext openContext = ServiceContext.getCurrentContext().getOpenContext();
        //
        //String cacheKey = getCacheKey(openContext.getMethod(), openContext.getVersion());
        //Object token = redisTemplate.opsForValue().get(cacheKey);
        //if (ObjectUtil.isNull(token) || ObjectUtil.notEqual(String.valueOf(token), openContext.getAppAuthToken())) {
        //    return BaseEntity.builder().id(-1).username("error").build();
        //}
        return BaseEntity.builder().id(1).username("admin").build();
    }

    /**
     * 获取刷新 ACCESS_TOKEN
     *
     * @param routeName 路由名称
     * @param version   理由版本
     * @return
     */
    @GetMapping("/reflashToken")
    public String reflashToken(@RequestParam String routeName, @RequestParam String version) {
        String token = StringUtils.replace(
                routeName + "_" + UUID.randomUUID(), "-", "") + "_" + DateUtil.current();
        String cacheKey = getCacheKey(routeName, version);
        redisTemplate.opsForValue().set(cacheKey, token, 20, TimeUnit.MINUTES);
        return token;
    }

    public static String getCacheKey(String routeName, String version) {
        return routeName + version + ":Token";
    }

}
