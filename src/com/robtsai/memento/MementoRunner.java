package com.robtsai.memento;

public class MementoRunner {

    public static void runMemento() {
        System.out.println("running memento");
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }

}
