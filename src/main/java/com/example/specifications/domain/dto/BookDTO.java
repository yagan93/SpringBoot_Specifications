package com.example.specifications.domain.dto;

import com.example.specifications.core.generic.ExtendedDTO;

import java.util.UUID;

public class BookDTO extends ExtendedDTO {

    private String title;
    private int purchasePrice;

    public BookDTO() {
    }

    public BookDTO(UUID id, String title, int purchasePrice) {
        super(id);
        this.title = title;
        this.purchasePrice = purchasePrice;
    }

    public String getTitle() {
        return title;
    }

    public BookDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public BookDTO setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }
}
