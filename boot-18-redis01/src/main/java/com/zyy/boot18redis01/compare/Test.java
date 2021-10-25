package com.zyy.boot18redis01.compare;

import java.util.Comparator;

/**
 * 花间影
 * 11:22
 **/
public class Test{

    public static void main(String[] args) {
        A a1 =new A();
        a1.setName("aaa");
        A a2 =new A();
        a2.setName("bbb");
        int i = a1.compareTo(a2);

        System.out.println(i);
    }
}
