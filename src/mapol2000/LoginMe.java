package mapol2000;

import java.util.Scanner;

/**
 * 로그인 확인 프로그램
 * 0. 인증용 아이디와 비밀번호를 하나 생성해 둠
 * => abc123, 987xyz
 * 1. Scanner로 아이디, 비밀번호를 입력받음
 * 2a. 아이디와 비밀번호가 틀리면 "가입되지 않은 아이디!"
 * 2b. 아이디만 맞으면 "비밀번호가 틀렸음!"
 * 2c. 아이디와 비밀번호가 맞으면 "로그인 성공!"
 */
public class LoginMe {

    public static void main(String[] args) {

        String defaultID = "abc123";
        String defaultPW = "987xyz";

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("아이디를 입력하세요: ");
            String userID = scanner.nextLine();

            System.out.print("비밀번호를 입력하세요: ");
            String userPW = scanner.nextLine();

            if (userID.equals(defaultID) && userPW.equals(defaultPW)) {
                System.out.println("로그인 성공");
                break;
            } else if (userID.equals(defaultID) && !userPW.equals(defaultPW)) {
                System.out.println("비밀번호가 틀렸음");
            } else if (!userID.equals(defaultID) && !userPW.equals(defaultPW)) {
                System.out.println("가입되지 않은 아이디!");
            } else {
                System.out.println("로그인 오류");
            }
        }






    }

}
