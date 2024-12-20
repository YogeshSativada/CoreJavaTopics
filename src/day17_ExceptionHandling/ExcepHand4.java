package day17_ExceptionHandling;

import java.io.*;

public class ExcepHand4 {
    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName); // This may throw IOException
    }
}



