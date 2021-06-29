package com.Entity.JPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductInfo {
    @Id
    @GeneratedValue
    private String productInfo;
    private String ProductId;
    private String ProductName;
    private double ProductPrice;
    private int ProductStock;
    private String ProductDescription;
    private String ProductIcon;
    private int ProductStatus;
    private int CategoryType;

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public int getProductStock() {
        return ProductStock;
    }

    public void setProductStock(int productStock) {
        ProductStock = productStock;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public String getProductIcon() {
        return ProductIcon;
    }

    public void setProductIcon(String productIcon) {
        ProductIcon = productIcon;
    }

    public int getProductStatus() {
        return ProductStatus;
    }

    public void setProductStatus(int productStatus) {
        ProductStatus = productStatus;
    }

    public int getCategoryType() {
        return CategoryType;
    }

    public void setCategoryType(int categoryType) {
        CategoryType = categoryType;
    }
}
