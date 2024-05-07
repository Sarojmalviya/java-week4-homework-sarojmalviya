package week4homework;

/**
 * Write a program in Java to display the pattern like a diamond.
 *  While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */
public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        int n = 7;//Numbers of rows
        int i = 1;
        //increase diamond shape
        while(i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        //decrease diamond shape
            i = n - 1;
            while (i >= 1){
                int j = 1;
                while (j <= n - i){
                    System.out.print(" ");
                    j++;
                }
                j = 1;
                while (j <= 2 * i -1){
                    System.out.print("*");
                    j++;
            }
                System.out.println();
                i--;
        }
    }
}
