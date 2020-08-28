
public class Exception5 {
    public static void main(String[] args) {       
        try
        {
            method1();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    public static void method1() throws Exception
    {
            try
            {
                method2();
            }
            catch(Exception e)
            {
                throw e;
            }
    }
    public static void method2() throws Exception
    {
        throw new Exception("Exception from Method 2");
    }
}
