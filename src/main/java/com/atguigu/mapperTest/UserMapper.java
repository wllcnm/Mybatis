package com.atguigu.mapperTest;

import com.atguigu.pojoTest.BookUser;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {

    BookUser getAllBookUser(@Param("id") Integer id);


    /*
    分布查询
    * 通过用户名id即可查询到购物车的所有信息
    *
    * */
    BookUser getBookUserAndCart(@Param("id") Integer id);

    @MapKey("id")
    Map<String,Object> getBookUserAndCartByMap(@Param("id") Integer id);


}
