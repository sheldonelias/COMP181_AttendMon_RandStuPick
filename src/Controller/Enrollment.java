package Controller;

import java.util.Scanner;
import Model.*;

public class Enrollment
{
    //Creates an array of students for a class
    public static Student[]  enterStudentData(String className, String classNumber)
    {
        //Creating user input captures
        Scanner scnr = new Scanner(System.in);
        //Getting the count of students in a class
        System.out.print("Enter total enrolled students: ");
        int studentCount = scnr.nextInt();
        //Instantiating array to hold all student names
        Student[] students = new Student[studentCount];

        //Building the array of full student places
        for(int i = 0; i < students.length; ++i)
        {
            //Instantiating new students data keyed in and not loading from a file
            students[i] = new Student(false, String.valueOf (i+1));
            System.out.println("- - - - -");
        }

        printStudentData(students, className, classNumber);

        return students;
    }

    static void  printStudentData(Student[] students, String className, String classNumber)
    {
        System.out.println("- - - - -");
        System.out.println("You enrolled the following students in: \n" +
                classNumber + ": " + className);
        //Prints the data of all students in one given array
        for(int i = 0; i < students.length; i++)
        {
            System.out.println(
                    students[i].getStudentID() + " " +
                    students[i].getFirstName() + " " +
                    students[i].getLastName()
                    );

        }
    }
}
