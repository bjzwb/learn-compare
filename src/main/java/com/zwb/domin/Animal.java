package com.zwb.domin;


public class Animal {

    public Animal() {
    }

    public Animal(long tid, int age, String name) {
        this.tid = tid;
        this.age = age;
        this.name = name;
    }

    private long tid;
    private int age;
    private String name;

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tid=" + tid +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
