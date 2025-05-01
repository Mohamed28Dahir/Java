package com.Books.LMS;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping
public class BookController {
    private final BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("all")
    public Collection<Book>getBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.getBookById(id);

    }
    public Book insetBook(@RequestBody Book newBook){
        return bookService.saveBook(newBook);
    }
    @PutMapping("{id}")
    public Book updateBook(@PathVariable Long id,@RequestBody Book newBook){
        return bookService.updateBook(id, newBook);
    }
    @DeleteMapping("{id}")
    public  Book deleteBook(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }
}
