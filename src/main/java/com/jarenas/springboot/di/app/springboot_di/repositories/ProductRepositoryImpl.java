package com.jarenas.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jarenas.springboot.di.app.springboot_di.models.Product;

@Primary
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository{

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
            new Product(1L, "Memoria corsair", 300L),
            new Product(2L, "Mouse Logitech", 200L),
            new Product(3L, "Monitor HP 27inch", 900L),
            new Product(4L, "GPU 7600xt", 1500L)
        );
    }

    @Override
    public List<Product> findAll(){
        return data;
    }

    @Override
    public Product findById(Long id){
       return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }




}
