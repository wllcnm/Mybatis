package com.atguigu.mybatis.test;

import com.atguigu.mapper.DeptMapper;
import com.atguigu.pojo.Dept;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class DeptTest {


    @Test
    public void testGetDeptAndEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(deptAndEmpByDeptId);


    }

    @Test
    public void testGetDeptAndEmpByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByStep1 = mapper.getDeptAndEmpByStep1(1);
        System.out.println(deptAndEmpByStep1);


    }
}
