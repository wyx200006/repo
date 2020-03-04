package com.bw.service;

import com.bw.dto.in.OrderCheckoutInDTO;
import com.bw.dto.out.OrderShowOutDTO;
import com.bw.pojo.Order;
import com.github.pagehelper.Page;

public interface orderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
