package com.robtsai.iterator;

// we could use generics here with Iterator<T>
// implements Iterator<String>

public interface Iterator {
    boolean hasNext();
    String current();
    void next();
}

