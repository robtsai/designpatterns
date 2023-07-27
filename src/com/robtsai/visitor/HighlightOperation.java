package com.robtsai.visitor;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlight heading via visitor");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlight anchor via visitor");
    }
}
