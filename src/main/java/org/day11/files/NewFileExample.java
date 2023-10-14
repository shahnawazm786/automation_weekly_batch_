package org.day11.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewFileExample {
    public static void main(String[] args) {
        File f=new File("C:\\Selenium_Training_PPT\\evening.pptx");
        // fileCreate
        try {
            if(f.exists()){
                System.out.println("file already exist");
            }else {
                System.out.println("File is not present in the give location" + f.getAbsoluteFile());
                System.out.println("Now creating the file.........");
                f.createNewFile();
                System.out.println("File is created");
            }
            if(f.isFile()){
                System.out.println("File location\t"+f.getAbsoluteFile());
                System.out.println("Can we read the file content \t"+f.canRead());
                System.out.println("Can we write content into the file \t"+f.canWrite());

            }
            else {
                System.out.println("File is not created");
            }
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
