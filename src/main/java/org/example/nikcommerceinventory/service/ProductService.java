package org.example.nikcommerceinventory.service;

import org.example.nikcommerceinventory.entity.Product;
import org.example.nikcommerceinventory.repo.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    Logger logger = LoggerFactory.getLogger(ProductService.class);


    public Product addProduct(Product product) {

        logger.info(Instant.now()+ " Class: productService Method: addProduct started executing with Parameters " + product);

        Product saveProduct = productRepo.save(product);

        logger.info(Instant.now()+ " Class: productService Method: addProduct finished executing with Parameters " + saveProduct);


        return saveProduct;
    }

    public Product getProductById(Integer id) {


        return productRepo.findById(id).orElseGet(() -> new Product() );
    }
}
