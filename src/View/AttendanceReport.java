package View;
//View classes do not hold long term content

import Model.*;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class AttendanceReport
{
    String date;
    String className;

    public AttendanceReport()
    {
        //Set date at instantiation. We will learn to get a real date
        date = "00/00/0000"; //Fake date
    }

    public void printAttendanceReport(Student[] students, String className) throws Exception
    {
        //Pass argument to instance variable
        this.className = className;
        //Sort the incoming array
        Arrays.sort(students);
        //System.out.println( students.length);//Checking length

        // Exception check in the event the app has no permissions to build file.
        try
        {
            //Use file output class and instantiate with file name and path as arg
            FileOutputStream fis = new FileOutputStream("src/AttendanceReport.txt");
            //Instantiate a printwriter
            PrintWriter pw = new PrintWriter(fis);
            //Check print to console that className is working
            //System.out.println(className);
            //Write to file first line of className and date
            pw.println(className + ", " + date);
            //Loop through student list to print every student in array
            for(int i = 0; i < students.length; ++i)
            {
                //Check print to console that student info is working
                //System.out.println( students[i].getFirstName() + ", " + students[i].getLastName() + ", " + students[i].getStudentID());
                String line = students[i].getFirstName() + ", " + students[i].getLastName() + ", " + students[i].getStudentID();
                pw.println(line);
            }
            //Must flush and close, kind of like airplane toilets
            pw.flush();
            pw.close();
        }catch(Exception excpt)
        {
            //In case of rare bad news that file could not be created.
            System.out.println("Output file not found. " + excpt);
            System.exit(-1);
        }
    }
}
