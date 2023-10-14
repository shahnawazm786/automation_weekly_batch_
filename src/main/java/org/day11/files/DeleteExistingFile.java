package org.day11.files;

import java.io.File;

public class DeleteExistingFile {
    public static void main(String[] args) {
        File file=new File("C:\\Selenium_Training_PPT\\evening.pptx");
        if(file.exists()){
            file.delete();
            System.out.println("File deleted");
        }
        else {
            System.out.println("File doesn't exist");
        }
    }
}
