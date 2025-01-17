package week4homework;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */
public class Programme_6_TriangleWithNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int rows = scanner.nextInt();
        //using for loop
        for(int i =1; i <=10; i++ ){
            int num = 1;
            for(int j =1; j<=i; j++){
                System.out.print(j);
                num++;
            }
            System.out.println();
        }
        scanner.close();//scanner closing
    }
}
