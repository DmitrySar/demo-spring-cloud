package ru.evolenta.personwithbookmicroservice.model;

public class Book {
    private int id;
    private String title;
    private String genre;
    private String Author;

    public Book() {
    }

    public Book(int id, String title, String genre, String author) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        Author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
