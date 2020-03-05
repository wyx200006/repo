package com.bw.service.impl;

import com.bw.dto.in.CustomerRegisterInDTO;
import com.bw.pojo.Customer;
import com.bw.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Integer register(CustomerRegisterInDTO customerRegisterInDTO) {
        return null;
    }

    @Override
    public Customer getByUsername(String username) {
        return null;
    }

    @Override
    public Customer getById(Integer customerId) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public Customer getByEmail(String email) {
        return null;
    }
}
