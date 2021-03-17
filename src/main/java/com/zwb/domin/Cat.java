package com.zwb.domin;

import java.util.Objects;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(long tid, int age, String name) {
        super(tid, age, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!=o.getClass()) return false;
        Cat that = (Cat) o;
        return Objects.equals(getTid(),that.getTid()) && Objects.equals(getAge(),that.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTid(),getAge());
    }
}


