package com.yimo.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
    private String name;
    private String age;
    private String[] friends;
    private List<Integer> nums;
    private List<Cat> cats;
    private Set<Flower> Flowers;
    private Map<String,User> users;

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public Set<Flower> getFlowers() {
        return Flowers;
    }

    public void setFlowers(Set<Flower> flowers) {
        Flowers = flowers;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public List<Integer> getNums() {
        return nums;
    }

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }


}
