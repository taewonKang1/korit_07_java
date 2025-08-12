package ch18_static.builders;

import lombok.Builder;

@Builder
public class PersonLombok {
    private String name;
    private int age;
    private String address;

}
