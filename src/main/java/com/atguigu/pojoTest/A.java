package com.atguigu.pojoTest;

public class A {
    private Integer aId;

    private String aName;

    private B b;

    public A() {
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", b=" + b +
                '}';
    }
}
