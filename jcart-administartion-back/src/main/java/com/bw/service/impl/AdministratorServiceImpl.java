package com.bw.service.impl;

import com.bw.dao.AdministratorMapper;
import com.bw.pojo.Administrator;
import com.bw.service.AdministratorService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    AdministratorMapper administratorMapper;

    @Override
    public Administrator getByUsername(String username) {
        Administrator administrator = administratorMapper.selectByUsername(username);
        return administrator;
    }

    @Override
    public Integer create(Administrator administrator) {
        administratorMapper.insertSelective(administrator);
        Integer administratorId = administrator.getAdministratorId();
        return administratorId;
    }

    @Override
    public Administrator getById(Integer administratorId) {
        return administratorMapper.selectByPrimaryKey(administratorId);
    }

    @Override
    public void update(Administrator administrator) {
        administratorMapper.updateByPrimaryKeySelective(administrator);
    }

    @Override
    public Page<Administrator> getList(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<Administrator> page = administratorMapper.selectList();
        return page;
    }

    @Override
    public void delete(Integer adminstratorId) {
        administratorMapper.deleteByPrimaryKey(adminstratorId);
    }

    @Override
    public void batchDelete(List<Integer> administratorIds) {
        administratorMapper.batchDelete(administratorIds);
    }
}
