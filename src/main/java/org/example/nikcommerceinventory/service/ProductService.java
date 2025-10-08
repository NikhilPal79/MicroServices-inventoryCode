package org.example.nikcommerceinventory.service;

import org.example.nikcommerceinventory.entity.Product;
import org.example.nikcommerceinventory.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public Product getProductById(Integer id) {
        return productRepo.findById(id).orElseGet(() -> new Product() );
    }
}
