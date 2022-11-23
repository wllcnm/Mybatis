package com.atguigu.mapperTest;

import com.atguigu.pojoTest.C;
import org.apache.ibatis.annotations.Param;

public interface CMapper {

    C getAllC(@Param("id") Integer id);


}
