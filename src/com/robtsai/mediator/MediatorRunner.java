package com.robtsai.mediator;

public class MediatorRunner {
    public static void runMediator() {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
