package com.revature.library;

import com.revature.library.model.Book;
import com.revature.library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner initializeDatabase(BookRepository repository) {
        return args -> {
            // Check if data already exists to avoid duplicates
            if (repository.count() == 0) {
                System.out.println("Seeding book data...");

                repository.saveAll(List.of(
                        new Book("Clean Code", "Robert Martin", "978-0132350884"),
                        new Book("The Pragmatic Programmer", "David Thomas", "978-0135957059"),
                        new Book("Design Patterns", "Gang of Four", "978-0201633610"),
                        new Book("Effective Java", "Joshua Bloch", "978-0134685991"),
                        new Book("Spring in Action", "Craig Walls", "978-1617294945")
                ));

                System.out.println("Database seeded with 5 books.");
            }
        };
    }
}