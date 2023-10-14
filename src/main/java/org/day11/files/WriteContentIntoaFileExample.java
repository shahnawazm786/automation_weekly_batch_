package org.day11.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContentIntoaFileExample {
    public static void main(String[] args) {
        FileWriter fileWriter;
        try {
           File file=new File("C:\\Selenium_Training_PPT\\evening.txt");
           if(file.exists()){
               System.out.println("File already exist");

           }
            else {
               fileWriter = new FileWriter(file);
               fileWriter.write("This class is dedicated to Prhilistine Martyr");
               fileWriter.write("Second line");
               fileWriter.close();
           }

        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
