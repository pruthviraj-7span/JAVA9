package com.praviteMethod;

public class PrivateImpl implements PrivateInter {

    public static void main(String[] args) {

        System.out.println("Hello World");
        PrivateInter card = new PrivateImpl();
        card.cardName();
       // PrivateInter.displayCardDetails();
       // PrivateInter.test();
    }
}