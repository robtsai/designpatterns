package com.robtsai.iterator;


import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    // what if we replace the collector?
    //    private List<String> urls = new ArrayList<>();


    // what if we use a fixed array
    //    private String[] urlsFixedArray = new String[10];

    // instead - build a nested class

    private List<String> urls = new ArrayList<>();

    public void push (String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }


    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}
