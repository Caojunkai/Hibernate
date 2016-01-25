package com.entry;

import java.io.Serializable;

public class AnyOrderItem implements Serializable{
    private int id;
    private AnyOrder anyOrder;
    private AnyItem anyItem;
    private Double discount;
    private Double price;
    private Integer amount;

    public AnyOrderItem() {
    }

    public AnyOrderItem(AnyOrder anyOrder, AnyItem anyItem, Double discount, Double price, Integer amount) {
        this.anyOrder = anyOrder;
        this.anyItem = anyItem;
        this.discount = discount;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AnyOrder getAnyOrder() {
        return anyOrder;
    }

    public void setAnyOrder(AnyOrder anyOrder) {
        this.anyOrder = anyOrder;
    }

    public AnyItem getAnyItem() {
        return anyItem;
    }

    public void setAnyItem(AnyItem anyItem) {
        this.anyItem = anyItem;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
