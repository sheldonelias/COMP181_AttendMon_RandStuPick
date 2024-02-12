package Model;

import java.util.Scanner;
public class Student
{
    private String firstName;
    private String lastName;
    private String studentID;

    public Student()
    {
        setFirstName();
        setLastName();
        setStudentID();
    }

    public void setFirstName()
    {
        System.out.print("Enter first name: ");
        Scanner scnr = new Scanner(System.in);
        firstName = scnr.next();
    }

    public void setLastName()
    {
        System.out.print("Enter last name: ");
        Scanner scnr = new Scanner(System.in);
        lastName = scnr.next();
    }

    public void setStudentID()
    {
        System.out.print("Enter student id: ");
        Scanner scnr = new Scanner(System.in);
        studentID = scnr.next();
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getStudentID()
    {
        return studentID;
    }
}
