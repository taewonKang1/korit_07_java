package ch00_review.test20251001_2;
// #13

public class LambdaThread {
    public static void main(String[] args) {
        // TODO: "새로운 스레드에서 실행 중..."을 출력하는 Runnable을 람다식으로 작성하시오.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("새로운 스레드에서 실행중 ...");
            }
        };

        // TODO: 위에서 작성한 Runnable을 사용하여 Thread 객체를 생성하고 시작(start)하시오.
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("메인 스레드 종료.");
    }
}