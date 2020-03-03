package com.bw.service;


import com.bw.pojo.Administrator;

public interface AdministratorService {
    Administrator getByUsername(String username);

    Integer create(Administrator administrator);

    Administrator getById(Integer administratorId);
}
