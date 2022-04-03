package com.gg.simpleproductpage.service;

import java.util.List;

import com.gg.simpleproductpage.model.Product;

public interface ProductService {
    List<Product> getProducts();
    List<Product> getProductById(int id);
}
