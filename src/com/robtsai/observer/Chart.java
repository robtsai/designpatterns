package com.robtsai.observer;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("chart got updates " + value);
    }
}
