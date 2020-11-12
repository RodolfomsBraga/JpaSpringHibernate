package com.projetobackend.services;

import com.projetobackend.entities.Order;
import com.projetobackend.entities.User;
import com.projetobackend.repositories.OrderRepository;
import com.projetobackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
