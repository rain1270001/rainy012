package com.zyy.boot22thymeleaf.model;

/**
 * 花间影
 * 17:40
 **/
public class Book {
    private Integer id;
    private String name;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "书籍信息{" +
                "书籍编号=" + id +
                ", 书籍名称='" + name + '\'' +
                ", 价格=" + price +
                '}';
    }
}
