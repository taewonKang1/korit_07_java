package ch07_loops;
/*
         *
        **
       ***
      ****
     *****
 */
public class Loop08 {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 6; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
