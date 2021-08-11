package com.example.servingwebcontent.jeb_demo;

public class Computer {

    // this is an interface
    HardDrive hardDrive;
    // this is an interface
    Monitor monitor;

    public Computer(HardDrive hd, Monitor monitor){
        hardDrive = hd;
        this.monitor = monitor;
    }

    public void boot(){
        System.out.println("Starting OS...");
    }

}
