package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class Company {
    private int companyId;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}

public class Test1 {
    public static void main(String[] args) {
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Company company1 = new Company(
                100,
                "Apple",
                "Apple Computer Inc. 1 infinite Loop",
                "Cupertino",
                "CA",
                "95014"
        );
        String jsonCompany1 = gsonBuilder.toJson(company1);
        System.out.println(jsonCompany1);

    }
}
