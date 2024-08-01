package com.jarenas.springboot.di.app.springboot_di.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarenas.springboot.di.app.springboot_di.models.Product;
import com.jarenas.springboot.di.app.springboot_di.service.ProductService;
//import com.jarenas.springboot.di.app.springboot_di.service.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("api/products")
public class SomeController {

 
    @Autowired
    private ProductService productService;


    /**
     * @apiNote EndPoint 
     * @return Devuelve la lista completa de los productos registrados
     */
    @GetMapping
    public List<Product> list(){
        return productService.findAll(); 
    }


    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return productService.findById(id);
    }
    
}
