package mapol2000;


import java.util.Scanner;

/**
 * 파일명: SungJukV8Main
 * 작성일: 2020.11.27
 *
 * 프로그램설명: 성적처리프로그램 v9
 * 성적처리 프로그램을 체계적으로 만들려고 함
 * 즉 sungjuk.dat라는 파일을 생성해서
 * 입력한 성적데이터를 여기에 저장해둠
 *
 *
 */
public class SungJukV9Main {

    public static void main(String[] args) {

        SungJukV9Service sjsrv = new SungJukV9Service(); // 객체 생성

        Scanner sc = new Scanner(System.in); // 스캐너 생성
        String menu = "";

        while (true) { // 메뉴 띄우고 작업번호 입력을 반복
            sjsrv.displyMenu();
            menu = sc.nextLine();

            switch (menu) {
                case "1": sjsrv.newSungJuk();break;
                case "2": sjsrv.readSungJuk();break;
                case "3": sjsrv.readOneSungJuk();break;
                case "4": sjsrv.modifySungJuk();break;
                case "5": sjsrv.removeSungJuk();break;
                case "0": System.exit(0);break;
                default:
                    System.out.println("잘못 입력하셨습니다");
            }

        }

    }

}
