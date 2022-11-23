package com.atguigu.pojoTest;

public class B {

    private  Integer bId;

    private String  bName;

    private C c;

    public B() {
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "B{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", c=" + c +
                '}';
    }
}
