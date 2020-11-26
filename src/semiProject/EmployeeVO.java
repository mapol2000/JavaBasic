package semiProject;

/**
 * 인사 정보 프로그램
 * 사번empNo, 이름fName, 성lName, 이메일email
 * 전화번호phone, 입사일hDate, 직책jobID, 급여sal,
 * 수당comm, 상사mgrID, 부서deptID
 */
public class EmployeeVO {

    private int empNo;
    private String lName;
    private String fName;
    private String email;
    private String phone;
    private String hDate;
    private String jobID;
    private int sal;
    private double comm;
    private int mgrId;
    private int deptID;

    public EmployeeVO() { }

    public EmployeeVO(int empNo, String lName, String fName, String email, String phone, String hDate, String jobID, int sal, double comm, int mgrId, int deptID) {
        this.empNo = empNo;
        this.lName = lName;
        this.fName = fName;
        this.email = email;
        this.phone = phone;
        this.hDate = hDate;
        this.jobID = jobID;
        this.sal = sal;
        this.comm = comm;
        this.mgrId = mgrId;
        this.deptID = deptID;
    }

    public int getEmpNo() {
        return empNo;
    }
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String gethDate() {
        return hDate;
    }
    public void sethDate(String hDate) {
        this.hDate = hDate;
    }
    public String getJobID() {
        return jobID;
    }
    public void setJobID(String jobID) {
        this.jobID = jobID;
    }
    public int getSal() {
        return sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
    public double getComm() {
        return comm;
    }
    public void setComm(double comm) {
        this.comm = comm;
    }
    public int getMgrId() {
        return mgrId;
    }
    public void setMgrId(int mgrId) {
        this.mgrId = mgrId;
    }
    public int getDeptID() {
        return deptID;
    }
    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

}
