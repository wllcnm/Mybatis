package com.atguigu.mybatis.test;

import com.atguigu.mapperTest.AMapper;
import com.atguigu.pojoTest.A;
import com.atguigu.pojoTest.C;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ABCTest {


    @Test
    public void testSTEP(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        AMapper mapper = sqlSession.getMapper(AMapper.class);
        A allA = mapper.getAllA(1);
        System.out.println(allA);
    }

}
