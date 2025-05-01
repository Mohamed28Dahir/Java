package com.Books.LMS;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BookService {
    private Map<Long,Book> Books = new ConcurrentHashMap<>();
    private AtomicLong author = new AtomicLong();

    public Collection<Book> getAllBooks(){
        return Books.values();
    }
    public Book getBookById(Long id){
        return Books.get(id);
    }

    public Book saveBook(Book newBook) {
        Long BookId = newBook.getId() != null
                ? newBook.getId()
                : author.incrementAndGet();
                    return newBook;
    }
    public Book updateBook (Long id, Book newBook){
        if (Books.containsKey(id)){
            Book oldBook = getBookById(id);
            oldBook.setAuthor(newBook.getAuthor());
            oldBook.setTitle(newBook.getTitle());
            Books.put(id,oldBook);
            return oldBook;
        }
        else
            return null;
    }
    public Book deleteBookById(Long id){
        return Books.remove(id);
    }
}
