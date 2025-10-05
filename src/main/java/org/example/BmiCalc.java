package org.example;

import java.util.Scanner;

public class BmiCalc {
    public void calcBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height) * 10000;
        String bmiStatus = "";

        if (bmi >= 30) {
            bmiStatus = "고도비만";
        } else if (bmi >= 25) {
            bmiStatus = "비만";
        } else if (bmi >= 23) {
            bmiStatus = "과체중";
        } else if (bmi >= 18.5) {
            bmiStatus = "정상";
        } else {
            bmiStatus = "저체중";
        }

        System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 " + bmiStatus + "입니다.");
    }

    public void calcBmi(String name, double height, double weight) {
        double bmi = weight / (height * height) * 10000;
        String bmiStatus = "";

        if (bmi >= 30) {
            bmiStatus = "고도비만";
        } else if (bmi >= 25) {
            bmiStatus = "비만";
        } else if (bmi >= 23) {
            bmiStatus = "과체중";
        } else if (bmi >= 18.5) {
            bmiStatus = "정상";
        } else {
            bmiStatus = "저체중";
        }
        System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 " + bmiStatus + "입니다.");
    }

    public static void calcBmi(Person person) {
        double bmi = person.getWeight() / (person.getHeight() * person.getHeight()) * 10000;
        String bmiStatus = "";

        if (bmi >= 30) {
            bmiStatus = "고도비만";
        } else if (bmi >= 25) {
            bmiStatus = "비만";
        } else if (bmi >= 23) {
            bmiStatus = "과체중";
        } else if (bmi >= 18.5) {
            bmiStatus = "정상";
        } else {
            bmiStatus = "저체중";
        }

        System.out.println(person.getName() + "님의 BMI 지수는 " + bmi + "으로 " + bmiStatus + "입니다.");
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height = scanner.nextDouble();
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight = scanner.nextDouble();
//
//        double bmi = weight / (height * height) * 10000;
//        String bmiStatus = "";
//
//        if (bmi >= 30) {
//            bmiStatus = "고도비만";
//        } else if (bmi >= 25) {
//            bmiStatus = "비만";
//        } else if (bmi >= 23) {
//            bmiStatus = "과체중";
//        } else if (bmi >= 18.5) {
//            bmiStatus = "정상";
//        } else {
//            bmiStatus = "저체중";
//        }
//
//        System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 " + bmiStatus + "입니다.");
        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.calcBmi("김이", 174, 64);

        Person person1 = Person.builder()
                .name("강태원")
                .height(174)
                .weight(74)
                .build();

        calcBmi(person1);
    }
}
