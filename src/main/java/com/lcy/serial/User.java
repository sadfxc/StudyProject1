package com.lcy.serial;

import java.io.Serializable;

public class User implements Serializable {

    public static int num = 5;

    private static final long serialVersionUID = -5905630540815581734L;
    private String name;
    private Integer age;
    private String sex;
    private transient String notSerializeble;

    public User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNotSerializeble() {
        return notSerializeble;
    }

    public void setNotSerializeble(String notSerializeble) {
        this.notSerializeble = notSerializeble;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", notSerializeble='" + notSerializeble + '\'' +
                '}' + "num-->" +num ;
    }
}
