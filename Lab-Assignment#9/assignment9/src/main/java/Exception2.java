
import java.io.IOException;



public class Exception2 {

    public static void main(String[] args) 
    {
        try
        {
            throw new ExceptionA("Exception from Exception A");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            throw new ExceptionB("Exception from Exception B");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            throw new NullPointerException("Null Pointer Exception: ");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            throw new IOException();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

class ExceptionA extends Exception
{
    public ExceptionA(String msg)
    {
        super(msg);
    }
}
class ExceptionB extends ExceptionA
{
    public ExceptionB(String msg)
    {
        super(msg);
    }
}
class ExceptionC extends ExceptionB
{
    public ExceptionC(String msg)
    {
        super(msg);
    }
}