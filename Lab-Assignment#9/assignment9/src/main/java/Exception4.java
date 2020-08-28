
public class Exception4 {


    public static void main(String[] args) {
       Class1 obj;
       try
       {
           obj = new Class1();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        
}
}
class Class1
{
    public Class1() throws Exception
    {
        throw new Exception();
    }
}