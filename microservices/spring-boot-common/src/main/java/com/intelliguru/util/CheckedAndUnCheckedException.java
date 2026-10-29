package com.intelliguru.util;

import java.io.FileReader;
import java.io.IOException;

public class CheckedAndUnCheckedException {
    public static void main(String[] args) {

        // Checked Exception
        try {
            readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Unchecked Exception
        divide();
    }

    public static void readFile() throws IOException {
        FileReader reader = new FileReader("data.txt");
        reader.close();
    }

    public static void divide() {
        int result = 10 / 0;
        System.out.println(result);
    }
}
