package ch00_review.test20251001_2;
// #14

class Calculator {
    // TODO: 두 개의 int를 더하는 add 메서드를 작성하시오.
    public int add(int a, int b) {
        return a + b;
    }

    // TODO: 두 개의 double을 더하는 add 메서드를 작성하시오.
    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // TODO: 5와 10을 더한 결과를 "정수 덧셈 결과: [결과]" 형식으로 출력하시오.
        System.out.println("정수 덧셈 결과: " + calc.add(5, 10));


        // TODO: 3.5와 2.5를 더한 결과를 "실수 덧셈 결과: [결과]" 형식으로 출력하시오.
        System.out.println("실수 덧셈 결과: " + calc.add(3.5, 2.5));

    }
}
