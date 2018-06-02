package com.robotyk.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robotyk on 2018-06-01.
 */

@Entity
@Table(name = "reader")
public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "books_amount")
    private Integer booksAmount;

    @OneToMany(mappedBy = "reader", cascade = {
            CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    private List<Book> books;

    public Reader() {

    }

    public Reader(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.booksAmount = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBooksAmount() {
        return booksAmount;
    }

    public void setBooksAmount(Integer booksAmount) {
        this.booksAmount = booksAmount;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (books == null) {
            books = new ArrayList<>();
        }
        book.setReader(this);
        books.add(book);
        booksAmount++;
    }

    public void removeBook(Book book) {
        if (books != null && books.contains(book)) {
            books.remove(book);
            book.setReader(null);
            booksAmount--;
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", booksAmount=" + booksAmount +
                '}';
    }
}
