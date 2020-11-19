package lab;

public class EX01 {

    public static void main(String[] args) {
        // 학생 클래스를 이용해서 객체 생성
        Student student1 = new Student();
        // 학과 클래스를 이용해서 객체 생성
        Department department1 = new Department();
        // 과목 클래스를 이용해서 객체 생성
        Course course1 = new Course();
        // 교수 클래스를 이용해서 객체 생성
        Professor professor1 = new Professor();


        // 각 객체에 대해 변수에 값 대입

        student1.studentNo = 201350050;
        student1.name = "김태희";
        student1.address = "경기도 고양시";
        student1.dob = "1985.3.22";
        student1.department = "컴퓨터";
        student1.professor = 504;

        department1.name = "컴퓨터공학";
        department1.phoneNo = "123-4567-8901";
        department1.location = "E동 2층";
        department1.head = 504;

        course1.courseNo = 0205;
        course1.courseName = "프로그래밍";
        course1.obj = "자바 프로그래밍";
        course1.professor = 301;

        professor1.no = 301;
        professor1.name = "이순신";
        professor1.major = "프로그래밍";



        // 객체에 저장된 값 출력
        System.out.println("--------학생-----------");
        System.out.println(student1.studentNo);
        System.out.println(student1.name);
        System.out.println(student1.address);
        System.out.println(student1.dob);
        System.out.println(student1.department);
        System.out.println(student1.professor);
        System.out.println("");

        System.out.println("---------학과---------");
        System.out.println(department1.name);
        System.out.println(department1.phoneNo);
        System.out.println(department1.location);
        System.out.println(department1.head);
        System.out.println("");

        System.out.println("---------과목---------");
        System.out.println(course1.courseNo);
        System.out.println(course1.courseName);
        System.out.println(course1.obj);
        System.out.println(course1.professor);
        System.out.println("");

        System.out.println("---------교수---------");
        System.out.println(professor1.no);
        System.out.println(professor1.name);
        System.out.println(professor1.major);
        System.out.println("");


    }

}
