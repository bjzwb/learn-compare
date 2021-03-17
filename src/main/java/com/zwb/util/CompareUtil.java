package com.zwb.util;

import com.zwb.domin.Animal;

import java.util.List;

public class CompareUtil {

    public static List<? extends Animal> compare (List<? extends Animal> listA,List<? extends Animal> listB){

        listA.removeAll(listB);
        return null;

    }
}
