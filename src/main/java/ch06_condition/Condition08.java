package ch06_condition;

import java.util.Scanner;

/*
    과제 :
    윤년 계산기 작성
    윤년(leap year)은 특정 조건을 만족하는 년을 의미합니다.

    윤년을 판단하는 규칙은
    1. 연도가 4로 나누어 떨어지는 해는 윤년에 해당할 '수도 있음' (year % 4 == 0)
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님. !(year % 100 == 0)
    3. 그런데 100으로 나누어떨어지기는 하는데 400으로도 나누어 떨어지면 윤년에 해당함.
    (year % 100 == 0)&&(year % 400 == 0)

    예을들어
    2020년은 4로 나누어 떨어지기 때문에 윤년(100으로는 안나누어지니까요)
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다(400으로도 안나누어집니다)
    2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당함.

    이상의 조건을 만족하는 윤년 계산기를 작성하고,
    Scanner를 import
    year 변수에 값을 대입했을 때
    윤년인지 아닌지를 판별할 수 있도록 하시오.
 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        System.out.print("년을 입력하세요 >>> ");
        year = scanner.nextInt();
        String leapYear = "";

        if ((year % 4 == 0) && !(year % 100 == 0)) {
            leapYear = "윤년";
        } else if (year % 400 == 0) {
            leapYear = "윤년";
        } else {
            leapYear = "윤년이 아님";
        }

        if (year % 4 == 0) {
            if(year % 400 == 0) {
                leapYear = "윤년";
            } else if (!(year % 100 == 0)) {
                leapYear = "윤년";
            } else {
                leapYear = "윤년이 아님";
            }
        } else {
            leapYear = "윤년이 아님";
        }

        System.out.println(year + "년은 " + leapYear);
    }
}
