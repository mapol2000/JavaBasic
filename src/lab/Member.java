package lab;

/*
- 회원은 일반 구매회원과 딜러 구매회원으로 나뉜다

        - 일반 구매회원은 회원가입시 이름, 아이디, 생년월일, 주민번호, 주소, 전화번호, 핸드폰번호를 입력받는다

        - 딜러 구매회원은 회원가입시 이름, 아이디, 생년월일, 주민번호, 주소, 전화번호, 핸드폰번호를 입력받고,
          추가로 매물목록, 신용등급, 소속회사 연락처등을 입력받는다
*/

public class Member {

    String rank;
    String name;
    String id;
    String dob;
    String personalNo;
    String address;
    String telNo;
    String mobileNo;
    String stockList;
    String credit;
    String companyNo;

    public Member(String rank, String name, String id, String dob, String personalNo, String address, String telNo, String mobileNo) {
        this.rank = rank;
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.personalNo = personalNo;
        this.address = address;
        this.telNo = telNo;
        this.mobileNo = mobileNo;
    }

    public Member(String rank, String name, String id, String dob, String personalNo, String address, String telNo, String mobileNo, String stockList, String credit, String companyNo) {
        this.rank = rank;
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.personalNo = personalNo;
        this.address = address;
        this.telNo = telNo;
        this.mobileNo = mobileNo;
        this.stockList = stockList;
        this.credit = credit;
        this.companyNo = companyNo;
    }
}
