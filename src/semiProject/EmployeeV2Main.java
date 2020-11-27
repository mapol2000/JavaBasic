package semiProject;

import java.util.Scanner;

/**
 * EmployeeV2Main
 * 인사정보 관리 프로그램 진입점
 */
public class EmployeeV2Main {

    public static void main(String[] args) {

        EmployeeV2Service empsrv = new EmployeeV2Service();

        Scanner sc = new Scanner(System.in);



        while (true) {
            empsrv.displyMenu();
            String menu = sc.nextLine();

            switch (menu) {
                case "1": empsrv.newEmpInfo(); break;
                case "2": empsrv.readEmpInfo(); break;
                case "3": empsrv.readOneEmpInfo(); break;
                case "4": empsrv.modifyEmpInfo(); break;
                case "5": empsrv.removeEmpInfo(); break;
                case "0": System.exit(0); break;
                default: System.out.println("잘못 입력!!");
            }
        }

    }

}
