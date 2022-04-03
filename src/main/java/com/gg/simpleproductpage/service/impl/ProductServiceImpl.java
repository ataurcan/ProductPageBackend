package com.gg.simpleproductpage.service.impl;

import com.gg.simpleproductpage.controller.ProductController;
import com.gg.simpleproductpage.model.Product;
import com.gg.simpleproductpage.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Value("${product1.id}")
    public Integer id1;

    @Value("${product1.header}")
    public String header1;

    @Value("${product1.name}")
    public String name1;

    @Value("${product1.newPrice}")
    public float newPrice1;

    @Value("${product1.oldPrice}")
    public float oldPrice1;

    @Value("${product1.description}")
    public String description1;

    @Value("${product1.image}")
    public String image1;

    @Value("${product2.id}")
    public Integer id2;

    @Value("${product2.header}")
    public String header2;

    @Value("${product2.name}")
    public String name2;

    @Value("${product2.newPrice}")
    public float newPrice2;

    @Value("${product2.oldPrice}")
    public float oldPrice2;

    @Value("${product2.description}")
    public String description2;

    @Value("${product2.image}")
    public String image2;



    @Override
    public List<Product> getProducts() {

        List<Product> productList = new ArrayList<>();

        Product productDto = new Product();
        Product productDto2 = new Product();

        productDto.setId(id1);
        productDto.setProductHeader(header1);
        productDto.setProductName(name1);
        productDto.setProductNewPrice(newPrice1);
        productDto.setProductOldPrice(oldPrice1);
        productDto.setProductDescription(description1);
        productDto.setProductImage(image1);

        productDto2.setId(id2);
        productDto2.setProductHeader(header2);
        productDto2.setProductName(name2);
        productDto2.setProductNewPrice(newPrice2);
        productDto2.setProductOldPrice(oldPrice2);
        productDto2.setProductDescription(description2);
        productDto2.setProductImage(image2);


        productList.add(productDto);
        productList.add(productDto2);
        return productList;
    }

    @Override
    public List<Product> getProductById(int id) {
        List<Product> product = getProducts().stream()
                .filter(p -> p.getId() == id)
                .collect(Collectors.toList());
        return product;
    }

}
