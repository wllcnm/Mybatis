package com.TestEasyCode.dao;

import com.TestEasyCode.entity.TDep;
import org.apache.ibatis.annotations.Param;


import java.awt.print.Pageable;
import java.util.List;

/**
 * (TDep)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-23 17:15:35
 */
public interface TDepDao {

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    TDep queryById(@Param("depId") Integer deptId);

    /**
     * 查询指定行数据
     *
     * @param tDep 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TDep> queryAllByLimit(TDep tDep, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tDep 查询条件
     * @return 总行数
     */
    long count(TDep tDep);

    /**
     * 新增数据
     *
     * @param tDep 实例对象
     * @return 影响行数
     */
    int insert(TDep tDep);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TDep> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TDep> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TDep> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TDep> entities);

    /**
     * 修改数据
     *
     * @param tDep 实例对象
     * @return 影响行数
     */
    int update(TDep tDep);

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 影响行数
     */
    int deleteById(Integer deptId);

}

