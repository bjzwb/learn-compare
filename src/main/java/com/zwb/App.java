package com.zwb;

import cn.hutool.core.collection.CollectionUtil;
import com.zwb.domin.Cat;
import com.zwb.domin.Dog;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class App {


/*
    List<Dog> dog2 = Arrays.asList(
            new Dog(1,1,"A"),
            new Dog(2,20,"B"),
            new Dog(2,20,"B"),
            new Dog(3,30,"C"),
            new Dog(4,40,"D"),
            new Dog(5,50,"E")
    );
    List<Cat> cat1 = Arrays.asList(
            new Cat(1,1,"A"),
            new Cat(2,2,"B"),
            new Cat(2,2,"B"),
            new Cat(3,3,"C"),
            new Cat(4,4,"D"),
            new Cat(5,5,"E")
    );
    List<Cat> cat2 = Arrays.asList(
            new Cat(1,1,"A"),
            new Cat(2,20,"B"),
            new Cat(2,20,"B"),
            new Cat(3,30,"C"),
            new Cat(4,40,"D"),
            new Cat(5,50,"E")
    );
*/


    @Test
    public void m1(){

        List<Dog> dog1 = new ArrayList<>();
        dog1.add(new Dog(1,1,"A"));
        dog1.add(new Dog(1,1,"A"));
        dog1.add(new Dog(2,2,"B"));
        dog1.add(new Dog(3,3,"C"));
        dog1.add(new Dog(4,4,"D"));
        dog1.add(new Dog(5,5,"E"));

        List<Dog> dog2 = new ArrayList<>();
        dog2.add(new Dog(3,1,"A"));
        dog2.add(new Dog(2,20,"B"));
        dog2.add(new Dog(3,30,"C"));
        dog2.add(new Dog(4,40,"D"));
        dog2.add(new Dog(5,50,"E"));


//        Collection<Dog> list = CollectionUtil.disjunction(dog1, dog2);
//        list.forEach(System.out::println);

        dog1.removeAll(dog2);
        dog1.forEach(System.out::println);

    }

    @Test
    public void m2(){

        List<Cat> cat1 = new ArrayList<>();
        cat1.add(new Cat(1,1,"A"));
        cat1.add(new Cat(1,1,"A"));
        cat1.add(new Cat(2,2,"B"));
        cat1.add(new Cat(3,3,"C"));
        cat1.add(new Cat(4,4,"D"));
        cat1.add(new Cat(5,5,"E"));

        List<Cat> cat2 = new ArrayList<>();
        cat2.add(new Cat(3,1,"A"));
        cat2.add(new Cat(2,2,"B"));
        cat2.add(new Cat(3,30,"C"));
        cat2.add(new Cat(4,40,"D"));
        cat2.add(new Cat(5,50,"E"));

        cat1.removeAll(cat2);
        cat1.forEach(System.out::println);

    }
}
