package com.atguigu.mapper;

import com.atguigu.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /*
     * 通过分布查询的第二步
     * */
    Dept getDeptByStep(@Param("depId") Integer depId);

    Dept getDeptAndEmpByDeptId(@Param("DeptId") Integer DeptId);

    /*
     * 分布查询的第一步
     * 通过部门id查询该部门下属的员工
     * */
    Dept getDeptAndEmpByStep1(@Param("DeptId") Integer DeptId);


}
