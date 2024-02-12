package Controller;

import java.util.Scanner;
import Model.*;

public class Enrollment
{

    public static Student[]  enterStudentData()
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter total enrolled students: ");
        int studentCount = scnr.nextInt();
        Student[] students = new Student[studentCount];

        for(int i = 0; i < students.length; ++i)
        {
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
