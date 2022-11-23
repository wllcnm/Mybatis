package com.atguigu.pojoTest;

import java.util.List;

public class BookUser {
    private Integer id;

    private String uname;

    private List<Cart> carts;

    public BookUser() {
    }

    public BookUser(Integer id, String uname) {
        this.id = id;
        this.uname = uname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    @Override
    public String toString() {
        return "BookUser{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", carts=" + carts +
                '}';
    }
}
