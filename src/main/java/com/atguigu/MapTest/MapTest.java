package com.atguigu.MapTest;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MapTest {

    @Test
    public  void mapTest(){
        Map<String,Object>  UserMap=new HashMap<>();

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser();
        UserMap.put("user",user);
        UserMap.put("list",new ArrayList<>(Arrays.asList("11231","123","123")));
        List list = (List) UserMap.get("list");

        list.add("123");
        list.forEach(System.out::println);

        System.out.println(UserMap);


    }


}
