package com.robtsai.strategy;

public class ImageStorage {
    private Compressor compressor;

    public ImageStorage(Compressor compressor) {
        this.compressor = compressor;
    }

    public void store(String fileName) {
        compressor.compress(fileName);
    }

}
