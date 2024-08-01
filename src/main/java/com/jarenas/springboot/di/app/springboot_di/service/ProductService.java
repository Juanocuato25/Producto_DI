package com.jarenas.springboot.di.app.springboot_di.service;

import java.util.List;

import com.jarenas.springboot.di.app.springboot_di.models.Product;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

}
