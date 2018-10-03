/*
package com.example.demo.controller;
import Product;
import ProductRepository;
import java.util.Collection;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController{
    private ProductRepository repo;

    public ProductController(ProductRepository repo){
        this.repo = repo;
    }

    @GetMapping("/Product")
    public Collection<Product> product(){
        return repo.findAll();
    }
    
    @GetMapping("/Product/{Product_id}")
    public Optional<Product> takeinByid(@PathVariable Long Product_id ){
        return repo.findById(Product_id);
    }
}
*/