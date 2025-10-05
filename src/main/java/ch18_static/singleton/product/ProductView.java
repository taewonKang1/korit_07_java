package ch18_static.singleton.product;

public class ProductView {
    // 정적 변수 선언
    // 보통 싱글톤 패턴 만들 때 정적 변수 이름이 instance
    private static ProductView instance;    // ProductView 클래스의 정적 field인 instance

    // private으로 생성자를 선언 -> 객체가 하나만 생성되는걸 보장하기 위한 접근지정자이므로 매우 중요
    private ProductView() {
        int counter = 1;        // 이건 객체 생성될 때 만들어지는 지역 변수
        System.out.println(counter + "번 째 객체가 생성되었습니다.");
        counter++;              // 얘는 위에 정적 변수입니다, 코드상에서 차이 확인
    }

    // static 메서드  정의 -> 대부분의 경우getInstance()
    public static ProductView getInstance() {
        if(instance == null) {              // 현재 인스턴스가 없는 시점이라면 22번 코드라인이 true 이므로
            instance = new ProductView();   // ProductView() 생성자를 호출하여 instance에 대입함.
        }
        return instance;                    // 이미 생성되어있으면 바로 실행
    }
}
