package ch06_condition;

import java.util.Scanner;

/*
    고민해봐야 할 사항
    Condition05의 코드는
    100초과 / 0미만의 점수가 입력됐을 때 각각 A / F라는 결과값이 나오게 됩니다.
    애초에 잘못된 점수를 입력했을 때 불가능 한 점수 입력이라고 안내를 하려면 어떻게 할 수 있을 까요?
    100 초과 / 0 미만의 경우 grade를 x라고 하겠습니다.
 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >> ");
        int score = scanner.nextInt();
        String grade = "";

        final int GRADE_A = 90;
        final int GRADE_B = 80;
        final int GRADE_C = 70;
        final int GRADE_D = 60;
        final int GRADE_F = 59;
        final int GRADE_MAX = 100;
        final int GRADE_MIN = 0;

        // 비효율적이지만 일단 작동하는 코드 예시
//        if (score >= GRADE_A && score <= GRADE_MAX) {
//            grade = "A";
//        } else if (score >= GRADE_B && score <= GRADE_A) {
//            grade = "B";
//        } else if (score >= GRADE_C && score <= GRADE_B) {
//            grade = "C";
//        } else if (score >= GRADE_D && score <= GRADE_C) {
//            grade = "D";
//        } else if (score >= GRADE_MIN && score <= GRADE_F) {
//            grade = "F";
//        } else {
//            grade = "X";
//        }
        if (score > 100 || score < 0) { // 얘가 false라면 score는 0점 이상이면서 100 이하
            grade = "X";
        } else if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}
