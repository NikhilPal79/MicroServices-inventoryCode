package org.example.nikcommerceinventory.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.nikcommerceinventory.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.nikcommerceinventory.service.ProductService;

import java.time.Instant;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    Logger logger = LoggerFactory.getLogger(ProductController.class);
    /// this loggerFactory is examples of signleton design pattern bcz of single bean for whole code


    @PostMapping()
    public Product addProduct(@RequestBody Product product) {
        logger.info(Instant.now()+ " Class: productController Method: addProduct started executing with Parameters " + product);

        Product addedProduct = productService.addProduct(product);

        logger.info(Instant.now()+ " Class: productController Method: addProduct finished executing with return data " + addedProduct);

        return addedProduct;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer productId) {
        logger.info(Instant.now()+ " Class: productController Method: getProductById started executing with Parameters " + productId);

        Product productById = productService.getProductById(productId);

        logger.info(Instant.now()+ " Class: productController Method: getProductById finished executing with Parameters " + productById);

        return productById;
    }




}
