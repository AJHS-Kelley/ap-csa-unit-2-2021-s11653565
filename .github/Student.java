import java.until.Scanner;

// Unit 2, Topic 2.1, Classes and objects, 12/06/21, 9:02 AM, Version 0.60
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


    
    
    
    
    
    
    
    
    
    public static void mathPractice() {
        int x;
        int y; 
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type an integer and press enter.\n");
        x = myScanner.nextInt();
        System.out.println("Type an integer and press enter.\n");
        y = myScanner.nextInt();
        System.out.println(Math.min(x, y));
        
        int lowest;
        lowest = Math.min(x, y);
        System.out.println(lowest);

        System.out.println("Next we will use Math.pow() to calculate.\n");
        System.out.println(Math.pow(x, y)); 

        double exponents;
        exponents = Math.pow(x, y);
        System.out.println(exponents); 

        System.out.println("Next we will use MAth,random().\n");
        System.out.println(Math.random());

        double percentage;
        percentage = (Math.random() * 100); 
        System.out.println("There is a ");
        System.out.println(percentage);
        System.out.println("% chance of rain today.\n");




    }

    public static double getGPA() {
        int grade0, grade1, grade2; 


    grade0 = 10;
    grade1 = 15;
    grade2 = 50;

    double fakeGPA;
    fakeGPA = (grade0 + grade1 + grade2) / 3; 

    return fakeGPA; 

    }

    public static void main(String[] args) {
        /*
        assignLunchMultiple(10, 1.45);
        assignLunchMultiple(11, 2.5);
        */


        // mathPractice();

        double realGPA; 
        realGPA = -1.0;
        System.out.println(realGPA);
        realGPA = getGPA();
        System.out.println(realGPA);
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






}

 /* 
    assignLunchMultiple(10, 2.0);
    assignLunchMultiple(11, 3.4);
    assignLunchMultiple(9, 4.0);
    assignLunchMultiple(12, 5.3);
}
} */ 