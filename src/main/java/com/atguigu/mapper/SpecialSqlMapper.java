package com.atguigu.mapper;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SpecialSqlMapper {

    @MapKey("id")
    Map<String,Object> getUserByFuzzy(@Param("SpecialFiled") String SpecialFiled);

    void DelMore(@Param("list") String list);

    List<User> getUserList(@Param("tableName") String tableName);

//    获取自增主键,并赋值到新建的user中
    void addUser(User user);


}
