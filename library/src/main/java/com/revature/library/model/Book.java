package com.revature.library.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Book Entity
 */
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-generated primary key
    private Long id;

    @Column(nullable = false) // required
    private String title;

    @Column(nullable = false) // required
    private String author;

    @Column(unique = true, nullable = false) // unique and required
    private String isbn;

    @Column(nullable = false)
    private boolean available = true; // default: true

    private LocalDateTime createdAt;

    // Default constructor
    public Book() {
        this.createdAt = LocalDateTime.now();
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
        this.createdAt = LocalDateTime.now();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}