package com.atguigu.mapperTest;

import com.atguigu.pojoTest.B;
import org.apache.ibatis.annotations.Param;

public interface BMapper {

    B getAllB(@Param("id") Integer id);


}
