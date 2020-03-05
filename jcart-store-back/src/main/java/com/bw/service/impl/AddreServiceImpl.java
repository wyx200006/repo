package com.bw.service.impl;

import com.bw.dao.AddressMapper;
import com.bw.pojo.Address;
import com.bw.service.AddresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddreServiceImpl implements AddresService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public Address getById(int shipAddressId) {
        Address address = addressMapper.selectByPrimaryKey(shipAddressId);
        return address;
    }
}
