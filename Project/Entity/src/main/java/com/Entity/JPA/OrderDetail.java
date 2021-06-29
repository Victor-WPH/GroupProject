package com.Entity.JPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue
    private String orderDetail;
    private String DetailId;
    private String OrderId;
    private String ProductIcon;

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getDetailId() {
        return DetailId;
    }

    public void setDetailId(String detailId) {
        DetailId = detailId;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getProductIcon() {
        return ProductIcon;
    }

    public void setProductIcon(String productIcon) {
        ProductIcon = productIcon;
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

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        ProductQuantity = productQuantity;
    }

    private String ProductId;
    private String ProductName;
    private String ProductPrice;
    private String ProductQuantity;

}
