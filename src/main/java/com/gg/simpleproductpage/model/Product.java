package com.gg.simpleproductpage.model;


import java.util.List;

public class Product {
    private Integer id;
    private String productHeader;
    private String productName;
    private float productNewPrice;
    private float productOldPrice;
    private String productDescription;
    private String productImage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductHeader() {
        return productHeader;
    }

    public void setProductHeader(String productHeader) {
        this.productHeader = productHeader;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductNewPrice() {
        return productNewPrice;
    }

    public void setProductNewPrice(float productNewPrice) {
        this.productNewPrice = productNewPrice;
    }

    public float getProductOldPrice() {
        return productOldPrice;
    }

    public void setProductOldPrice(float productOldPrice) {
        this.productOldPrice = productOldPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
