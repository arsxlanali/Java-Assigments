
package com.mycompany.labassignemnt11;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

public static ArrayList<Object> getObjects() throws FileNotFoundException, IOException, ClassNotFoundException{

    ArrayList<Object> objects = new ArrayList<Object>(); 
    FileInputStream fis = new FileInputStream("myObjects.ser");
    ObjectInputStream ois = new ObjectInputStream(fis);

    Employee obj =null;

    boolean isExist = true;

    while(isExist){
        if(fis.available() != 0){
         obj = (Employee) ois.readObject();    
         objects.add(obj);
        }
        else{
        isExist =false;
        }
    }
    return objects;     
}    
        
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        System.out.println("1- Add Employee Data to File");
        System.out.println("2- Search Employee");
        System.out.println("3- Exit");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1: 
                {
                    try
                    {
                        File myObj = new File("myObjects.txt");
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
                    }       System.out.print("Enter the Name: ");
                    String name = input.next();
                    System.out.print("\nEnter the ID: ");
                    String id = input.next();
                    System.out.print("\nEnter the Income: ");
                    float income = input.nextFloat();
                    int i=Integer.parseInt(id);
                    Employee e1 = new Employee(name, i, income);
                    FileOutputStream f = new FileOutputStream("myObjects.ser");
                    ObjectOutputStream o = new ObjectOutputStream(f);
                    o.writeObject(e1);
                    o.close();                   
                    f.close();
                    break;
                }
            case 2:
                {
                    ArrayList<Object> objects = getObjects();
                    System.out.print(objects);
                    System.out.print("Enter the Name: ");
                    String name = input.next();
                    Object a = name;
                    System.out.print("\nEnter the ID: ");
                    String id = input.next();
                    Object b = id;
                    for (Object o: objects )
                    {
                        if (o.equals(a) || o.equals(b))
                        {
                            System.out.print(o);
                            break;
                        }
                    }

                }
            default:
                System.exit(0);
        }
    }    
}
