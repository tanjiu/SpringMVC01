package com.tanjiu.pojo;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/19 20:42
 */
//需要导入lombok才可以使用以下三个注解，相当于直接为属性设置了set get 无参有参构造函数
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String  name;
    private int age;
    private String sex;
}
