package com.atguigu.mapperTest;

import com.atguigu.pojo.User;
import com.atguigu.pojoTest.BookUser;
import com.atguigu.pojoTest.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {


    List<Cart> getAllCart(BookUser user);

    List<Cart> getAllCart2(@Param("userBean") Integer userBean);

}
