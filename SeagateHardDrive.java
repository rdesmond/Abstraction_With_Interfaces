package com.example.servingwebcontent.jeb_demo;

public class SeagateHardDrive implements HardDrive{

    public String read(){
        System.out.println("reading seagate Hard drive");
        return "";
    }

    public void write(String s){
        // write stuff...
        System.out.println("writing seagate Hard drive");
    }

}
