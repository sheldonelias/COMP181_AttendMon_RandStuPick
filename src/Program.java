import java.util.Scanner;

import Model.*;
import View.AttendanceReport;

public class Program
{

    private static Model.Class[] classes;
    private static int classCount;

    static boolean isRunning = true;

    public static void main(String[] args)
    {
        while(isRunning)
        {
            System.out.println("Welcome to the Student Attendance Manager.");
            System.out.println("Choose (C)reate Roles, (P)rint Roles, E(x)it");

            Scanner scnr = new Scanner(System.in);
            String menuChoice = scnr.next();

            //Menu choice interface system
            switch(menuChoice)
            {
                case "c":
                case "C": System.out.println("You selected Create Roles");
                    enterClassCount();
                    initClasses();

                    break;
                case "p":
                case "P": System.out.println("You selected Print Roles");
                    printAllClasses();

                    //-- TEST ZONE ---
                    //The arg delivers an array of students
                    //System.out.println( classes[0].getClasses()[0].getFirstName()   );

                    //CODE TO USE
                    //Instantiate Attendance report object
                    AttendanceReport report = new AttendanceReport();

                    try
                    {
                        //first argument is an array students, and second arg is a String
                        report.printAttendanceReport(classes[0].getClasses(), classes[0].getClassName());
                    }catch(Exception excpt)
                    {
                        //In case bad news, can't create file. Have to this also at other end
                        //in the called class where printAttendanceReport is.
                        System.out.println("Output file not found. " + excpt);
                        System.exit(-1);
                    }
                    break;
                case "x":
                case "X": System.out.println("You selected Exit.");
                    System.exit(0);
                    isRunning = false;
                    break;
                default: System.out.println("Menu choice invalid. Try again.");
                    Program.main(new String[0]);
            }
        }
    }


    public static void initClasses()
    {
        classes = new Model.Class[classCount];
        Scanner scnr = new Scanner(System.in);

        for(int i = 0; i < classes.length; ++i)
        {
            System.out.print("Enter class name: ");
            String className = scnr.next();
            System.out.print("Enter class number: ");
            int classNumber = scnr.nextInt(3); //how many digits max
            classes[i] = new Model.Class(className, classNumber);
        }
    }

    public static void enterClassCount()
    {
        System.out.print("Enter number of classes: ");
        Scanner scnr = new Scanner(System.in);
        classCount = scnr.nextInt();
    }

    public static void printAllClasses()
    {
        for(int i = 0; i < classes.length; ++i )
        {
            System.out.println("Class Name: " + classes[i].getClassName());
            System.out.println("Class Number: " + classes[i].getClassNumber());
            Student[] students = classes[i].getClasses();
            for(Student student: students)
            {
                System.out.println(student.getFirstName()
                        + " " + student.getLastName()
                        + " " + student.getStudentID());
            }
            System.out.println("- - -");
        }

    }

}
