package ch23_lamda;

public class CalculatorMain {

    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (int x, int y) -> x + y;
        Calculator sub = (int x, int y) -> x - y;
        Calculator mul = (int x, int y) -> x * y;
        Calculator div = (int x, int y) -> x / y;

        System.out.println(add.calculate(2, 3));
        System.out.println(sub.calculate(2, 3));
        System.out.println("--- static method 호출 방식 결과 ---");
        System.out.println("2 + 3 = " + operate(2, 3, add));
        System.out.println("2 + 3 = " + operate(2, 3, mul ));
    }
}
