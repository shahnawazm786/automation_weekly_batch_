package org.day11.files;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File file=new File("C:\\Selenium_Training_PPT\\evening.png");
        if(file.exists()){
            System.out.println("File name "+file.getName());
            System.out.println("File path "+file.getPath());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            String fileName=file.getName();
            System.out.println(fileName);
            String[] extension=fileName.split(".");

        }
    }
}
