package lab;

/*27. 다음 조건을 이용해서 현재 연도를 입력하면 윤년 여부를
        출력하는 프로그램을 작성하세요. (LeapYear)

        가. 현재 연도가 4로 나눠 떨어지지만, 100으로는 나눠 떨어지지 않음

        나. 현재 연도가 400으로 나눠 떨어짐*/

import java.util.Scanner;

public class Q27_LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("확인하시려는 년도를 입력해주세요: ");
        int year = sc.nextInt();

        leapYear(year);

    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("윤년입니다");
        } else if (year % 100 != 0) {
            System.out.println("윤년이 아닙니다");
        } else {
            System.out.println("윤년이 아닙니다");
        }
    }

}
