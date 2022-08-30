package com.example.specifications.domain.dto;

import com.example.specifications.domain.Book;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {
    List<Book> fromDTOs (List<BookDTO> bookDTOs);
    List<BookDTO> toDTOs (List<Book> books);
}
