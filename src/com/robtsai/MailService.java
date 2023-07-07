package com.robtsai;

public class MailService {
    public void sendEmail() {
        connect(1);
        authenticate();
        disconnect();
    }

    private void connect(int timeout) {
        System.out.println("Connect");
        System.out.println("timeout is " + timeout);
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }
}
