import java.util.Scanner;

public class v15 {    //printing stars
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter column");
        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <n-i; j++){
//                System.out.print("  ");
//            }
//            for (int k = 0; k <=i ; k++){
//                System.out.print("* ");
//            // for(k=0;k<2*i-1;k++) {       //centre pyramid
//            // System.out.println("*");
//            }
//            System.out.println();
//            }

        //hallow pyramid
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//            if (i == 0) {
//                System.out.print("*");
//            } else if (i == n-1) {
//                for (int k = 0; k < n ; k++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("*");           //left edge
//                for (int sp = 0; sp < 2 * i - 1; sp++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");            // right edge
//            }
//            System.out.println();

                 // or (not using if-else)

//            for (int j = 0; j < 2 * i + 1; j++) {
//                if (j == 0 || j == 2 * i || i == n - 1) {
//                    System.out.print("*"); // borders and last row
//                } else {
//                    System.out.print(" "); // inside hollow space
//                }
//            }
//
//            System.out.println();
//        }

           // inverted hallow
        for (int i = 0; i < n; i++) { // rows
            // leading spaces for mirror
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // pattern printing with spaces between stars
            for (int j = 0; j < n - i; j++) {
                if (i == 0 || j == 0 || j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // extra space after each column for spacing look
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}



