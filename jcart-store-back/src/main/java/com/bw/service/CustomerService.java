package com.bw.service;

import com.bw.dto.in.CustomerRegisterInDTO;
import com.bw.pojo.Customer;

public interface CustomerService {
    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

    Customer getByEmail(String email);
}
