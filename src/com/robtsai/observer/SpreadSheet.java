package com.robtsai.observer;


// add push style
public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("spreadsheet updated " + value);
    }
}
