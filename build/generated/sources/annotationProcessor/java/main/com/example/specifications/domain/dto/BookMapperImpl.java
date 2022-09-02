package com.example.specifications.domain.dto;

import com.example.specifications.domain.Book;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-02T21:47:18+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public List<Book> fromDTOs(List<BookDTO> bookDTOs) {
        if ( bookDTOs == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( bookDTOs.size() );
        for ( BookDTO bookDTO : bookDTOs ) {
            list.add( bookDTOToBook( bookDTO ) );
        }

        return list;
    }

    @Override
    public List<BookDTO> toDTOs(List<Book> books) {
        if ( books == null ) {
            return null;
        }

        List<BookDTO> list = new ArrayList<BookDTO>( books.size() );
        for ( Book book : books ) {
            list.add( bookToBookDTO( book ) );
        }

        return list;
    }

    protected Book bookDTOToBook(BookDTO bookDTO) {
        if ( bookDTO == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( bookDTO.getId() );
        book.setTitle( bookDTO.getTitle() );
        book.setPurchasePrice( bookDTO.getPurchasePrice() );

        return book;
    }

    protected BookDTO bookToBookDTO(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDTO bookDTO = new BookDTO();

        bookDTO.setId( book.getId() );
        bookDTO.setTitle( book.getTitle() );
        bookDTO.setPurchasePrice( (int) book.getPurchasePrice() );

        return bookDTO;
    }
}
