package com.gfilipeprojects.apirest.repositories;

import com.gfilipeprojects.apirest.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
