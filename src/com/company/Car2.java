package com.company;

public class Car2 implements AutoCloseable{

    public void close(){
        System.out.println("car is close");
    }
    public void drive (){
        System.out.println("car is riding");
    }
    public void stop (){
        //System.out.println("car is stopping");
        System.out.println(5/0);
    }
}
