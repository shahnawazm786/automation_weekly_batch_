package org.day11.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingContentsFromTheFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Selenium_Training_PPT\\evening.txt");
            FileReader fileReader = new FileReader(file);
            int c;
            while((c=fileReader.read())!=-1) {
                System.out.print(Character.toChars(c));
            }
            fileReader.close();
            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
