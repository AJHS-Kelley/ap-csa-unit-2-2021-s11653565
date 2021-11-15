import java.until.Scanner;

// Unit 2, Topic 2.1, Classes and objects, 11/15/21, Version 0.5


// Starting memory diagram 
a = 4
b = 3
c = Ricer 

// Ending memory diagram 
a = a *8
b = b /2
c = Tuner 


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




    // More than one constructor is known as OVERLOADING.



   
   
    // Creating Methods 

    public static void calcGPA() {
        int grade0;
        int grade1;
        int grade2;
        int grade3;
        double newGPA;

         
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is the first grade");
        grade0 = myScanner.nextInt();
        System.out.println("What is the second grade");
        grade1 = myScanner.nextInt();
        System.out.println("What is the third grade");
        grade2 = myScanner.nextInt();
        System.out.println("What is the fourth grade");
        grade3 = myScanner.nextInt();

        newGPA = (grade0 + grade1 + grade2 + grade3) / 4; 
        System.out.print("The new GPA is");
        System.out.println(newGPA);


    }
    
    public static void newLine() {
        System.out.println();

    }

   
   public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }



    // Parameters and Arguments 
    public static void assignLunch(int gradeLevel) { 
        String lunchPeriod; 

        if (gradeLevel == 9) {
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 10) { 
            lunchPeriod = "First Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 11) {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else { 
            lunchPeriod = "Outside Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }


    }

    public static void assignLunchMultiple(int gradeLevel, double gradePointAvg) { 
        String lunchPeriod; 
        // AND, OR, NOT -- Boolean Operators
        // && -- AND
        // || -- OR
        // ! -- NOT

        if (gradeLevel == 9 || gradePoingAvg <= 1.5) {
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 10 && gradePointAvg > 2.0) { 
            lunchPeriod = "First Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 11 && gradePointAvg != 0.0) {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else { 
            lunchPeriod = "Outside Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }


    }


     public static void main(String[] args) {
        /* 
        Student student0 = new Student(1231431, 6, 2.0, "Bingo");
        Student student1 = new Student(87654321, 9, 10.4, "Bingo");

        System.out.println("Hello there!");
        threeLine();
        System.out.println("General Kenobi");
        */

        assignLunch(9);
        assignLunch(11);
        assignLunch(10);
        assignLunch(12);

    }




}