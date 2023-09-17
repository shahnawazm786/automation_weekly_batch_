package org.day6;
// Encapsulation example
// Data is obtained from the public method only
public class StudentClass {
    private String studentName;
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
