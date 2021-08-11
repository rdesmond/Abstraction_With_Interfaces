package com.example.servingwebcontent.jeb_demo;

public class ComputerController {

    public static void main(String[] args) {
        SeagateHardDrive hd = new SeagateHardDrive();
        SonyMonitor monitor = new SonyMonitor();
        Computer computer = new Computer(hd, monitor);
        System.out.println(computer.hardDrive.read());

        TIHardDrive td = new TIHardDrive();
        DellMonitor monitor2 = new DellMonitor();
        Computer computer2 = new Computer(td, monitor2);

        // computer 1
        System.out.println(computer.hardDrive.read());
        computer.hardDrive.write("string");
        computer.monitor.refresh(100);

        // computer 2
        System.out.println(computer2.hardDrive.read());
        computer2.hardDrive.write("string");
        computer2.monitor.refresh(100);




    }
}
