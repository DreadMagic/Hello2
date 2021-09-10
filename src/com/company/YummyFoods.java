package com.company;

public class YummyFoods {
    public static void main(String[] args) {
        System.out.print("Yummy");
        System.out.println("Food");
        chocolate();
        chocolate();
        iceCream();
        System.out.println("I want lunch");
    }

    public static void chocolate(){
        System.out.println("Chocolate");

    }

    public static void iceCream(){
        chocolate();
        System.out.println("That was ok");
    }
}
