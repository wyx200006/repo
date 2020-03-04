package com.bw.service.impl;

import com.bw.dao.OrderMapper;
import com.bw.dto.in.OrderCheckoutInDTO;
import com.bw.dto.out.OrderShowOutDTO;
import com.bw.pojo.Order;
import com.bw.service.orderService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderServiceImpl implements orderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId) {
        return null;
    }

    @Override
    public Page<Order> getByCustomerId(Integer pageNum, Integer customerId) {
        return null;
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {
        return null;
    }
}
