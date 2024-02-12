import java.util.Scanner;

public class Program
{

    private static ClassRole_Model[] classes;
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
        classes = new ClassRole_Model[classCount];

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scnr.next();
        System.out.print("Enter class number: ");
        int classNumber = scnr.nextInt(3); //how many digits max

        for(int i = 0; i < classes.length; ++i)
        {
            classes[i] = new ClassRole_Model(className, classNumber);
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
            System.out.println("Class Name: " + classes[i].className);
            System.out.println("Class Number: " + classes[i].classNumber);
            Student_Model[] students = classes[i].getClasses();
            for(Student_Model student: students)
            {
                System.out.println(student.getFirstName()
                        + " " + student.getLastName()
                        + " " + student.getStudentID());
            }
        }

    }

}
