package week4homework;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        //using scanner
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //using while loop
        while (true){
            System.out.println("Enter number: ");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                min = Math.min(min,number);
                max = Math.max(max,number);
            }
            else{
                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("Minimum number entered: "+min);//print minimum number
        System.out.println("Maximum number entered: "+max);//print maximum number
        //scanner close
        scanner.close();
    }

}
