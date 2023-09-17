package org.day6;

public class EncapsulationExample {
    public static void main(String[] args) {
      StudentClass std=new StudentClass();
      std.setStudentName("KAZ");
        System.out.println(std.getStudentName());
        std.setMarks(200);
        double marks = std.getMarks();
        System.out.println(marks);
        System.out.println(std.getMarks());

    }

}
