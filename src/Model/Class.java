package Model;

import Controller.Enrollment;


public class Class
{
    String className;
    int classNumber;
    Model.Student[] students;


    public Class(String className, int classNumber)
    {
        this.className = className;
        this.classNumber = classNumber;
        students = Enrollment.enterStudentData();

    }

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
