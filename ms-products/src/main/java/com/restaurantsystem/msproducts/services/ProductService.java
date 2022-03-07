package com.restaurantsystem.msproducts.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.restaurantsystem.msproducts.entities.Category;
import com.restaurantsystem.msproducts.entities.Product;
import com.restaurantsystem.msproducts.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> products = productRepository.findAll();
        return products;
    }

    public Product findById(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

    public Product saveProduct(Product product){
        Product productToSave = productRepository.save(product);
        return productToSave;
    }

    public void deleteProduct(Long id){
        Optional<Product> productToDelete = productRepository.findById(id);
        productRepository.delete(productToDelete.get());
    }

    public BigDecimal findPrice(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.get().getPrice();
    }

    public List<Product> findByCategory(Category category){
        List<Product> products = productRepository.findByCategory(category);
        return products;
    }

    public Product changeName(Long id, String name) {
        Optional<Product> product = productRepository.findById(id);
        product.get().setName(name);
        Product finalProduct = saveProduct(product.get());
        return finalProduct;
    }

    public Product changeCategory(Long id, Product rewriteProduct) {
        Optional<Product> product = productRepository.findById(id);
        product.get().setCategory(rewriteProduct.getCategory());
        Product finalProduct = saveProduct(product.get());
        return finalProduct;
    }

    public Product changeImageUrl(Long id, Product rewriteProduct) {
        Optional<Product> product = productRepository.findById(id);
        product.get().setImageUrl(rewriteProduct.getImageUrl());
        Product finalProduct = saveProduct(product.get());
        return finalProduct;
    }

    public Product changePrice(Long id, Product rewriteProduct) {
        Optional<Product> product = productRepository.findById(id);
        product.get().setPrice(rewriteProduct.getPrice());
        Product finalProduct = saveProduct(product.get());
        return finalProduct;
    }

    public Product changeDescription(Long id, Product rewriteProduct) {
        Optional<Product> product = productRepository.findById(id);
        product.get().setDescription(rewriteProduct.getDescription());
        Product finalProduct = saveProduct(product.get());
        return finalProduct;
    }

    public Product changeProduct (Long id, Product rewriteProduct)  {
        Optional<Product> product = productRepository.findById(id);
        product.get().setName(rewriteProduct.getName());
        product.get().setCategory(rewriteProduct.getCategory());
        product.get().setImageUrl(rewriteProduct.getImageUrl());
        product.get().setPrice(rewriteProduct.getPrice());
        product.get().setDescription(rewriteProduct.getDescription());
        Product finalProduct = saveProduct(product.get());
        return finalProduct;
    }
}
