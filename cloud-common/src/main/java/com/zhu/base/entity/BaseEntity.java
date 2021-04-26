package com.zhu.base.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Map;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/26  11:28
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity implements Serializable {

    private Integer id;

    private String username;

    private Map<String, String> info;

    private String name;

    public BaseEntity(Integer id, String username) {
        this.id = id;
        this.username = username;
    }
}
