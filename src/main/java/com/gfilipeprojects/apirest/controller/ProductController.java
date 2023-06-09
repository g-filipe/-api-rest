package com.gfilipeprojects.apirest.controller;

import com.gfilipeprojects.apirest.entities.Department;
import com.gfilipeprojects.apirest.entities.Product;
import com.gfilipeprojects.apirest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getObjects() {

        List<Product> list = productRepository.findAll();

        return list;
    }
}
