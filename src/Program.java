import java.util.Scanner;

//Test of a text change

public class Program
{
    private static Class[] classes;

    private static int classCount;

    public static void main(String[] args)
    {
        //System.out.println("Program | main() activated.");

        setClassCount();

        initClasses();

        printAllRoles();




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


    public static void printAllRoles()
    {
        //Loop to check the results
        int count = 0;
        for(Class cl: classes)
        {   count++;
            System.out.println(count + ": "+ cl.getClassNumber() + " " + cl.getClassName());
        }
    }

}
