package Controller;

import java.util.Scanner;
import Model.*;

public class Enrollment
{

    public static Student[]  enterStudentData()
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
            //Instantiating new students
            students[i] = new Student();
            System.out.println("- - - - -");
        }
        return students;
    }

    static void  printStudentData(Student[] students)
    {
        for(int i = 0; i < students.length; i++)
        {
            System.out.println(
            students[i].getFirstName() + " " +
            students[i].getLastName() + " " +
            students[i].getStudentID()
                    );
        }
    }


}
