package com.yimo.pojo;

import java.util.Date;
import java.util.List;

public class Girl {
    private String name;
    private String flowerLike;
    private Date birthday;
    private Integer age;

    public Girl(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public Girl() {

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerLike() {
        return flowerLike;
    }

    public void setFlowerLike(String flowerLike) {
        this.flowerLike = flowerLike;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", flowerLike='" + flowerLike + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }

    private void clearDress() {
        System.out.println("destroyed method:我要卸妆了");
    }

    private void dress() {
        System.out.println("init-method:开始化妆");
    }
}
