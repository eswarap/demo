package org.woven.bookapp.repository;

import org.woven.bookapp.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {
    List<Book> findByTitle(final String title);
}
