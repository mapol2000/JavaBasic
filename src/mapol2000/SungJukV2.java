package mapol2000;

import java.util.Scanner;

/**
 * 파일명: SungJukV2
 * 작성일: 2020.11.17
 *
 * 프로그램설명: 성적처리프로그램 v1
 * 이름, 국어, 영어, 수학 점수를 키보드로 입력받아
 * 총점, 평균, 학점을 계산하고 결과 출력
 *
 * 단, 평균은 소수점 첫째 자리까지 출력하고
 * 학점 기준은 '수우미양가'로 하되
 * switch문으로 학점을 계산하도록 함
 * 만점은 100점, 100-90, 89-80,
 * 79-70, 69-60, 59-0
 * name, kor, eng, mat, sum, mean, grd
 * 삼항연산자: (조건식) ? 참일때 결과값:거짓일때 결과값
 */
public class SungJukV2 {
    public static void main(String[] args) {
        // 변수선언
        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';

        // 처리
        //성적 데이터를 키보드로 입력받기 위해
        //Scanner 클래스 초기화
        Scanner sc = new Scanner(System.in);
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
        //학점계산은 switch문으로 처리
        switch ((int)(mean/10)) {
            case 10:
            case 9: grd = '수';break;
            case 8: grd = '우';break;
            case 7: grd = '미';break;
            case 6: grd = '양';break;
            default: grd = '가';
        }

        //출력
        System.out.printf("%s 학생의 총점은 %d점, 평균은 약 %.1f점이며 학점은 %c입니다 ",name, sum, mean, grd);

    }
}
