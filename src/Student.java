public class Student
{
    //Declare instance variables

    private String firstName;
    private String lastName;
    private String studentId;


    //Default constructor
    public Student()
    {

    }

    //Instance variable value setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    //Instance variable value getters

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    public String getStudentId()
    {
        return studentId;
    }
}
