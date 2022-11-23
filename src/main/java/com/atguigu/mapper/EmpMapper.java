package com.atguigu.mapper;

import com.atguigu.pojo.Emp;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmpMapper {

    @MapKey("emp_id")
    Map<String, Object> getAllEmpMap();

    List<Emp> getAllEmpList();

    List<Emp> getEmpByEmpId(@Param("id") Integer id);

    List<Emp> getEmpAndDept(@Param("id") Integer id);

    List<Emp> getEmpAndDeptByStep(@Param("id") Integer id);


    /*
     * 分布查询的第二步
     * 通过部门id查询该部门下属的员工
     * */
    List<Emp> getDeptAndEmpByStep2(@Param("DeptId") Integer DeptId);


}
