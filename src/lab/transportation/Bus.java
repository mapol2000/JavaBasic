package lab.transportation;

public class Bus {

    private int busNumber;
    private int passengerCount;
    private int money;

    public void take(int money) {
        this.money += money;
        passengerCount += 1;
    }

    public void showInfo() {
        System.out.println(getBusNumber()+"번 버스의 승객은 "+getPassengerCount()+"명이고 수입은 "+getMoney()+"입니다");
    }

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
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
