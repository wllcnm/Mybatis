package com.atguigu.pojoTest;


import lombok.Data;

@Data
public class C {
    private Integer cId;

    private String cName;

    public C() {
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "C{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                '}';
    }
}
