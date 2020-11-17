package mapol2000;

import java.util.Scanner;

/**
 * 파일명: SungJukV1
 * 작성일: 2020.11.17
 *
 * 프로그램설명: 성적처리프로그램 v1
 * 이름, 국어, 영어, 수학 점수를 설정하면
 * 총점, 평균, 학점을 계산하고 결과 출력
 * 단 학점 기준은 수우미양가로 함
 * 만점은 100점, 100-90, 89-80,
 * 79-70, 69-60, 59-0
 */
public class SungJukV1 {
    public static void main(String[] args) {
        String name;
        char grade;
        int kor = 0,eng = 0, mat = 0, sum;
        float mean;

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        name = scanner.nextLine();

        System.out.println("국어, 영어, 수학 점수를 입력하세요");
        kor = scanner.nextInt();
        eng = scanner.nextInt();
        mat = scanner.nextInt();

        sum = (kor + eng + mat);
        mean = sum / 3.0f;



        System.out.printf("%s 학생의 총점은 %d, 평균은 %.1f ",name, sum, mean);

        if (mean >= 90) {
            System.out.println("수");
        } else if (mean >= 80) {
            System.out.println("우");
        } else if (mean >= 70) {
            System.out.println("미");
        } else if (mean >= 60) {
            System.out.println("양");
        } else if (mean < 60) {
            System.out.println("가");
        } else {
            System.out.println("점수를 확인하세요");
        }

    }
}
