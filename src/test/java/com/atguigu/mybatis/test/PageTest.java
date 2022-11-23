package com.atguigu.mybatis.test;

import com.TestEasyCode.dao.TDepDao;
import com.atguigu.mapper.EmpMapper;
import com.atguigu.pojo.Emp;
import com.atguigu.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageTest {



    /*
    *
    * mybatis分页查询
    * 核心api:PageHelper.startPage(pageNum,pageSize)
    * pageNum为定位到哪一页
    * pageSize为一页由多少条数据
    * */
    @Test
    public void testPageQuery(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        //查询之前开启分页查询
        Page<Object> objectPage = PageHelper.startPage(1, 2);
        List<Emp> allEmpList = mapper.getAllEmpList();
        allEmpList.forEach(System.out::println);
        PageInfo<Emp> pageInfo=new PageInfo<>(allEmpList);
        System.out.println(objectPage);
        System.out.println(pageInfo);
        System.out.println("最后一页的页码为"+pageInfo.getNavigateLastPage());
        System.out.println("第一页的页码"+pageInfo.getNavigateFirstPage());
        System.out.println("是否是第一页"+pageInfo.isIsFirstPage());
        System.out.println("是否是最后一页"+pageInfo.isIsLastPage());


    }




}
