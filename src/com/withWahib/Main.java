package com.withWahib;
import java.util.*;
class Book{
    private String name;
    private Author author;
    private Date dateOfPublication;
    Book(String name,Author author,Date dateOfPublication){
        this.name=name;
        this.author=author;
        this.dateOfPublication=dateOfPublication;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public Date getDate(){
        return dateOfPublication;
    }
}
class Author{
    public String name, lastname;
    public String email;
    public int age;
    Author(String name,String lastname, String email,int age){
        this.name=name;
        this.lastname=lastname;
        this.email=email;
        this.age=age;
    }
}
public class Main{
    public static void main(String[] args){
        Book k1 = new Book(" Learn Programming With Wahib ", new Author("Wahib ", "Moqbel",
                "wahib@gmail.com", 25) , new Date(2021,4,28));

        System.out.println("Name : "+ k1.getAuthor().name+"\nLast name :  "+k1.getAuthor().lastname+"\n");
        System.out.println("Age : "+k1.getAuthor().age+"\n"+"Email : "+k1.getAuthor().email+"\n");
        System.out.println("Name of the book  : "+k1.getName()+"\n"+"Publication Date  : "+k1.getDate()+"\n");
    }
}