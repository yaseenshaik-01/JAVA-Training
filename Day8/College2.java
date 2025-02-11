public class College2 
{
    public static void main(String[] args) 
    {
        College clg = new College();
        // clg.studying();
        // studying() is not public in College; cannot be accessed from outside package
        clg.recruit();

        // clg.write();
        // write() has protected access in College

        clg.semesterpaper();
    }

    void display() 
    {
        System.out.println("welcome to college 2");
    }
}

class College {
    public void recruit() 
    {
        System.out.println("Recruiting students");
    }

    public void semesterpaper() 
    {
        System.out.println("Semester paper submission");
    }
}