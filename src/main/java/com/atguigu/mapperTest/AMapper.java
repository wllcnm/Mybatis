package com.atguigu.mapperTest;

import com.atguigu.pojoTest.A;
import org.apache.ibatis.annotations.Param;

public interface AMapper {

    A getAllA(@Param("id") Integer id);



}
