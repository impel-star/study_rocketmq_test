package com.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author Administrator
 * @Date 2021/5/10 0010 14:23
 * @Description:
 * @Version 1.0
 */
@Data
public class User {
    private int id;
    private String userName;
    private String loginName;
    private String password;
    private int age;
    private byte sex;

}
