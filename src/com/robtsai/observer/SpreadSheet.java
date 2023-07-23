package com.robtsai.observer;


// add pull style

public class SpreadSheet implements Observer {
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("spreadsheet updated " + dataSource.getValue());
    }
}
