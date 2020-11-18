package lab;

/*26. 사용자가 연봉과 결혼 여부를 입력하면 다음의 세금율에 의해 납부해야
        할 세금을 계산하는 프로그램을 작성하세요 (Tax)

        가. 미혼인 경우 : 연봉 3000미만 - 10%,  연봉 3000이상 - 25%

        나. 결혼한 경우 : 연봉 6000미만 - 15%,  연봉 6000이상 - 35%*/

import java.util.Scanner;

public class Q26_Salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연봉을 입력하세요: ");
        int salary = (int)sc.nextDouble();
        System.out.print("결혼 유무: \"true\" or \"false\": ");
        boolean married = sc.nextBoolean();

        tax(salary,married);

    }

    public static double tax(int salary, boolean married) {
        if (married == true) {
            if (salary >= 6000) {
                salary = (int) (salary * 0.35);
            } else {
                salary = (int)(salary * 0.15);
            }
        } else if (married == false) {
            if (salary >= 3000) {
                salary = (int) (salary * 0.25);
            } else {
                salary = (int)(salary * 0.10);
            }
        }
        System.out.printf("내야 할 세금은 %d입니다", salary);
        return salary;
    }

}
