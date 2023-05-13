package org.awesome.models.book;

import lombok.RequiredArgsConstructor;
import org.awesome.controllers.admin.books.BookSearch;
import org.awesome.entities.RentalBook;
import org.awesome.repositories.RentalBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookListService {

    private final RentalBookRepository repository;

    public List<RentalBook> gets(BookSearch bookSearch) {



        return null;
    }
}
