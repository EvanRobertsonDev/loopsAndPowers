/*
 * Evan Robertson
 * October 19th 2018
 * Program that can calculate the power of any number
 */

package loopsandpowers;

import java.util.Scanner;
/**
 *
 * @author evrob0095
 */
public class LoopsAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Strings and Variables
        String userInput;
        int power;
        int num;
        int answer;
        
        Scanner input = new Scanner(System.in);
        
        //Write options out
        System.out.println("------------------");
        System.out.println("Enter your choice");
        System.out.println("1... Find the value of a number squared");
        System.out.println("2... Find the value of a number cubed");
        System.out.println("3... Find the value of a number to the power of another number");
        System.out.println("4... Exit");
        System.out.println("------------------");
        //Get input form user
        userInput = input.nextLine();
        
        //Switch statement to determine which option was chosen
        switch (userInput) {
            case "1":
                //Get input from user
                answer = 1;
                System.out.println("Input a number");
                num = Integer.parseInt(input.nextLine());
                
                //Loop to get input and multiply it by exponent
                for (int i = 1; i <= 2; i++) {
                answer = answer*num;
                }
                
                //Write answer
                System.out.println("The answer is " + answer);
                break;
                
            case "2":
                //Get input from user
                answer = 1;
                System.out.println("Input a number");
                num = Integer.parseInt(input.nextLine());
                
                //Loop to get input and multiply it by exponent
                for (int i = 1; i <= 3; i++) {
                answer = answer*num;
                }
                
                //Write answer
                System.out.println("The answer is " + answer);
                break;
                
            case "3":
                //Get input from user
                answer = 1;
                System.out.println("Input a number");
                num = Integer.parseInt(input.nextLine());
                
                //Get exponent from user
                System.out.println("Input a power");
                power = Integer.parseInt(input.nextLine());
                
                //Loop to get input and multiply it by exponent
                for (int i = 1; i <= power; i++) {
                answer = answer*num;
                }
                
                //Write answer
                System.out.println(answer);
                break;
            default:
                //Close program
                System.exit(1);
                break;
        }
    }
    
}
