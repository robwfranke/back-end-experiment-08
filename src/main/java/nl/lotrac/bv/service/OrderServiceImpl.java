package nl.lotrac.bv.service;


import nl.lotrac.bv.model.Order;
import nl.lotrac.bv.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Collection<Order>getOrders(){

        return orderRepository.findAll();
    }



}
