package com.atguigu.mybatis.test;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ParameterTest {

    @Test
    public void testQuery(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.checkLogin("awei", 123);
        System.out.println(user);
    }


    @Test
    public void testQueryByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("awei", 123);
        System.out.println(user);
    }


}
