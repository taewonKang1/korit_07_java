package ch07_loops;
/*
    1 2 3 4 .... 10
    11 12 13 ..
    ...
    91 .... 100
 */
public class Loop02 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.print(i + " ");
            if (i % 10 == 0){
                System.out.println();
            }
        }

        System.out.println();

        int j = 0;
        int k = 0;
        while (j < 10) {
            while (k < 10) {
                k++;
                System.out.print(j * 10 + k + " ");
            }
            System.out.println();
            j++;
            k = 0;
        }

        System.out.println();

        int l = 1;
        while (l < 101) {
            System.out.println(l + " " + (l+1) + " " + (l+2) + " " + (l+3) + " " + (l+4) + " " + (l+5) + " " + (l+6) + " " + (l+7) + " " + (l+8) + " " + (l+9));
            l += 10;
        }

    }
}
