package mapol2000;


/**
 * 파일명: SungJukV8Main
 * 작성일: 2020.11.26
 *
 * 프로그램설명: 성적처리프로그램 v8
 * 성적처리 프로그램을 체계적으로 만들려고 함
 * 객체지향 기법을 토대로 CRUD 기능을 제공하도록 작성
 * 성적 데이터 입력/조회/수정/삭제 메뉴를 제공해서
 * 프로그램의 사용성을 높임
 *
 * SungJukService: readSungJuk, showSungJuk
 *                  showOneSungJuk, modifySungJuk
 *                 removeSungJuk, computeSungJuk
 *                 displayMenu
 *
 *                 SungJukV8Interface (인터페이스)
 *                 SungJukV8GenericService (추상클래스)
 *                 SungJukV8Service (클래스)
 *
 */
public class SungJukV8Main {

    public static void main(String[] args) {

        SungJukV8Service sjsrv = new SungJukV8Service();
        sjsrv.displyMenu();

    }

}
