package com.arjun.oca2;
//Take a bit much special care
//static is not a final will may we reassign in the program is possible.
class Book{
    int pages;
    double cost;
    Book(int pages,double cost){
        this.pages=pages;
        this.cost-=cost;
    }
}
public class OCATest8 {
    public void updateBook(Book b, double newCost){
        b.pages=400;
        b.cost=b.cost+newCost;
    }
    public static void main(String[] args) {
        Book b= new Book(255,100.0);
        OCATest8 ocaTest8= new OCATest8();
        double newCost=200.0;
        ocaTest8.updateBook(b,newCost);
        ocaTest8.updateBook(b,newCost);
        System.out.println(b.pages+":"+newCost);
    }
    }