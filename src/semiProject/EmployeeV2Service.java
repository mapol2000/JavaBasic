package semiProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * EmployeeV2Service
 */
public class EmployeeV2Service extends EmployeeV1Service {

    // 멤버변수 선언
    private String fpath = "c:/Java/employee.dat";
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    // 입력받은 모든 인사데이터를 저장하는 동적배열 변수 선언
    List<EmployeeVO> empdata = new ArrayList<>();

    public EmployeeV2Service() {

        try {
            loadEmpInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

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
        super.newEmpInfo();
        try {
            writeEmpInfo(emp);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    /**
     * writeEmpInfo
     * 입력받은 인사 정보를 employee.dat에 저장
     */
    protected void writeEmpInfo(EmployeeVO e) throws IOException {

        String fmt = "%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s";
        String data = String.format(fmt, e.getEmpNo(), e.getlName(), e.getfName(), e.getEmail(), e.getPhone(), e.gethDate(), e.getJobID(), e.getSal(), e.getComm(), e.getMgrId(), e.getDeptID());

        fw = new FileWriter(fpath, true);
        bw = new BufferedWriter(fw);

        bw.newLine();
        bw.write(data);

        bw.close();
        fw.close();

    }

    /**
     * loadEmpInfo
     * 파일에 저장된 성적데이터를
     * List타입의 empData 저장
     */
    protected void loadEmpInfo() throws IOException {

        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while (br.ready()) {
            String[] splitString = br.readLine().split(",");
            emp = new EmployeeVO(Integer.parseInt(splitString[0]), splitString[1], splitString[2], splitString[3], splitString[4], splitString[5], splitString[6], Integer.parseInt(splitString[7]), Double.parseDouble(splitString[8]), Integer.parseInt(splitString[9]), Integer.parseInt(splitString[10]));

            empdata.add(emp);
        }

        br.close();
        fr.close();

    }

}
