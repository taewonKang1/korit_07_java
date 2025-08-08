package ch12_arrays;

import java.util.Scanner;

/*

 */
public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int human = 0;
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        human = scanner.nextInt();
        scanner.nextLine();

        String[] humans = new String[human];
        double[] scores = new double[human];
        double sum = 0;
        for (int i = 0; i < human; i++) {
            System.out.print((i+1) + "번 학생의 이름을 등록하세요 >>>");
            humans[i] = scanner.nextLine();
            System.out.print(humans[i] + "번 학생의 점수를 입력하세요 >>>");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();
            sum += scores[i];
        }
        System.out.println();

        for (int i = 0; i < human; i++) {
            System.out.print(humans[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < human; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println("\n");

        System.out.println("학생들의 점수 총합은 " + sum + "점입니다.");
    }
}
