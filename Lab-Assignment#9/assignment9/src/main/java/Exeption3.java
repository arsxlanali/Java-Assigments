
import java.io.IOException;
public class Exeption3 {

    public static void main(String[] args) {
       
        try
        {
            throw new IOException();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        catch(IOException e1)
        {
           e1.printStackTrace();
        }        
}
}