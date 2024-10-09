import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Class
{
    //Instance variable declaration
    private String className;
    private String classNumber;
    private int classSize;
    private Student[] students;


    //Default constructor
    public Class()
    {
        setClassName();
        setClassNumber();
        setClassSize();
        setStudents();

    }

    public Class(String className, String classNumber, int classSize)
    {
        setClassName(className);
        setClassNumber(classNumber);
        setClassSize(classSize);
        setStudents();

    }

    public void setStudents()
    {
        Scanner scnr = new Scanner(System.in);

        students = new Student[classSize];

        for(int i = 0; i < students.length; ++i)
        {

            Student student = new Student();

            System.out.println("Enter first name:");

            String fName = scnr.nextLine();

            student.setFirstName(fName);

            //System.out.println("fName: " + fName);


            System.out.println("Enter last name:");

            String lName = scnr.nextLine();

            student.setLastName(lName);

            //System.out.println("lName: " + lName);


            System.out.println("Enter Student Id:");

            String studentId = scnr.nextLine();

            student.setStudentId(studentId);

            //System.out.println("studentId: " + studentId);

            students[i] = student;
        }

        //Debug check of content
        System.out.println("You created the following role:");

        System.out.println("classNumber: " + classNumber + " className: " + className + " ");

        System.out.println("classSize: " + classSize);

        //Loop to check entered data is correct
        for(Student stu: students)
        {
            System.out.println(stu.getStudentId() + ": " + stu.getFirstName() + " " + stu.getLastName());
        }
    }

    public Student[] getStudents()
    {
        return students;
    }

    public void setClassName(String className)
    {
        this.className = className;
    }

    public void setClassName()
    {
        System.out.println("Enter name of class: ");

        Scanner scnr = new Scanner(System.in);

        className = scnr.nextLine();
    }

    public String getClassName()
    {
        return className;
    }


    public void setClassNumber(String classNumber)
    {
        this.classNumber = className;
    }

    public void setClassNumber()
    {
        System.out.println("Enter class number: ");

        Scanner scnr = new Scanner(System.in);

        classNumber = scnr.nextLine();
    }

    public String getClassNumber()
    {
        return classNumber;
    }

    public void setClassSize(int classSize)
    {
        this.classSize = classSize;
    }

    public void setClassSize()
    {
        System.out.println("Enter number of student in class: ");

        Scanner scnr = new Scanner(System.in);

        classSize = scnr.nextInt();
    }

    public int getClassSize()
    {
        return classSize;
    }

}
