package com.zwb.domin;

import java.util.Objects;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(long tid, int age, String name) {
        super(tid, age, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!=o.getClass()) return false;
        Dog that = (Dog) o;
        return Objects.equals(getTid(),that.getTid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTid());
    }
}
