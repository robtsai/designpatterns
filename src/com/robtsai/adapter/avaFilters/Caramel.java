package com.robtsai.adapter.avaFilters;

import com.robtsai.adapter.Image;

public class Caramel {

    // use adapter pattern to convert interface to what we need
    public void init() {

    }

    public void render(Image image) {
        System.out.println("applying caramel filter");
    }
}
