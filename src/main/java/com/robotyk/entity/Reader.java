package com.robotyk.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
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

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @Email
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

    public void incrementBooksAmount() {
        ++booksAmount;
    }

    public void decrementBooksAmount() {
        --booksAmount;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
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
