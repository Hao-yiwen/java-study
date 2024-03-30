package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileStrOutput {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("foo.txt");
            writer.write("hello foo");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
