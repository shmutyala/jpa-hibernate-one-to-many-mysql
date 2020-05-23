package com.mutyala.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mutyala.jpa.book.BookService;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
    private final BookService bookService;

    public JpaApplication(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) {
        bookService.create();
        bookService.read();
        bookService.delete();
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
}
