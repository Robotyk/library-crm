package com.robotyk.controller;

import com.robotyk.entity.Book;
import com.robotyk.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Robotyk on 2018-06-02.
 */

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    LibraryService libraryService;

    @GetMapping("/list")
    public String getBooks(Model model) {
        List<Book> books = libraryService.getBooks();
        model.addAttribute("books", books);
        return "books-list";
    }

    @GetMapping("/new")
    public String getNewBook(Model model) {
        Book newBook = new Book();
        model.addAttribute("book", newBook);
        return "new-book";
    }

    @PostMapping("/save-book")
    public String saveBook(@ModelAttribute("book") Book book) {
        libraryService.addBook(book);
        return "redirect:/book/list";
    }
}
