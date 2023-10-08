package org.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class CheckedExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\apps\\oradata\\ORCL\\CONTROL01.CTL");
        Reader reader=new FileReader(file);
    }
}
