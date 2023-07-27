package com.robtsai.chainOfResponsibility;

public class ChainRunner {
    public static void runChain() {
        // authenticator -> logger -> compressor
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
