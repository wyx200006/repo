package com.bw.jcartadministartionback.service;

import com.bw.jcartadministartionback.po.Administrator;

public interface AdministratorService {
    Administrator getByUsername(String username);
}
