package com.gg.simpleproductpage.controller;

import com.gg.simpleproductpage.model.Product;
import com.gg.simpleproductpage.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProductController {
	
	
    @Autowired
    ProductService productService;
   
    @CrossOrigin(origins = "http://172.18.0.2:3000")
    @GetMapping(value = "/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @CrossOrigin(origins = "http://172.18.0.2:3000")
    @GetMapping(value = "/products/{id}")
    public List<Product> getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

   

}
