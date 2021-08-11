package com.example.servingwebcontent.jeb_demo;

public class TIHardDrive implements HardDrive{

    public String read(){
        System.out.println("reading TI Hard drive");
        return "";
    }

    public void write(String s){
        // write stuff...
        System.out.println("writing TI Hard drive");
    }
}
