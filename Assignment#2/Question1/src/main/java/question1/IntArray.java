
package question1;


public class IntArray 
{
    private final int array[];
    public IntArray(int[] array) 
    {
        this.array = array;
    }
    public void showData()
    {
        for (int i=0 ; i<5 ; i++)
        {
            if (array[i]==0)
                continue;
            System.out.print(array[i]+",");
        }
    }
    public void delData(int index)
    {
        int i;
        for (i = index; i<4 ;i++)
        {
            array[i] = array[i+1];
        }
        array[i] = 0;
    }
   
}
