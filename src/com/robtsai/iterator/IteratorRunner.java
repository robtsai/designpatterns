package com.robtsai.iterator;

public class IteratorRunner {

    public static void runIterator() {
        var history = new BrowseHistory();
        history.push("iterate a");
        history.push("iterate b");
        history.push("iterate c");

        Iterator iterator = history.createIterator();

        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
