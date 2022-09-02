package com.example.specifications.domain;

import com.example.specifications.core.generic.ExtendedEntity;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Book extends ExtendedEntity {

    private String title;
    private double purchasePrice;

    public Book() {
    }

    public Book(UUID id, String title, double purchasePrice) {
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

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public Book setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }
}
