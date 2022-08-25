package com.by.bookservice.controller;

import com.by.bookservice.dto.model.BookDTO;
import com.by.bookservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/books")
@RequiredArgsConstructor
public class BookServiceController {

    private final BookService bookService;
    //TODO
    // add parameters to search
    // add swagger
    // add exception
    // add several gender and authors
    // logs
    @GetMapping
    public List<BookDTO> getAllBooks(
            @RequestParam(required = false) String author,
            @RequestParam(required = false) String title) {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable String id) {
        return "getBookById id = "+id;
    }

    @PostMapping()
    public String createNewBook(@RequestBody BookDTO bookDTO) {
        return "createNewBook bookDTO.getTitle() = "+bookDTO.getTitle();
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable String id, @RequestBody BookDTO bookDTO) {
        return "updateBook bookDTO.getTitle() = "+bookDTO.getTitle() +" "+id;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable String id){
        return "deleteBook with id = "+id;
    }

}
