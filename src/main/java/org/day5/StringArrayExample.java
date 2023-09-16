package org.day5;

public class StringArrayExample {
    public static void main(String[] args) {
        String[] words={"Java","Oracle","C language","Python","SQL Server","Java"};
        System.out.println(words[0]);
        for(String s:words){
            System.out.println(s);
        }
        for(int j=0;j<words.length;j++){
            System.out.println(words[j]);
        }
        char[] chr={'a','b','c','d','e'};
        for(char c:chr){
            System.out.println(c);
        }
        for(int i=0;i<chr.length;i++){
            System.out.println(chr[i]);
        }
    }
    // find duplicate word from the String array
    // filter all the vowels
}
