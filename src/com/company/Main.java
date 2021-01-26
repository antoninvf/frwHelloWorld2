package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            for (int i = 0; i < 100; i++) {
                bw.write("Hello world!");
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Unable to write to file...");
        }

    }
}
