package com.restaurantsystem.msproducts.controllers;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;

import com.restaurantsystem.msproducts.services.ProductService;
import com.restaurantsystem.msproducts.entities.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> productList = productService.findAll();
        return ResponseEntity.ok(productList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product product = productService.findById(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/{id}/price")
    public ResponseEntity<BigDecimal> findPrice(@PathVariable Long id){
        BigDecimal price = productService.findPrice(id);
        return ResponseEntity.ok(price);
    }

    @PostMapping
    public ResponseEntity<Product> newProduct(@RequestBody Product newProduct){
        productService.saveProduct(newProduct);
        URI location = URI.create(String.format("/products/%s", newProduct.getId()));
        return ResponseEntity.created(location).body(newProduct);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Product> rewriteProduct(@PathVariable Long id, @RequestBody Product rewriteProduct) {
        Product finalProduct = productService.changeProduct(id, rewriteProduct);
        //TODO: process PUT request
        /*  Product product = productService.findById(id);
        product.setName(rewritedProduct.getName());
        product.setDescription(rewritedProduct.getDescription());
        product.setImageUrl(rewritedProduct.getImageUrl());
        product.setPrice(rewritedProduct.getPrice());
        product.setCategory(rewritedProduct.getCategory());*/
        return ResponseEntity.ok(finalProduct);
    }

    @PatchMapping(value="/{id}/name")
    public ResponseEntity<Product> rewriteName(@PathVariable Long id, @RequestBody String rewritedName) { 
        Product patchedProduct = productService.changeName(id, rewritedName);
        return ResponseEntity.ok(patchedProduct);
    }

    @PatchMapping(value="/{id}/description")
    public ResponseEntity<Product> rewriteDescription(@PathVariable Long id, @RequestBody Product rewritedProduct) { 
        Product patchedProduct = productService.changeDescription(id, rewritedProduct);
        return ResponseEntity.ok(patchedProduct);
    }

    @PatchMapping(value="/{id}/imageurl")
    public ResponseEntity<Product> rewriteImageUrl(@PathVariable Long id, @RequestBody Product rewritedProduct) { 
        Product patchedProduct = productService.changeImageUrl(id, rewritedProduct);
        return ResponseEntity.ok(patchedProduct);
    }

    @PatchMapping(value="/{id}/price")
    public ResponseEntity<Product> rewritePrice(@PathVariable Long id, @RequestBody Product rewritedProduct) { 
        Product patchedProduct = productService.changePrice(id, rewritedProduct);
        return ResponseEntity.ok(patchedProduct);
    }

    @PatchMapping(value="/{id}/category")
    public ResponseEntity<Product> rewriteCategory(@PathVariable Long id, @RequestBody Product rewritedProduct) { 
        Product patchedProduct = productService.changeCategory(id, rewritedProduct);
        return ResponseEntity.ok(patchedProduct);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

}
