package com.bw.service;


import com.bw.pojo.Administrator;
import com.github.pagehelper.Page;

import java.util.List;

public interface AdministratorService {
    Administrator getByUsername(String username);

    Integer create(Administrator administrator);

    Administrator getById(Integer administratorId);

    void update(Administrator administrator);

    Page<Administrator> getList(Integer pageNum);

    void delete(Integer adminstratorId);

    void batchDelete(List<Integer> administratorIds);

    Administrator getByEmail(String email);
}
