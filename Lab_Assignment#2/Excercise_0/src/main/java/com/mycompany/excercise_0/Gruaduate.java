
package com.mycompany.excercise_0;


public class Gruaduate extends Student{
    private String thesisTitle;
    public Gruaduate(int id, String name, double gpa) 
    {
        super(id, name, gpa);
    }
    public void setThesisTitle(String thesisTitle) 
    {
        this.thesisTitle = thesisTitle;
    }
    public String getThesisTitle() 
    {
        return thesisTitle;
    }
    @Override
    public String toString() {
        return super.toString()+"\nThesis Title: "+thesisTitle;
    }    
}
