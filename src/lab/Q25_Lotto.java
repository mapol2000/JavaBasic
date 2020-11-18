package lab;
/*25. 다음 조건을 만족하는 복권 발행 프로그램을 작성하세요. (Lotto)

        가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)

        나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)

        다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급

        라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력*/


import java.util.Scanner;

public class Q25_Lotto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] yourKey = new int[3];
        int[] lottoKey = new int[3];
        int count = 0;

        // 번호 3개 입력
        System.out.println("1~30까지 숫자 3개를 선택합니다");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 번호를 입력해주세요: ", i+1);
            yourKey[i] = sc.nextInt();

            // 범위 검사
            if (yourKey[i] <= 0 || yourKey[i] >= 31) {
                System.out.println("1부터 30까지의 숫자를 선택해주세요.");
                i = i - 1;
            }
        }

        // 선택한 번호 3개 출력
        System.out.println("-------선택 번호-------");
        for (int i = 0; i < yourKey.length; i++) {
            System.out.printf("%3d\n", yourKey[i]);
        }
        System.out.println("----------------------");

        // 랜덤으로 당첨 번호 생성
        for (int i = 0; i < 3; i++) {
            lottoKey[i] = (int)(Math.random()*30) + 1;
        }
        // 당첨 번호 3개 출력
        System.out.println("---------당첨 번호-------");
        for (int i = 0; i < lottoKey.length; i++) {
            System.out.printf("%3d\n", lottoKey[i]);
        }
        System.out.println("-----------------------");

        // 선택 번호와 당첨 번호 확인
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (yourKey[i] == lottoKey[j]) {
                    count += 1;
                }
            }
        }

        if (count == lottoKey.length) {
            System.out.println("상금 1백만 지급");
        } else {
            System.out.println("아쉽지만, 다음 기회를!");
        }

    }

}
