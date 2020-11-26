package semiProject;

/**
 * EmployeeVO
 */
public class EmployeeVO {

    private String empNo;
    private String lName;
    private String fName;
    private String email;
    private String phone;
    private String hDate;
    private String jobID;
    private String sal;
    private String comm;
    private String mgrId;
    private String deptID;

    public EmployeeVO() { }

    public EmployeeVO(String empNo, String lName, String fName, String email, String phone, String hDate, String jobID, String sal, String comm, String mgrId, String deptID) {
        this.empNo = empNo;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.hDate = hDate;
        this.jobID = jobID;
        this.sal = sal;
        this.comm = comm;
        this.mgrId = mgrId;
        this.deptID = deptID;
    }

    public String getEmpNo() {
        return empNo;
    }
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
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
    public String getSal() {
        return sal;
    }
    public void setSal(String sal) {
        this.sal = sal;
    }
    public String getComm() {
        return comm;
    }
    public void setComm(String comm) {
        this.comm = comm;
    }
    public String getMgrId() {
        return mgrId;
    }
    public void setMgrId(String mgrId) {
        this.mgrId = mgrId;
    }
    public String getDeptID() {
        return deptID;
    }
    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }
}
