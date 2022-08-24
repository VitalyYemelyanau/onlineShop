package com.example.bookservice.controller;

import com.example.bookservice.dto.BookDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/books")
public class BookServiceController {

    @GetMapping
    public String getAllBooks(
            @RequestParam(required = false) String author,
            @RequestParam(required = false) String title) {
        return "allBooks "+author+" "+title;
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable String id) {
        return "getBookById id = "+id;
    }

    @PostMapping()
    public String createNewBook(@RequestBody BookDTO bookDTO) {
        return "createNewBook bookDTO.getTitle() = "+bookDTO.getTitle();
    }

    @PatchMapping()
    public String updateBook(@RequestBody BookDTO bookDTO) {
        return "updateBook bookDTO.getTitle() = "+bookDTO.getTitle();
    }


}
