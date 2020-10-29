package com.syntax.class13;

public class Laptop {

    String make;
    String model;
    int harddrive;
    int ram;
    String color;
    String processor;
    String gpu;

    void playmovies(){
        System.out.println("Playing movies");
    }
    void browse(){
        System.out.println("Browse Internet");
    }
    void makeVideocall(String contact){
        System.out.println("Video calling "+contact);
    }

    public String getModel(){
        return model;
    }

}
