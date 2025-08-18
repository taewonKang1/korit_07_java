package ch23_lamda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        System.out.println(fruits);

        for(int i = 0; i < fruits.size(); i++) {
            System.out.println("과일명 : " + fruits.get(i));
        }
        System.out.println();

        for(String fruit : fruits) {
            System.out.println("과일명 : " + fruit);
        }
        System.out.println();

        // 람다식 적용
        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println((number*2) + ' '));

        // 지금까지 List 등의 Collection에서 element들을 추출하여 데이터를 가공한다고
        // 가정했을 때 필수적으로 list 내부를 돌아다니는 반복문만 작성해야 했습니다.

        // 하지만 forEach() 로 람다식을 작성하여 읽을 수 있다면 가독성있게 가공 가능

        // 람다식은 Js spring 에서도 많이 사용됨.
    }
}
