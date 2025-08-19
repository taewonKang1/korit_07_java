package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Factory {
    private static Factory instance = new Factory();
    private String name;

    private Factory() {
        this.name = "Factory";
    }

    public static Factory getInstance() {
        return instance;
    }
}
