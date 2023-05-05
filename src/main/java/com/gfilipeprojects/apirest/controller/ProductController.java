package com.gfilipeprojects.apirest.controller;

import com.gfilipeprojects.apirest.entities.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public Department getObjects() {
        Department d1 = new Department(1L, "Tech");
        return d1;
    }
}
