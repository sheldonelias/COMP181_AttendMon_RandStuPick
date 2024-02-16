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
        date = "00/00/0000";
    }

    public void printAttendanceReport(Student[] students, String className) throws Exception
    {
        this.className = className;
        Arrays.sort(students);
        //System.out.println( students.length);//Checking length

        try
        {
            FileOutputStream fis = new FileOutputStream("src/AttendanceReport.txt");
            PrintWriter pw = new PrintWriter(fis);
            System.out.println(className);
            pw.println(className + ", " + date);
            for(int i = 0; i < students.length; ++i)
            {
                System.out.println( students[i].getFirstName() + ", " + students[i].getLastName() + ", " + students[i].getStudentID());
                String line = students[i].getFirstName() + ", " + students[i].getLastName() + ", " + students[i].getStudentID();
                pw.println(line);
            }
            pw.flush();
            pw.close();
        }catch(Exception excpt)
        {
            System.out.println("Output file not found. " + excpt);
            System.exit(-1);
        }
    }
}
