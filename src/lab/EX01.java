package lab;

public class EX01 {

    public static void main(String[] args) {
        // 학생 클래스를 이용해서 객체 생성
        Student std = new Student();
        // 학과 클래스를 이용해서 객체 생성
        Department dept = new Department();
        // 과목 클래스를 이용해서 객체 생성
        Subject subj = new Subject();
        // 교수 클래스를 이용해서 객체 생성
        Professor prof = new Professor();


        // 각 객체에 대해 변수에 값 대입

        std.stdNo = 201350050;
        std.name = "김태희";
        std.address = "경기도 고양시";
        std.birth = "1985.3.22";
        std.dept = "컴퓨터";
        std.prof = "504";

        dept.dname = "컴퓨터공학";
        dept.phone = "123-4567-8901";
        dept.office = "E동 2층";
        dept.chief = "504";

        subj.no = "0205";
        subj.subjName = "프로그래밍";
        subj.subjDsc = "자바프로그래밍";
        subj.prof = "301";

        prof.no = "301";
        prof.name = "이순신";
        prof.mjfield = "프로그래밍";



        // 객체에 저장된 값 출력
        System.out.println("--------학생-----------");
        System.out.println(std.stdNo);
        System.out.println(std.name);
        System.out.println(std.address);
        System.out.println(std.birth);
        System.out.println(std.dept);
        System.out.println(std.prof);
        System.out.println("");

        System.out.println("---------학과---------");
        System.out.println(dept.dname);
        System.out.println(dept.phone);
        System.out.println(dept.office);
        System.out.println(dept.chief);
        System.out.println("");

        System.out.println("---------과목---------");
        System.out.println(subj.no);
        System.out.println(subj.subjName);
        System.out.println(subj.subjDsc);
        System.out.println(subj.prof);
        System.out.println("");

        System.out.println("---------교수---------");
        System.out.println(prof.no);
        System.out.println(prof.name);
        System.out.println(prof.mjfield);
        System.out.println("");


    }

}
