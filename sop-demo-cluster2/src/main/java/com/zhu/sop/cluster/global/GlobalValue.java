package com.zhu.sop.cluster.global;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ZhuHaiBo
 * @date: 2021/5/6  17:21
 */
@Component
public class GlobalValue {

    public static Map<String, Map<String, Object>> map = new HashMap<>();

    public GlobalValue() {
        for (int i = 0; i < 10; i++) {
            HashMap<String, Object> tempMap = new HashMap<>();
            tempMap.put(String.valueOf(i), i);
            map.put("A" + i, tempMap);
        }
    }

    public void add(String key, Map<String, Object> inner) {
        map.put(key, inner);
    }

    public Map<String, Object> get(String key) {
        return map.get(key);
    }

    public Map<String, Map<String, Object>> getAll() {
        return map;
    }
}
