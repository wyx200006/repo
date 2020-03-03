package com.bw.dao;

import com.bw.pojo.Administrator;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);

    Administrator selectByUsername(String username);

    Page<Administrator> selectList();

    void batchDelete(List<Integer> administratorIds);
}