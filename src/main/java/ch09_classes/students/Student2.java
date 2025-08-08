package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;
    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    public Student2(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
    }

    public Student2(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }

    public Student2(int studentCode, String name) {
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(int studentCode, String name, Double score) {
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    void showInfo() {
        System.out.println();
        System.out.println(name + "  학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
    }

    // 자동완성으로 알아서 생성자 만드시고,
    // 거기에 sout 문구 전부 다 집어넣으시오
}
