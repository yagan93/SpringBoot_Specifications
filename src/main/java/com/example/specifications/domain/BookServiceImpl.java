package com.example.specifications.domain;

import com.example.specifications.core.generic.ExtendedSpecification;
import com.example.specifications.core.specification.SearchCriteria;
import com.example.specifications.core.specification.SearchOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll(int price) {
        ExtendedSpecification<Book> specification = new ExtendedSpecification<>();
        specification.add(new SearchCriteria("purchasePrice", price, SearchOperation.LESS_THAN));
        return bookRepository.findAll(specification);
    }
}
