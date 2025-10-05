package ch07_loops;
/*
    중첩 while문(Nested - while)
    while(조건식1) {
        반복실행문1-a
        while(조건식2) {
            반복실행문2
        }
        반복실행문1-b
    }
 */
public class Loop03 {
    public static void main(String[] args) {
//        int day = 1;
//        // 1일차 1교시입니다. ~ 1일차 3교시입니다.
//        // 2일차 1교시입니다. ...
//        // 5일차 1교시입니다. ~ 5일차 3교시입니다.
//
//        while (day < 6) {
//            int time = 1;   // 반복실행문 1-a에 해당합니다. 변수의 선언 및 초기화입니다.
//            while (time < 4) {
//                System.out.print(day+"일차"+time+"교시입니다. "); // 반복실행문2
//                time++;
//            }
//            System.out.println();
//            day++; // 반복실행문 1-b
//        }
        // scope(범위)라는 것으로, 전역(전체영역) / 지역으로 나뉜다는 점이 중요합니다

        /*
            이상의 코드를 활용하여
            2 x 1 = 2
            2 x 2 = 4
            ...
            9 x 9 = 81
            를 출력하시오.
         */
        int dan = 2;
        while (dan < 10) {
            int i = 1;
            while (i < 10) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
                i++;
            }
            dan++;
        }
    }
}
