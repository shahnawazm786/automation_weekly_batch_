package org.day6;
// Encapsulation example
// Data is obtained from the public method only
public class StudentClass {

    private String studentName;// private access specifier
    private double marks;
    protected  String remarks;
    String subject;// default or package
    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        this.marks=marks;
    }
    // Access Specifier -> private, protected, public, package / default
    // provide accessibility

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void show(){
        System.out.println(this.studentName);
    }

    // Modifier -> final, static, final, abstract




}
