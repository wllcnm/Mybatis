package com.atguigu.mybatis.test;

import com.atguigu.mapper.SpecialSqlMapper;
import com.atguigu.pojo.User;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpecialSqlTest {

    @Test
    public void FuzzyQuery(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        Map<String, Object> map = mapper.getUserByFuzzy("a");
        System.out.println(map);
    }

    @Test
    public void DeleteMore(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        String s = list.toString();
        System.out.println(s);
        System.out.println(s.length());
        s=s.substring(1,s.length()-1);
        System.out.println(s);
        mapper.DelMore(s);


    }


    @Test
    public void testGetUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        //动态设置表名,表名不能使用单引号,所以只能使用${}的方法赋值
        List<User> user = mapper.getUserList("user");
        user.forEach(System.out::println);


    }

    @Test
    public void testAddUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        User user=new User("123456","123455");
        mapper.addUser(user);
        System.out.println(user);



    }



}
