package com.company;

abstract class Book {

    protected String name;
    protected String author;
    protected String price;

public Book(String name, String author, String price){
        this.name=name;
        this.author=author;
        this.price=price;
}
public abstract String getDetails();
}
interface Library{
    public default void isTotalBooks() {
        System.out.println("Total number of books are 4000000 ");

    }
}
class MyBook extends Book implements Library{
    public MyBook(String name,String author, String price){
        super(name, author, price);

    }

    @Override
    public String getDetails() {
        return name +", " + author + ", " +price;
    }

}

class Demo{
    public static void main(String args[]){
        Book myBook = new MyBook("vinit","Shubhada","1000");
        System.out.println(myBook.getDetails());
        Library book1= new MyBook("ommmm","bxdjsgckshc","44444");
        book1.isTotalBooks();

    }
}