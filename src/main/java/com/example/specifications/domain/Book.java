package com.example.specifications.domain;

import com.example.specifications.core.generic.ExtendedEntity;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Book extends ExtendedEntity {

    private String title;

    private Integer purchasePrice;

    public Book() {
    }

    public Book(UUID id, String title, Integer purchasePrice) {
        super(id);
        this.title = title;
        this.purchasePrice = purchasePrice;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public Book setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }
}
