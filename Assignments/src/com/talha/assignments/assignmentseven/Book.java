package com.talha.assignments.assignmentseven;
//Program to implement constructor overloading.
//Book.java
public class Book {
 private String title;
 private String author;
 private double price;
 private int publicationYear;

 // Default constructor
 public Book() {
     this.title = "Unknown Title";
     this.author = "Unknown Author";
     this.price = 0.0;
     this.publicationYear = 0;
 }

 // Constructor with title only
 public Book(String title) {
     this.title = title;
     this.author = "Unknown Author";
     this.price = 0.0;
     this.publicationYear = 0;
 }

 // Constructor with title and author
 public Book(String title, String author) {
     this.title = title;
     this.author = author;
     this.price = 0.0;
     this.publicationYear = 0;
 }

 // Constructor with title, author, and price
 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.publicationYear = 0;
 }

 // Constructor with all details
 public Book(String title, String author, double price, int publicationYear) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.publicationYear = publicationYear;
 }

 // Getters and setters
 public String getTitle() {
     return title;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public String getAuthor() {
     return author;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 public int getPublicationYear() {
     return publicationYear;
 }

 public void setPublicationYear(int publicationYear) {
     this.publicationYear = publicationYear;
 }

 @Override
 public String toString() {
     return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publicationYear=" + publicationYear + "]";
 }
}
