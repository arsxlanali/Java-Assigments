
package com.mycompany.labassignemnt11;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class FileTraverser 
{
    
    public static String reverse(String str)
    {
        if (str == null || str.equals(""))
            return str;
        List<Character> list = new ArrayList<Character>();
        for (char c : str.toCharArray())
            list.add(c);
        Collections.reverse(list);
        StringBuilder builder = new StringBuilder(list.size());
        
        for (Character c : list)
            builder.append(c);
        return builder.toString();
    }

    public static void main(String[] args) throws IOException 
    {
        try 
        {
            File myObj = new File("helloworld.txt");
            if (myObj.createNewFile()) 
            {
                System.out.println("File created: " + myObj.getName());
            } else 
            {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
                System.out.println("An error occurred.");
                e.printStackTrace();
        }
        String content = new String ( Files.readAllBytes( Paths.get("helloworld.txt") ) );      
        List<String> myList = new ArrayList<String>(Arrays.asList(content.split("")));
        Collections.reverse(myList);
        System.out.print(myList);
        File file =new File("helloworld.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        String listString = String.join("", myList);
        bw.write(listString);
        bw.close();
    }
    
}
