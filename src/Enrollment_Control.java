import java.util.Scanner;

public class Enrollment_Control
{

    static Student_Model[]  enterStudentData()
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter total enrolled students: ");
        int studentCount = scnr.nextInt();
        Student_Model[] students = new Student_Model[studentCount];

        for(int i = 0; i < students.length; ++i)
        {
            students[i] = new Student_Model();
            System.out.println("- - - - -");
        }
        return students;
    }

    static void  printStudentData(Student_Model[] students)
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
