package com.revature.library.repository;

import com.revature.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    //query to find books where the author name contains a specific string
    List<Book> findByAuthorContaining(String author);
}