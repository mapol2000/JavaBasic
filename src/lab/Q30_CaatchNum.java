package lab;

/*30. 다음 조건에 따라 숫자 맞추기 프로그램을 작성해보세요. (CatchNumber)

        가. 사용자로부터 1 - 99사이의 숫자를 세 개를 입력 받으세요 (num1)

        나. 변수에 임의의 숫자 3자리를 초기화합니다 (num2)

        다.  num1이 num2보다 크면 “추측한 숫자가 큽니다”라고 출력하세요

        라.  num1이 num2보다 작으면 “추측한 숫자가 작습니다”라고 출력하세요

        마.  num1과 num2가 같으면 “빙고! 숫자를 맞췄습니다”라고 출력하고 종료*/

import java.util.Scanner;

public class Q30_CaatchNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 99까지의 숫자를 맞춰보세요");
        System.out.print("1-99사이의 숫자를 입력하세요: ");

        int num1 = sc.nextInt();

        guessNumber(num1);

    } // main

    public static void guessNumber(int num) {
        int num2 = (int)(Math.random()*99) + 1;
        System.out.printf("제가 생각한 숫자는 %d입니다\n", num2);

        if (num > num2) {
            System.out.println("추측한 숫자가 큽니다");
        } else if (num < num2) {
            System.out.println("추측한 숫자가 작습니다");
        } else {
            System.out.println("빙고! 숫자를 맞췄습니다");
        }
    }

} // class
