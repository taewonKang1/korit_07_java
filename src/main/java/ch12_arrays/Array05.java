package ch12_arrays;
/*
    메서드를 정의해도 되고 main에 바로하셔도 상관없습니다.
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오.
 */
public class Array05 {
    public void printElements(String[] strArray) {
        for (int i = 0; i < strArray.length - 1; i++) {
            System.out.print(strArray[i] + "+ ");
        }
        System.out.println(strArray[strArray.length - 1]);
    }

    public static void main(String[] args) {
        Array05 array05 = new Array05();
        String[] scores = {"A", "B", "C", "D", "F"};
        array05.printElements(scores);
    }
}
