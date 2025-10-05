package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 50점 이하라면 grade는 F

            실행 예
            점수를 입력하세요 >> 68
            당신의 점수는 68점이고, 학점은 D입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >> ");
        int score = scanner.nextInt();
        String grade = "";

        final int GRADE_A = 90;
        final int GRADE_B = 80;
        final int GRADE_C = 70;
        final int GRADE_D = 60;
        final int GRADE_F = 59;

        if (score >= GRADE_A && score <= 100) {
            grade = "A";
        } else if (score >= GRADE_B && score <= GRADE_A) {
            grade = "B";
        } else if (score >= GRADE_C && score <= GRADE_B) {
            grade = "C";
        } else if (score >= GRADE_D && score <= GRADE_C) {
            grade = "D";
        } else if (score <= GRADE_F) {
            grade = "F";
        } else {
            System.out.println("올바른 점수를 넣으세요.");
        }
        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}
