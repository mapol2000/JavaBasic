package mapol2000;

/**
 * SungJukV8Service
 * 성적처리 추상클래스를 상속해서 만든 클래스
 */
public class SungJukV8Service extends SungJukV8GenericService {

    @Override
    public void newSungJuk() {
        super.newSungJuk();
    }

    @Override
    public void readSungJuk() {
        super.readSungJuk();
    }

    @Override
    public void readOneSungJuk() {
        super.readOneSungJuk();
    }

    @Override
    public void modifySungJuk() {
        super.modifySungJuk();
    }

    @Override
    public void removeSungJuk() {
        super.removeSungJuk();
    }

    /**
     * 성적 처리 프로그램의 메뉴 출력기능
     */
    public void displyMenu() {
        StringBuilder sb = new StringBuilder();
              sb.append("------------------\n")
                .append("성적 처리프로그램 v8\n")
                .append("------------------\n")
                .append("1. 성적 데이터 입력\n")
                .append("2. 성적 데이터 조회\n")
                .append("3. 성적 데이터 상세조회\n")
                .append("4. 성적 데이터 수정\n")
                .append("5. 성적 데이터 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("------------------\n")
                .append("원하시는 작업은?\n");
        System.out.println(sb);
    }

    public void computeSungJuk() {

    }

}
