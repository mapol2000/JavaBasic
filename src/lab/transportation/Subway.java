package lab.transportation;

public class Subway {

    private String lineNumber;
    private int passengerCount;
    private int money;

    public void take(int money) {
        this.money += money;
        passengerCount += 1;
    }

    public void showInfo() {
        System.out.println(getLineNumber()+"호선의 승객은 "+getPassengerCount()+"명이고 수입은 "+getMoney()+"입니다");
    }

    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
