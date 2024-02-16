package Model;

import Controller.Enrollment;


public class Class
{
    //INSTANCE VARIABLES
    String className;
    int classNumber;
    Model.Student[] students;


    //CONSTRUCTOR
    public Class(String className, int classNumber)
    {
        this.className = className;
        this.classNumber = classNumber;
        students = Enrollment.enterStudentData();

    }

    //USER DEFINED METHODS
    //GETTERS AND SETTERS
    public Student[] getClasses()
    {
        return students;
    }

    public String getClassName()
    {
        return className;
    }
    public int getClassNumber()
    {
        return classNumber;
    }
}
