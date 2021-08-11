package com.example.servingwebcontent.jeb_demo;

public class DellMonitor implements Monitor{
    @Override
    public void refresh(int refreshRate) {
        System.out.println("refreshing Dell monitor");
    }
}
