package semiProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * EmployeeV1Service
 * 인사정보 처리 인터페이스를 구현한 클래스
 * 인사정보 처리에 대한 CRUD 코드를 작성해 둠
 */
public class EmployeeV1Service extends EmployeeV1GenericService {

    // 멤버변수 선언
    // 입력받은 모든 인사데이터를 저장하는 동적배열 변수 선언
    List<EmployeeVO> empdata = new ArrayList<>();
    EmployeeVO emp = null;

    /**
     * 인사정보 처리 UI 출력
     */
    public void displyMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------\n")
                .append("인사 관리 프로그램 v1\n")
                .append("------------------\n")
                .append("1. 인사 정보 입력\n")
                .append("2. 인사 정보 조회\n")
                .append("3. 인사 정보 상세조회\n")
                .append("4. 인사 정보 수정\n")
                .append("5. 인사 정보 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("------------------\n")
                .append("원하시는 작업은? ");
        System.out.print(sb);
    }


    @Override
    /**
     * 인사정보 입력받기
     */
    public void newEmpInfo() {

        emp = new EmployeeVO(0,"", "","","","","",0,0.0,0,0);

        Scanner sc = new Scanner(System.in);

        // 모든 인사정보는 일단 문자형으로 받되
        // 필요에 따라 적절한 형변환을 해서 변수에 저장
        System.out.print("사번을 입력해주세요");
        emp.setEmpNo(Integer.parseInt(sc.nextLine()));
        System.out.print("성을 입력해주세요");
        emp.setlName(sc.nextLine());
        System.out.print("이름을 입력해주세요");
        emp.setfName(sc.nextLine());
        System.out.print("이메일을 입력해주세요");
        emp.setEmail(sc.nextLine());
        System.out.print("전화번호를 입력해주세요");
        emp.setPhone(sc.nextLine());
        System.out.print("입사일을 입력해주세요");
        emp.sethDate(sc.nextLine());
        System.out.print("직책을 입력해주세요");
        emp.setJobID(sc.nextLine());
        System.out.print("연봉을 입력해주세요");
        emp.setSal(Integer.parseInt(sc.nextLine()));
        System.out.print("커미션을 입력해주세요");
        emp.setComm(Double.parseDouble(sc.nextLine()));
        System.out.print("상사번호를 입력해주세요");
        emp.setMgrId(Integer.parseInt(sc.nextLine()));
        System.out.print("부서번호를 입력해주세요");
        emp.setDeptID(Integer.parseInt(sc.nextLine()));

        // 입력받은 인사 데이터를 동적배열에 저장
        empdata.add(emp);


    }

    @Override
    /**
     * 기본 인사정보 출력
     */
    public void readEmpInfo() {
        // 데이터 출력시 간격유지를 위해
        // 형식지정자 앞에 숫자 사용

        String fmt = "%8s %8s %8s %8s %8s %8s\n";
        System.out.printf(fmt, "empNo", "lName", "email", "jobID", "mgrID", "deptID");

        Iterator<EmployeeVO> iter = empdata.iterator();

        while (iter.hasNext()) {
            EmployeeVO e = iter.next();
            System.out.printf(fmt, e.getEmpNo(),e.getlName(), e.getEmail(), e.getJobID(), e.getMgrId(), e.getDeptID());
        }
    }

    @Override
    /**
     * 상세 인사정보 출력
     * 사원번호를 입력받아 출력함
     */
    public void readOneEmpInfo() {

        String fmt = "%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s\n";

        // 상세조회할 직원사번 입력받음
        EmployeeVO emp = new EmployeeVO();

        Scanner sc = new Scanner(System.in);

        System.out.print("조회할 사원의 사번은? ");
        emp.setEmpNo(Integer.parseInt(sc.nextLine()));

        // 입력받은 사번으로 데이터 검색후 결과 출력
        System.out.printf(fmt, "empNo", "lName", "fName", "email", "phone", "hDate", "jobID", "sal", "comm", "mgrID", "deptID");
        for (EmployeeVO e : empdata) {
            // 입력한 사원번호와
            // 순회해서 읽어온 사원번호와 비교해서
            // 일치하면 이것을 출력하기 위해
            // 다른 변수에 저장함
            if (e.getEmpNo() == emp.getEmpNo()) {
                emp = e;
            }
        }

        System.out.printf(fmt, emp.getEmpNo(), emp.getlName(), emp.getfName(), emp.getEmail(), emp.getPhone(), emp.gethDate(), emp.getJobID(), emp.getSal(), emp.getComm(), emp.getMgrId(), emp.getDeptID());

    }

    @Override
    public void modifyEmpInfo() {
        super.modifyEmpInfo();
    }

    @Override
    public void removeEmpInfo() {
        super.removeEmpInfo();
    }

}
