package com.codegnan.practice;

public class Product {
    int productId,quantity;
    String productName;
    double price;

    public Product(int productId, int quantity, String productName, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.productName = productName;
        this.price = price;
    }

    public Product(int productId,String productName) {
        this.productId = productId;
        this.productName=productName;
        this.price=0.0;
        this.quantity=1;
    }
    void updateQuantity(int quantity){
        this.quantity=quantity;
        System.out.println("Quantity Updated Successfully...");
    }
    int updateQuantity(int quantity,boolean add){
        if(add) {
            return this.quantity += quantity;
        }else {
            return quantity;
        }
    }
    void addStock(int quantity){
        this.quantity+=quantity;
        System.out.println("Quantity "+this.quantity+" Added Successfully as Deposit");
    }
    void removeStock(int quantity){
        if(this.quantity>=quantity){
            this.quantity-=quantity;
        }
        System.out.println("Stock Removed Successfully!...");
    }
    double getTotalCost(){
        return price*quantity;
    }
    double getDiscounttotal(){
        double Discount=quantity>=6?0.15:(quantity>=3&&quantity<6)?0.1:0.05;
        return Discount;
    }
    double finalPrice() {
        double finalprice=price*quantity;
        return finalprice -(finalprice*getDiscounttotal());
    }

    void printProductDetails(){
        System.err.println("\n------------Product Info-------------");
        System.out.println("Product ID : "+productId+"\nProductName : "+productName+"\nPrice Per Unit : "+price+"\nQuantity : "+quantity+"\nDiscount : "+getDiscounttotal()+"\nFinal Price : "+finalPrice());
    }

}
