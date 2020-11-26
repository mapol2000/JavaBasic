package semiProject;

import java.util.Scanner;

public class EmployeeV1Main {

    public static void main(String[] args) {

        EmployeeV1Service employeeV1Service = new EmployeeV1Service();

        Scanner sc = new Scanner(System.in);



        while (true) {
            employeeV1Service.displyMenu();
            String menu = sc.nextLine();

            switch (menu) {
                case "1": employeeV1Service.newEmpInfo(); break;
                case "2": employeeV1Service.readEmpInfo(); break;
                case "3": employeeV1Service.readOneEmpInfo(); break;
                case "4": employeeV1Service.modifyEmpInfo(); break;
                case "5": employeeV1Service.removeEmpInfo(); break;
                case "0": System.exit(0); break;
            }
        }

    }

}
