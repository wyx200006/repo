package com.bw.jcartadministartionback.service.impl;

import com.bw.dao.AdministratorMapper;
import com.bw.jcartadministartionback.po.Administrator;
import com.bw.jcartadministartionback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    AdministratorMapper administratorMapper;

    @Override
    public Administrator getByUsername(String username) {
        Administrator administrator = administratorMapper.selectByUsername(username);
        return administrator;
    }
}
