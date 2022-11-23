package com.atguigu.pojoTest;

public class Cart {
    private Integer id;

    private Book book;

    private Integer buyCount;

    private BookUser userBean;

    public Cart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public BookUser getUserBean() {
        return userBean;
    }

    public void setUserBean(BookUser userBean) {
        this.userBean = userBean;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", book=" + book +
                ", buyCount=" + buyCount +
                ", userBean=" + userBean +
                '}';
    }
}
