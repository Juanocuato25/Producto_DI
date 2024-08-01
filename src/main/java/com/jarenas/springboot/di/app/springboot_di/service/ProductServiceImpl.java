package com.jarenas.springboot.di.app.springboot_di.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jarenas.springboot.di.app.springboot_di.models.Product;
import com.jarenas.springboot.di.app.springboot_di.repositories.ProductRepository;
//import com.jarenas.springboot.di.app.springboot_di.repositories.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

    
    private ProductRepository productRepository;


    public ProductServiceImpl(@Qualifier("productList") ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25;
            //Product newProduct = new Product(p.getId(), p.getName(), priceImp.longValue());
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }


    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}
