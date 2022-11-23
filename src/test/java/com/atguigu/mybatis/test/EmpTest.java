package com.atguigu.mybatis.test;

import com.atguigu.mapper.EmpMapper;
import com.atguigu.pojo.Emp;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class EmpTest {


    @Test
    public  void testGetEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empAndDept = mapper.getEmpAndDeptByStep(1);
        System.out.println(empAndDept.get(0).getEmpId());
    }


}
