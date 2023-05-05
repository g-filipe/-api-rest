package com.gfilipeprojects.apirest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private Long id;
    private String name;
    private Double price;

    private Department department;
}
