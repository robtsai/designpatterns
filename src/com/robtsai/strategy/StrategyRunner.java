package com.robtsai.strategy;

public class StrategyRunner {
    public static void runStrategy() {

        System.out.println("running strategy pattern");

        var imageStorageJpeg = new ImageStorage(
                new JpegCompressor()
        );
        imageStorageJpeg.store("file_a");

        var imageStoragePng = new ImageStorage(
                new PngCompressor()
        );
        imageStoragePng.store("file_b");
    }
}
