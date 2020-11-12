package com.projetobackend.services;

import com.projetobackend.entities.Category;
import com.projetobackend.entities.Product;
import com.projetobackend.repositories.CategoryRepository;
import com.projetobackend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
