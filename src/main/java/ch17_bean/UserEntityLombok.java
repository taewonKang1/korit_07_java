package ch17_bean;

import lombok.Data;
import lombok.Setter;

@Data
public class UserEntityLombok {
    // 여기에 달면  field level
    private int username;

    @Setter
    private int password;

    private String email;
    private String name;
}
