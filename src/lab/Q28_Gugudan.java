package lab;

/*28. 사용자로부터 숫자(1 - 9)를 하나 입력 받아,
구구단을 출력하는 프로그램을 작성해보세요.
단, 1 - 9 이외의 숫자나 문자를 입력 받으면
“잘못 입력하셨습니다!!”라는 메시지를 출력하도록 합니다. (GuGuDan)*/

import java.util.Scanner;

public class Q28_Gugudan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단을 원하십니까?: ");
        int dan = sc.nextInt();

        gugudan(dan);

    }

    public static void gugudan(int dan) {
            for (int i = 1; i <= 9; i++) {
                if (dan <= 0 || dan > 10) {
                    System.out.println("잘못 입력하셨습니다!!");
                    break;
                } else {
                    System.out.printf("%d X %d = %d\n", dan, i, (dan*i));

                }
            }
    }
}
