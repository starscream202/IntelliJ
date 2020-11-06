package com.syntax.class13;

public class Laptop2 {
    public static void main(String[] args) {


        com.syntax.class13.Laptop Ashlaptop = new com.syntax.class13.Laptop();
        Ashlaptop.make = "Mac";
        Ashlaptop.model = "Pro 16";
        Ashlaptop.makeVideocall("mike");
        String model = Ashlaptop.getModel();
        System.out.println(model);
        Ashlaptop.playmovies();
    }
}
