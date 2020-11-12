package com.projetobackend.services;

import com.projetobackend.entities.Category;
import com.projetobackend.entities.Order;
import com.projetobackend.repositories.CategoryRepository;
import com.projetobackend.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
