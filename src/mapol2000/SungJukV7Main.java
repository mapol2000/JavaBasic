package mapol2000;


import java.util.Scanner;

/**
 * 파일명: SungJukV7Main
 * 작성일: 2020.11.23
 *
 * 프로그램설명: 성적처리프로그램 v7
 * 중간고사와 기말고사 성적처리 프로그램을 만들려고 함
 * SungJukV6Main을 토대로 중간고사와
 * 기말고사 성적 클래스를 인터페이스를 이용해서 작성하세요
 *
 * 부모클래스 SungJukV7
 * 인터페이스 ISungJukV7
 * 중간고사(MidSungJuk2): 국어, 영어, 수학
 * 기말고사(FinalSungJuk2): 국어, 영어, 수학, 미술art, 과학sci
 * 성적입력: readSungJuk
 * 성적처리: computeSungJuk
 * 결과출력: printSungJuk
 */
public class SungJukV7Main {

    public static void main(String[] args) {
        MidSungJuk2 mid = new MidSungJuk2();

        mid.readSungJuk();
        mid.computeSungJuk();
        mid.printSunJuk();
    }

}

class SungJukV7 extends SungJukV6Main {

}

interface ISungJukV6 {
    abstract void readSungJuk();
    abstract void computeSungJuk();
    abstract void printSunJuk();
}

class MidSungJuk2 extends SungJukV7 implements ISungJukV6 {

    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum;
    protected double mean;
    protected char grd;

    @Override
    public void readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        name = sc.nextLine();
        System.out.print("국어 점수를 입력하세요: ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        mat = sc.nextInt();
    }

    @Override
    public void computeSungJuk() {
        sum = kor + eng + mat;
        mean = (double)sum / 3;
        grd = (mean >= 90) ? '수':
                (mean >= 80) ? '우':
                        (mean >= 80) ? '미':
                                (mean >= 70) ? '양': '가';
    }

    @Override
    public void printSunJuk() {
        String fmt = "이름: %s\n국어: %d\n영어: %d\n수학: %d\n총점: %d\n평균: %.1f\n학점: %c";
        String result = String.format(fmt, name, kor, eng, mat, sum, mean, grd);

        System.out.println(result);
    }
}