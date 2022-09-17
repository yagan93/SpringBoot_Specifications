package com.example.specifications.domain;


import java.util.List;

public interface BookService {
    List<Book> findAll(double purchasePrice);
}
