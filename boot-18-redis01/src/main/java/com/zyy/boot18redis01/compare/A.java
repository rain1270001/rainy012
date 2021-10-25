package com.zyy.boot18redis01.compare;

/**
 * 花间影
 * 11:13
 **/
public class A implements Comparable<A> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(A o) {
        int i = name.compareTo(o.name);
        return i;
    }
}
