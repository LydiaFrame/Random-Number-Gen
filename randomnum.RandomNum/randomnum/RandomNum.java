/*
 * Program: RandomNum.java
 * Programmer: Lydia Frame 
 * Purpose: Generate two random numbers from 1 to 100. 
 *          Arange the numbers from greatest to leaste
 *          Have the program add, subtract, multiply, and divide the numbers.
 *          Display the results of all the calculations. 
 */
package randomnum; 
 import java.util.Scanner; 
 
 public class RandomNum{
 
     public static void main(String[] args){
         //Declair Variables 
         int num1 = (int)((System.currentTimeMillis() % 100)+1);
         int num2 = (int)((System.currentTimeMillis() / 100 % 100)+1);
         int greatest;
         int least;

         // Create a Scanner 
         Scanner input = new Scanner(System.in); 

         //Arrange the numbers from greatest to least 
         if (num1 > num2){
             greatest = num1; 
             least = num2; 
         }
 
         else {
             greatest = num2;
             least = num1;
         }

        //Output numbers in order
        System.out.println("Your random numbers are " + greatest + " and " + least); 

        //Preform opperations
        int sum = greatest + least; 
        int subtract = greatest - least;
        int multiply = greatest * least; 
        double divide = (double)greatest / least;

        //Outpute Calculations 
        System.out.println(greatest + " + " + least + " = " + sum);
        System.out.println(greatest + " - " + least + " = " + subtract);
        System.out.println(greatest + " x " + least + " = " + multiply);
        System.out.println(greatest + " / " + least + " = " + divide); 

     }
 }