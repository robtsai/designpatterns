package com.robtsai.decorator;

public class DecoratorRunner {
    public static void runDecorator() {
        var cloudStream = new CloudStream();
        cloudStream.write("here is some data");

        // decorating
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));

    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-56-78910");
    }
}
