package com.robtsai.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("compressing " + fileName + " with jpeg algo");
    }
}
