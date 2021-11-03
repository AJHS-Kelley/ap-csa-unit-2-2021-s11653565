// Unit 2, Topic 2.1, Classes and objects, 11/01/21, Version 0.1

public class Student {
        // These are INSTANCE VARIABLES.
        private int studentID;
        private int gradeLevel;
        private double gradePointAvg;
        private String studentName;


    // Creating a constructor 
    public student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradePointAvg = 0.0;
        this.studentName = "";
    }
    
    // Value constructor 
    public Student(int studentID, int gradeLevel, double gradePointAvg, String studentName) {
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.gradePointAvg = GPA;
        this.studentName = studentName; 
    }
    


    public static void main(String[] args) {
        Student student0 = new Student();
        Student student1 = new Student(87654321, 9, 10.4, "Bingo");

    }
}