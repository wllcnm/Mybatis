package com.atguigu.mapper;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int insertUser();

    void updateUser();

    void delUser();

    User getUser();

    List<User> getAllUser();

    User checkLogin(String username,Integer password);

    //使用Param注解可以配置参数的别名
    //Param:命名参数
    User checkLoginByParam(@Param("username") String username,@Param("password") Integer password);


}
