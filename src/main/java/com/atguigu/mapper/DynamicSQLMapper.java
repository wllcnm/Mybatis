package com.atguigu.mapper;

import com.atguigu.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {


    List<Emp> getEmpByCondition(Emp emp);

    void insertEmpByForeach(@Param("emps") List<Emp> emps);

    void deleteEmpByForeach1(@Param("empIds") Integer[] empIds);

    void deleteEmpByForeach2(@Param("emps") List<Emp> emps);

}
