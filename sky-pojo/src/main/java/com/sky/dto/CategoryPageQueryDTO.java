package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
//标记实现了该接口的类的对象可以被序列化和反序列化
//持久化支持：允许对象转换为字节流进行存储或网络传输
public class CategoryPageQueryDTO implements Serializable {

    //页码
    private int page;

    //每页记录数
    private int pageSize;

    //分类名称
    private String name;

    //分类类型 1菜品分类  2套餐分类
    private Integer type;

}
