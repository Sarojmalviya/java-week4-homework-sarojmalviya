package week4homework;

/**
 * . Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Programme_8_RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
