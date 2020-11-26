package semiProject;

import mapol2000.SungJukVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeV1Service extends EmployeeV1GenericService {

    // 멤버변수 선언
    // 입력받은 모든 인사데이터를 저장하는 동적배열 변수 선언
    List<EmployeeVO> employeeDatas = new ArrayList<>();




    @Override
    public void newEmpInfo() {

        String empNo;
        String lName;
        String fName;
        String email;
        String phone;
        String hDate;
        String jobID;
        String sal;
        String comm;
        String mgrId;
        String deptID;

        Scanner sc = new Scanner(System.in);

        System.out.print("사번을 입력해주세요");
        empNo = sc.nextLine();
        System.out.print("성을 입력해주세요");
        lName = sc.nextLine();
        System.out.print("이름을 입력해주세요");
        fName = sc.nextLine();
        System.out.print("이메일을 입력해주세요");
        email = sc.nextLine();
        System.out.print("전화번호를 입력해주세요");
        phone = sc.nextLine();
        System.out.print("입사일을 입력해주세요");
        hDate = sc.nextLine();
        System.out.print("직책을 입력해주세요");
        jobID = sc.nextLine();
        System.out.print("연봉을 입력해주세요");
        sal = sc.nextLine();
        System.out.print("커미션을 입력해주세요");
        comm = sc.nextLine();
        System.out.print("상사번호를 입력해주세요");
        mgrId = sc.nextLine();
        System.out.print("부서번호를 입력해주세요");
        deptID = sc.nextLine();

        // 입력받은 인사 데이터를 동적배열에 저장
        EmployeeVO employee = new EmployeeVO(empNo, lName, fName, email, phone, hDate, jobID, sal, comm, mgrId, deptID);
        employeeDatas.add(employee);


    }

    @Override
    public void readEmpInfo() {
        String fmt = "사번:%s, 성:%s, 이메일:%s, 직책:%s, 상사번호:%s , 부서번호:%s \n";

        for (EmployeeVO eply : employeeDatas) {
            System.out.printf(fmt, eply.getEmpNo(), eply.getlName(), eply.getEmail(), eply.getJobID(), eply.getMgrId(), eply.getDeptID());
        }
    }

    @Override
    public void readOneEmpInfo() {
        String fmt = "사번:%s, 성:%s, 이름:%s, 이메일:%s, 전화번호:%s , 입사일:%s , 직책:%s , 연봉:%s , 커미션: %s , 상사번호:%s , 부서:%s , \n";

        // 상세조회할 직원사번 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사원의 사번은? ");

        String empNo = sc.nextLine();

        // 입력받은 사번으로 데이터 검색후 결과 출력
        for (EmployeeVO ep : employeeDatas) {
            if (ep.getEmpNo().equals(empNo)) {
                System.out.printf(fmt, ep.getEmpNo(), ep.getlName(), ep.getfName(), ep.getEmail(), ep.getPhone(), ep.gethDate(), ep.getJobID(), ep.getSal(), ep.getComm(), ep.getMgrId(), ep.getDeptID());
                break;
            }
        }

    }

    @Override
    public void modifyEmpInfo() {
        super.modifyEmpInfo();
    }

    @Override
    public void removeEmpInfo() {
        super.removeEmpInfo();
    }

    public void displyMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------\n")
                .append("인사 관리 프로그램 v1\n")
                .append("------------------\n")
                .append("1. 인사 데이터 입력\n")
                .append("2. 인사 데이터 조회\n")
                .append("3. 인사 데이터 상세조회\n")
                .append("4. 인사 데이터 수정\n")
                .append("5. 인사 데이터 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("------------------\n")
                .append("원하시는 작업은? ");
        System.out.print(sb);
    }

}
