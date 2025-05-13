package com.ujjawal.ecom_proj.service;

import com.ujjawal.ecom_proj.model.Products;
import com.ujjawal.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Products> getAllProducts() {
        return repo.findAll();
    }

    public Products getProductById(int id) {
        return repo.findById(id).orElse(null);
    }


    public Products addProduct(Products products) {
        return repo.save(products);
    }

    public Products updateProduct(int id, Products product) {
        return repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    public List<Products> searchProducts(String keyword) {
        return repo.searchProduct(keyword);
    }
}
