package lab;

public class Student {

    int stdNo;
    String name;
    String address;
    String birth;
    String dept;
    String prof;

    // 기본생성자
    public Student() {
        stdNo = 201250006;
        name = "송혜교";
        address = "서울 영등포구";
        birth = "1988.9.17";
        dept = "컴퓨터";
        prof = "301";
    }

    public Student(int stdNo, String name, String address, String birth, String dept, String prof) {
        this.stdNo = stdNo;
        this.name = name;
        this.address = address;
        this.birth = birth;
        this.dept = dept;
        this.prof = prof;
    }

}
