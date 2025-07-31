package ch07_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다.
    for (int i = 0; i < 100; i++) {
        반복실행문1-a
        for(int j = 0; j < 100; j++) {
            반복실행문2
        }
        반복실행문1-b
    }
    for문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력하시오.
 */
public class Loop05 {
    public static void main(String[] args) {
//        for(int day = 1; day < 6; day++) {
//            for(int lesson = 1; lesson < 4; lesson++) {
//                System.out.println(day + "일차 " + lesson + "교시입니다.");
//            }
//        }
//
//        for(int dan = 1; dan < 10; dan++) {
//            for(int i = 1; i < 10; i++) {
//                System.out.println(dan + " x " + i + " = " + (dan * i));
//            }

        /*
            1 2 3 4 5 ... 10
            11...20
            91...100
         */

        for(int i = 1; i < 101; i+=10) {
            for(int j = 0; j < 10; j++) {
                System.out.print(i+j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        for(int i = 1; i < 101; i+=10){
            System.out.println(i + " " + (i+1) + " " + (i+2) + " " + (i+3) + " " + (i+4) + " " + (i+5) + " " + (i+6) + " " + (i+7) + " " + (i+8) + " " + (i+9));
        }

        /*
            숫자를 입력 받아서 n까지 더하는 반복문을 for문으로 작성하시오.
            실행 예
            1부터 몇까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < num+1; i++) {
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다");

        System.out.print("1부터 몇까지의 짝수의 합을 더하시겠습니까? >>> ");
        int n = scanner.nextInt();
        int sum2 = 0;
        int sum3 = 0;
        for(int i = 1; i < n+1; i++) {
            if(i % 2 == 0) {
                sum2 += i;
            } else {
                sum3 += i;
            }
        }
        System.out.println("1부터 " + n + "까지의 숫자 중 짝수의 합은 " + sum2 + "입니다.");
        System.out.println("1부터 " + n + "까지의 숫자 중 홀수의 합은 " + sum3 + "입니다.");

    }
}
