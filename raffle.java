package randomize;

import java.util.*;
import java.lang.Math;
public class raffle {
 
           public static void main(String[] args) {
                      // TODO Auto-generated method stub
                      
                      //Declarations
                      Scanner input = new Scanner(System.in);//uses "input" as new Scanner
                      String [] countries= {"","","","",""};
                      
                      //Takes 5 destinations from the user and puts them into an array(table)
                      System.out.println("Welcome! Please enter 5 countries you would like to visit");
                      System.out.println("Country #1: ");
                      String loc1= input.next();
                      countries[0]=loc1;
                      System.out.println("Country #2: ");
                      String loc2= input.next();
                      countries[1]=loc2;
                      System.out.println("Country #3: ");
                      String loc3= input.next();
                      countries[2]=loc3;
                      System.out.println("Country #4: ");
                      String loc4= input.next();
                      countries[3]=loc4;
                      System.out.println("Country #5: ");
                      String loc5= input.next();
                      countries[4]=loc5;
                      
                      //Prints out the array of destinations
                      System.out.println("The countries you listed are:");
                      for (int i=0; i<countries.length; i++) {
                                 System.out.print(countries[i]+", ");
                      }
                      System.out.println();
                      
                      
                      //randomly selects 3 destinations from the array
                      //using Math.random(); Parameters are 0-4
                      System.out.println("I think you should visit these 3 places first:");
                      System.out.println();
                      
                      //will filter through array to ensure same number not selected twice
                      int rand=0;//integer to note which random place to pick from array
                      int [] nums= {0,0,0};//creates an array for selected random numbers
                      
                      for (int n=0; n<3; n++) {// will loop 3 times (0,1,2) stop at 3
                                 rand= (int)(Math.random()*4)+1; // randomly picks a number from 0-2 (3 options)
                                 nums[n]=rand;//adds random generated value to array
                                 
                                 if (n==1) {
                                            while (nums[n]==nums[0]) {
                                                       rand= (int)(Math.random()*4)+1;
                                                       nums[n]=rand;
                                            }
                                 }
                                 else if (n==2) {
                                            while (nums[n]==nums[0] || nums[n]==nums[1]) {
                                                       rand= (int)(Math.random()*4)+1;
                                                       nums[n]=rand;
                                            }
                                 }
                                 
                                 System.out.print(nums[n]);
                      }
                      System.out.println();
                      
                      System.out.println("Trip 1: " + countries[nums[0]]);
                      System.out.println("Trip 2: " + countries[nums[1]]);
                      System.out.println("Trip 3: " + countries[nums[2]]);
                      
 
           }//end of main
 
}//end of class
 

