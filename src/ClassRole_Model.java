import java.util.Scanner;


public class ClassRole_Model
{
    String className;
    int classNumber;
    Student_Model[] students;


    public ClassRole_Model(String className, int classNumber)
    {
        this.className = className;
        this.classNumber = classNumber;
        students = Enrollment_Control.enterStudentData();

    }

    public Student_Model[] getClasses()
    {
        return students;
    }

}
