
/**
 * Write a description of class Student here.
 * 
 * @author (Tshepo Motaung) 
 * @version (a version number or a date)
 */
//declearation of a class.
public class JumpCoD_B
{
    //primitive data types and Encapsulation of variables
    private String name;
    private int year;
    private String branch;
    //Overloaded constructor with parametors
    public JumpCoD_B(String name, int year, String branch)//Use of access modifiers,
    {
        
        this.name = name;
        this.year = year;
        this.branch = branch;
        
    }
    //Overloaeded method to calculate age and return age
    public int calcAge(int currentYear)//Use of access modifiers,
    {
        
        int age = currentYear - year;
        return age;//return age
        
    }
    
    //getName method and return name
    public String getName()//Use of access modifiers,
    {
        return name;
    }
    //getYear method and return year
    public int getYear()//Use of access modifiers,
    {
        return year;
    }
    //getBranch method and return branch
    public String getBranch()//Use of access modifiers,
    {
        return branch;
    }
    
    //below is a toString method used to format the structure of the output or heading
    public String toString()
    {
        
        String objectString = "";
        objectString = objectString + String.format("%-18s%-10d%-18s", name, year, branch);
        return objectString;
        
    }

}
