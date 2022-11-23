package com.atguigu.mybatis.test;

import com.atguigu.mapper.EmpMapper;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ResultMapTest {


    @Test
    public void resultMapTest() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Map<String, Object> allEmp = mapper.getAllEmpMap();
        Set<Map.Entry<String, Object>> entrySet=allEmp.entrySet();
        for (Map.Entry<String, Object> entry:entrySet ){
            Map<String,Object> tempMap=new HashMap<>();
            tempMap= (Map<String, Object>) entry.getValue();
            if (Integer.parseInt(String.valueOf(tempMap.get("emp_id")))<3){
                System.out.println(tempMap);
            }


        }
        System.out.println(allEmp);


    }


}
