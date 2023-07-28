package com.robtsai.adapter;

import com.robtsai.adapter.avaFilters.Caramel;

public class AdapterRunner {
    public static void runAdapter() {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
