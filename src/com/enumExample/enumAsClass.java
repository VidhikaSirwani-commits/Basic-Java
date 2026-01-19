package com.enumExample;
enum Laptop{
    Macbook(2000), XPS(2200), Surface(1700), ThinkPad(1800);
    // in java enum is a class and all these above elements are objects
    // so now its like these are constructors with their proces

    private int price;

    private Laptop(int price) {
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class enumAsClass {
    public static void main(String[] args) {
        Status s = Status.SUCCESS;
        // we will try to see which is the super class of enum
        System.out.println(s.getClass().getSuperclass());
        // we will get this output "class java.lang.Enum"
        // now all the methods ordinal and all are from the Enum class

        Laptop lap= Laptop.Macbook;
        // now i want to get the price of the macbook we can use getter and setters
        System.out.println(lap+" : "+ lap.getPrice());


        // suppose i want to print all laptops with their prices
        for (Laptop l: Laptop.values()){
            System.out.println(l+" : "+l.getPrice());
        }
    }
}
