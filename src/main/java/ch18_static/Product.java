package ch18_static;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    // 필드 선언
    private String name;
    private static int count = 0;

}
