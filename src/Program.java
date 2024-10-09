import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


//Test of a text change

public class Program
{
    private static Class[] classes;

    private static int classCount;

    public static void main(String[] args) throws Exception
    {
        //System.out.println("Program | main() activated.");

        setClassCount();

        initClasses();

        printAllRoles();

        saveClasses();



        //Instantiation of a class using the alternative constructor.
        //Class cl2 = new Class("PHYS 101", "Intro to Physics", 21);
    }


    public static void setClassCount()
    {
        System.out.println("How many classes?");

        Scanner scnr = new Scanner(System.in);

        Program.classCount = scnr.nextInt();
    }

    public static void setClassCount(int classCount)
    {
        Program.classCount = classCount;
    }


    public static void initClasses()
    {
        classes = new Class[classCount];

        for(int i = 0; i < classes.length; ++i)
        {
            //Instantiation of the highest order containing object
            Class cl = new Class();

            classes[i] = cl;

        }
    }


    public static void saveClasses() throws IOException
    {
        for(int i = 0; i < classes.length; ++i) {

            String filepath = "output/" + classes[i].getClassNumber() + "_role.txt";

            try {

                FileOutputStream fileout = new FileOutputStream(filepath);

                PrintWriter pw = new PrintWriter(fileout);

                pw.println(classes[i].getClassNumber() + ", " + classes[i].getClassName());

                pw.println("StudentFirstName" + ", " + "StudentLastName" + ", " + "StudentID");

                for(Student stu: classes[i].getStudents())
                {
                    pw.println(stu.getFirstName() + ", " + stu.getLastName() + ", " + stu.getStudentId());
                }

                pw.close();

            } catch (IOException excpt) {

                System.out.println("ERROR: " + excpt.getMessage());

            }

        }

    }


    public static void printAllRoles()
    {
        //Loop to check the results
        int classCount = 0;
        for(Class cl: classes)
        {   classCount++;
            System.out.println(classCount + ": "+ cl.getClassNumber() + " " + cl.getClassName());

            int studentCount = 0;
            for(Student stu: cl.getStudents())
            {
                studentCount++;
                System.out.println(stu.getStudentId() + " " +studentCount + " " + stu.getFirstName() + " " + stu.getLastName() );

            }

        }
    }

}
