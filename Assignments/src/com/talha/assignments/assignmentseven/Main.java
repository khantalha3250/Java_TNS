package com.talha.assignments.assignmentseven;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Using default constructor
     Book book1 = new Book();
     System.out.println(book1);

     // Using constructor with title only
     Book book2 = new Book("The Great Gatsby");
     System.out.println(book2);

     // Using constructor with title and author
     Book book3 = new Book("1984", "George Orwell");
     System.out.println(book3);

     // Using constructor with title, author, and price
     Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", 9.99);
     System.out.println(book4);

     // Using constructor with all details
     Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", 14.99, 1951);
     System.out.println(book5);
 }
}

