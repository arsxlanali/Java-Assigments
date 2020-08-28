
public class Exception1 {
public static void main(String[] args) {
        try
        {
            employAge(-3);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            employSalary(-2);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}
        

    static void employAge(int age) throws  Exception
    {
         if (age<0)
             throw new ExceptionB("This is Exception A");
         else
             System.out.println("Input is right1");
     }
    static void employSalary(int salary) throws  Exception
    {
         if (salary<0)
             throw new ExceptionC("This is Exception B");
         else
             System.out.println("Input is right2");            
     }
        
}

