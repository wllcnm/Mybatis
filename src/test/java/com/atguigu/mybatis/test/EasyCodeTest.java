package com.atguigu.mybatis.test;

import com.TestEasyCode.dao.TDepDao;
import com.TestEasyCode.entity.TDep;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EasyCodeTest {

    @Test
    public void testQuery(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        TDepDao mapper = sqlSession.getMapper(TDepDao.class);
        TDep tDep = mapper.queryById(1);
        System.out.println(tDep.getDeptId());


    }


}
