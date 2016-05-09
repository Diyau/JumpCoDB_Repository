
/**
 * Write a description of class testArrays here.
 * 
 * @author (Tshepo Motaung) 
 * @version (a version number or a date)
 */
//import statements
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;
//declearation of a class.
public class testJumpCo_DB extends GregorianCalendar//here i extends class testJumCo_DB to class GregorianCalendar to get time
{
    public static void main(String [] args) throws IOException//used static word to main method
    {
        System.out.print("\f");
        JumpCoD_B [] arrLearners = new JumpCoD_B[50];//create a new JumpCoD_B object called arrLearners
        int count = 0;
        Scanner sc = new Scanner (new FileReader("Learners.txt")); //create a object called sc in FileReader that will be used to access text.file
        Scanner input = new Scanner(System.in); //create a new Scanner object called input

        while(sc.hasNextLine())//check wether input from Scanner has nextLine
        {//start -while
            
            String line = sc.nextLine();//declearing variable line 
            String [] arrInfo = line.split("#");//declearing arrInfo which will split names before # or after
            String name = arrInfo[0];//declearing string name into position 0
            int year = Integer.parseInt(arrInfo[1]);//declearing year into position 1
            String branch = arrInfo[2];//declearing branch into position 2
            arrLearners[count] = new JumpCoD_B(name, year, branch);//creating a new JumpCoD_B object called arrLearners[count]
            
            count++;
            
        }//end-while loop
        sc.close();//close statement
 
        testJumpCo_DB cal = new testJumpCo_DB(); // create a new testJumCo_DB object
        System.out.println("" + cal.getTime());//SOP to print time, with method getTime()
        int choice;//declaration of choice with primitive type int
        
        do//do-loop
        {//start of do-while loop
            System.out.println(" Menu");
            System.out.println(" ========================================");
            System.out.println(" 1. Display younger Learners");
            System.out.println(" 2. Display older Learners");
            System.out.println(" 3. Select Branch");
            System.out.println(" 4. Quit");
            System.out.println(" ");
            System.out.println(" Your choice? ");
            choice = input.nextInt();
            System.out.println(" ========================================");
            switch (choice)//choice is a condition of switch statment
            {//start of switch statemnt

                case 1:  //System.out.println("Name " + "\t\t" + "Age");
                for (int k= 0; k< count; k++)
                {//start of for-loop
                    int age = arrLearners[k].calcAge();//statement which get and passes values into calcAge() method
                     
                    if (age < 26 )//if age <26 print the following
                    {//start of if
                        
                        System.out.println((arrLearners[k].getName()+"\t\t"+ age));//SOP to print names and age of younger Learners
                        
                    }//end of - if-statemt
                }//end of for-loop
                break;//break statement

                case 2:
                for (int k= 0; k< count; k++)
                {//start of for-loop
                    int age = arrLearners[k].calcAge();//statement which get and passes values into calcAge() method
                    
                    if (age >= 26 )//if age >26 print the following
                    {//start of if
                     
                        System.out.println((arrLearners[k].getName()+"\t\t"+ age));//SOP to print names and age of older Learners
                        
                    }//end of - if-statemt
                }//end of for-loop
                break;//break statment

                case 3: 
                System.out.print("Enter the name of the Branch (Ennerdale/CapeTown/Johannesburg ) :"+ "\t");//SOP to promt user for branch
                String branch = input.next();

                PrintWriter out = new PrintWriter( new FileWriter("Branch.txt"));//create new out object to PrintWriter, in a file called .txt
                System.out.println("");//SOP for space
                System.out.println("Learners from " + branch);//SOP to show learners of certain branch

                System.out.print("Name \t\t"+ "Year\t\t" + "Branch");//SOP for formatting
                System.out.println();

                for(int k = 0; k < count; k++ )//for loop to check lines in a file
                {//start of for-loop
                    if (branch.equalsIgnoreCase(arrLearners[k].getBranch()))//if-statement to print output after the user has entered the branch
                    {//start of if
                        
                        System.out.println(arrLearners[k].toString());//SOP heading structure using toString() method
                        out.println(arrLearners[k].getName());//SOP for names
                        
                    }//end of - if-statemt
                }//end of for-loop
                 out.close();//SOP to close Text File
                
                if(branch.equalsIgnoreCase("Ennerdale"))
                {//start of if
                    
                    System.out.println("Learners facilitator is : Mr V. Walters");
                    
                }//end of - if-statemt
                if(branch.equalsIgnoreCase("CapeTown"))
                {//start of if
                    
                    System.out.println("Learners facilitator is : Ms T. Thulisile");
                    
                }//end of - if-statemt
                if(branch.equalsIgnoreCase("Johannesburg"))
                {//start of if
                    
                    System.out.println("Learners facilitator is : Ms K. Ramaphosa");
                    
                }//end of - if-statemt
               
                break;//break statement

            }//end-of-switch statemnt
        }
        while (choice < 4);//end-of-while loop

        JOptionPane.showMessageDialog(null, "Goodbye, Thanks for taking time to check our database. \nCreated by Mr.T Motaung");//SOP for sign-out message
        System.exit(0);//statement to terminated the system after the user is done

    }
}
