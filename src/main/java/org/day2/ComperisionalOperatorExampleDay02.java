package org.day2;

public class ComperisionalOperatorExampleDay02 {
    public static void main(String[] args) {
        // >, <.>=,<=,==,!=
        System.out.println("------ > -----");
        System.out.println(500>100); // true
        System.out.println(100>200); // false
        System.out.println("------ < -----");
        System.out.println(100<200); // true
        System.out.println(200<100); // false
        System.out.println("------ == -----");
        System.out.println(100==100); // true
        System.out.println(100==200); // false
        System.out.println(200==100); // false
        // >= , <=
        System.out.println("------ >= -----");
        System.out.println(500>=100); // true
        System.out.println(500>=500); // true
        System.out.println(100>=200); // false
//https://github.com/shahnawazm786/automation_weekly_batch_
        System.out.println("------ <= -----");
        System.out.println(100<=500); // true
        System.out.println(500>=500); // true
        System.out.println(200<=100); // false
    }
}
