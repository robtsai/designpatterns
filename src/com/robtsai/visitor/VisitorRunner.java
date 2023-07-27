package com.robtsai.visitor;

public class VisitorRunner {
    public static void runVisitor() {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());

    }
}
