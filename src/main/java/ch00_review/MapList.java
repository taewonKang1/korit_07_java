package ch00_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {

    public static void main(String[] args) {
        // 처음 Generic이 도입되었을 때는 선언헀을 때, 생성자 호출했을 대 둘 다 자료형을
        // 명시 했어야하나 업데이트 되면서 선언하는 부분만 적어주면 됩니다.
        List<Map<String, Object>> customers = new ArrayList<>();

        Map<String, Object> customer1 = new HashMap<>();
        customer1.put("name", "홍길동");
        customer1.put("rating", "vip");
        customer1.put("age", 30);
        customers.add(customer1);

        Map<String, Object> customer2 = new HashMap<>();
        customer2.put("name", "김기영");
        customer2.put("rating", "gold");
        customer2.put("age", 35);
        customers.add(customer2);

        for(Map<String, Object> customer : customers) {
            for(Map.Entry<String, Object> customerInfo : customer.entrySet() ) {
                System.out.println(customerInfo);
            }
        }
    }
}
