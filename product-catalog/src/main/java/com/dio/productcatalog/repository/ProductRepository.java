package com.dio.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.dio.productcatalog.model.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
