package com.atguigu.mybatis.test;

import com.atguigu.mapper.DynamicSQLMapper;
import com.atguigu.pojo.Emp;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class DynamicTest {

    /*
     * 测试动态SQL中的where标签
     * */
    @Test
    public void testWhereLabel() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, null, null, '男', null);
        List<Emp> empByCondition = mapper.getEmpByCondition(emp);
        empByCondition.forEach(System.out::println);
    }

    /*
     * 测试动态SQL中的foreach标签
     * */
    @Test
    public void testInsertForeachLabel() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "小明1", 20, '男', null);
        Emp emp2 = new Emp(null, "小明2", 20, '男', null);
        Emp emp3 = new Emp(null, "小明3", 20, '男', null);
        Emp emp4 = new Emp(null, "小明4", 20, '男', null);
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3, emp4);
        mapper.insertEmpByForeach(emps);


    }

    /*
     * 通过数组和foreach实现批量删除
     * */
    @Test
    public void testDeleteForeachLabel1() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        Integer[] integer = new Integer[]{6, 7};
        mapper.deleteEmpByForeach1(integer);

    }

    /*
     * 通过list和foreach实现批量删除
     * */
    @Test
    public void testDeleteForeachLabel2() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        Emp emp1 = new Emp(1, "小明1", 20, '男', null);
        Emp emp2 = new Emp(2, "小明2", 20, '男', null);
        List<Emp> list = Arrays.asList(emp1,emp2);
        mapper.deleteEmpByForeach2(list);

    }

}
