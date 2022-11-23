package com.TestEasyCode.entity;

import java.io.Serializable;

/**
 * (TDep)实体类
 *
 * @author makejava
 * @since 2022-11-23 17:15:36
 * EasyCode生成的entity类
 */
public class TDep implements Serializable {
    private static final long serialVersionUID = 865347515085136016L;
    
    private Integer deptId;
    
    private String deptName;


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}

