package com.codegnan.practice;

public class ProductHandling {
    public static void main(String[] args) {
        Product p=new Product(001,20,"Apple",100);
        Product p2=new Product(002,"Orange");
        p.updateQuantity(20);
        p2.updateQuantity(30,true);
        p.addStock(20);
        p.removeStock(10);
        p2.addStock(5);
        p2.removeStock(10);
        p.printProductDetails();
        p2.printProductDetails();
    }
}
