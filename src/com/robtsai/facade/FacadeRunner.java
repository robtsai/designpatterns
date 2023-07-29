package com.robtsai.facade;

public class FacadeRunner {
    public static void runFacade() {

        var service = new NotificationService();
        service.send("Helllllloooo world", "target");

    }
}
