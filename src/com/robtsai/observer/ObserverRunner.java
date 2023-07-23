package com.robtsai.observer;

public class ObserverRunner {

    public static void runObserver() {
        System.out.println("Running Observer");

        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);


        dataSource.setValue(1);
    }
}
