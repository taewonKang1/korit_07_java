package ch23_lamda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LamdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Java!");
            }
        };

        runnable.run(); // 이상의 방법은 메서드명이 명시되니까 편한데

        Runnable lamdaRunnable = () -> System.out.println("Hello, Java!");
        lamdaRunnable.run();

        // 다른 유형의 함수형 인터페이스 실행 예제
        // 2. Supplier -> call2()
        Supplier<String> stringSupplier = () -> "Hello, Supplier!";
        System.out.println(stringSupplier.get());   // 기존 method 관련 + 람다식 지식 필요
        String message = stringSupplier.get();
        System.out.println(message);

        // 3. Consumer -> call2();
        Consumer<String> stringConsumer = (memo) -> System.out.println("메세지 : " + memo);
        stringConsumer.accept("오늘은 전반적인 수업 내용은 여기서 끝입니다.");
    }
}
