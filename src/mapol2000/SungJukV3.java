package mapol2000;

import java.util.Scanner;


/**
 * 파일명: SungJukV3
 * 작성일: 2020.11.17
 *
 * 프로그램설명: 성적처리프로그램 v3
 * 학생 3명의 성적 데이터를 키보드로 입력받아
 * 총점, 평균, 학점을 계산하고 결과 출력
 *
 * 단, 평균은 소수점 첫째 자리까지 출력하고
 * 학점 기준은 '수우미양가'로 하되
 * switch문으로 학점을 계산하도록 함
 * 만점은 100점, 100-90, 89-80,
 * 79-70, 69-60, 59-0
 * name, kor, eng, mat, sum, mean, grd
 *
 * 단, 성적처리 결과 출력시 출력문을 하나만 사용
 */
public class SungJukV3 {
    public static void main(String[] args) {
        // 변수선언
        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;
        int sum = 0;
        double mean;
        char grd;
        String fmt = "이름: %s\n국어: %d\n영어: %d\n수학: %d\n총점: %d\n평균: %s\n학점: %c\n";

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println(i+"번째 학생 성적 입력중...");
            System.out.print("이름을 입력하세요: ");
            name = sc.nextLine();
            System.out.print("국어 점수를 입력하세요: ");
            kor = sc.nextInt();
            System.out.print("영어 점수를 입력하세요: ");
            eng = sc.nextInt();
            System.out.print("수학 점수를 입력하세요: ");
            mat = sc.nextInt();

            sum = kor + eng + mat;
            mean = sum / 3.0;

//            System.out.printf("총점: %d\n", sum);
//            System.out.printf("평균: %.2f\n", mean);

            switch ((int)(mean/10)) {
                case 10:
                case 9: grd = '수';break;
                case 8: grd = '우';break;
                case 7: grd = '미';break;
                case 6: grd = '양';break;
                default: grd = '가';
            }
            System.out.printf(fmt, name, kor, eng, mat, sum, String.valueOf(mean), grd);

        }
    }
}
