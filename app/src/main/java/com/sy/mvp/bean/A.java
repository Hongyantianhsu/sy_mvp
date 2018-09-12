package com.sy.mvp.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by huolala-sunyan on 2018/8/6.
 */

public class A implements Serializable{
    @SerializedName("name")
    public String name;
    @SerializedName("age")
    public int age;

    public A(String name,int age){
        this.name = name;
        this.age = age;
    }
}
