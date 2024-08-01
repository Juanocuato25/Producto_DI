package com.jarenas.springboot.di.app.springboot_di.repositories;

import java.util.Collections;
import java.util.List;

//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.jarenas.springboot.di.app.springboot_di.models.Product;


@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L,"NVME 500gb", 100L));
        }

    @Override
    public Product findById(Long id) {
       return new Product(id, "monitor asus 27", 600L);
    }

}
