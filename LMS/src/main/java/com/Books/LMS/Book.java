package com.Books.LMS;

public class Book {
    private  Long id;
    private  String title , author;

    public Book(){ }

    public  Book(Long id ,String title, String author ){
        this.id = id;
        this.title=title;
        this.author=author;
    }
    public Long getId(){
        return id;
    }
    public void setId(){
        this.id =id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title ){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author =author;
    }
}
