package lab;
/*
29. 사용자로부터 소문자를 입력 받아 대문자로 출력하는 프로그램을 작성해보세요.
        단, 소문자 이외의 숫자나 문자를 입력 받으면
        “잘못 입력하셨습니다!!”라는 메시지를 출력하도록 합니다. (UpperCase)

        문자 입력 시 System.in.read() 사용
        A의 유니코드 값 : 65,      a의 유니코드 값 : 97
        소문자 a는 97, 소문자 z = 122
        */

import java.io.IOException;

public class Q29_Low2upr {

    public static void main(String[] args) throws IOException {

        System.out.println("영어 소문자를 입력하시면 영어 대문자로 출력합니다");
        System.out.print("소문자 영어를 입력하십시오: ");
        int lowercase = System.in.read();

        capitalize(lowercase);

    }

    public static void capitalize(int low) {
        if (low < 97 || low > 122) {
            System.out.println("잘못 입력하셨습니다!!");
        } else {
            int num = low - 32;
            System.out.printf("소문자 %c의 대문자는 %c입니다",low, num);
        }

    }

}
