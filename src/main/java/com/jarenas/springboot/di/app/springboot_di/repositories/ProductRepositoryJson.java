package com.jarenas.springboot.di.app.springboot_di.repositories;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jarenas.springboot.di.app.springboot_di.models.Product;

public class ProductRepositoryJson implements ProductRepository{


    private List<Product> list;

    public ProductRepositoryJson(){
        //Leeremos de los recursos el archivo .json
        Resource resource = new ClassPathResource("json/product.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            list = Arrays.asList(objectMapper.readValue(resource.getFile(), Product[].class));
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

}
