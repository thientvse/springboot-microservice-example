package com.thientvse.orderservice.service;

import com.thientvse.orderservice.dto.OrderRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface OrderService {

    void placeOrder(OrderRequest orderRequest);
}
