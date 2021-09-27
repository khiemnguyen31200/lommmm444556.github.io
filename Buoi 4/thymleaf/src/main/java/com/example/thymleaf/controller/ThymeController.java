package com.example.thymleaf.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.thymleaf.model.*;
import com.example.thymleaf.model.bookform.bookCreated;
import com.example.thymleaf.repository.*;

@Controller
@RequestMapping("/")
public class ThymeController {
    @Autowired
    private DAO<Book, bookCreated> bookDAO;

    @GetMapping(value = { "/", "/index", "/home" })
    public String getIndex() {
        return "index";
    }

    @GetMapping(value = "book-list")
    public String getBookList(Model model) {
        List<Book> bookList = bookDAO.readAll();
        model.addAttribute("bookList", bookList);
        return "bookData";
    }
}
