package com.zhu.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/22  15:38
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity implements Serializable {

    private Integer id;

    private String username;

}
