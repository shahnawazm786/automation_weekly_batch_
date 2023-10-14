package org.day11.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteContentIntoaFileExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Selenium_Training_PPT\\evening.txt");
            fileWriter.write("This class is dedicated to Prhilistine Martyr");
            fileWriter.write("Second line");
            fileWriter.close();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
