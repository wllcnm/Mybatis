package com.atguigu.mapperTest;

import com.atguigu.pojoTest.Book;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {

Book getAllBook(@Param("id") Integer id);


}
