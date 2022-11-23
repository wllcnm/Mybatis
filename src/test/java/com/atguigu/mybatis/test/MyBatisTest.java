package com.atguigu.mybatis.test;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testInsert() throws IOException {
        //获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sql
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取UserMapper的代理实现类对象
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);

        //执行插入操作
        //int result=usermapper.insertUser();

        //执行更新操作
        //usermapper.updateUser();

        //执行删除操作
        //usermapper.delUser();

        //执行查询操作,返回单条记录
        //BookUser user = usermapper.getUser();
        //System.out.println(user);

        //查询所有记录
        List<User> allUser = usermapper.getAllUser();
        allUser.forEach(System.out::println);

        //关闭事务
        //qlSession.commit();

        sqlSession.close();


    }


}
