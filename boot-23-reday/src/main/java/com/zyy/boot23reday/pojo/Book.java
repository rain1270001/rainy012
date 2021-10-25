package com.zyy.boot23reday.pojo;

import java.io.Serializable;

/**
 * 花间影
 * 10:19
 **/
public class Book implements Serializable {
    private String id;
    private String name;
    private String autor;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
                "书籍编号='" + id + '\'' +
                ", 书籍名称='" + name + '\'' +
                ", 作者='" + autor + '\'' +
                ", 售价=" + price +
                '}';
    }
}
