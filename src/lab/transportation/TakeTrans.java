package lab.transportation;

public class TakeTrans {

    public static void main(String[] args) {

        Student student1 = new Student("Peter", 10,10000);

        Bus bus260 = new Bus(260);
        Subway subway1 =new Subway("1");

        student1.takeBus(bus260);
        student1.showInfo();
        bus260.showInfo();

        student1.takeSubway(subway1);
        student1.showInfo();
        subway1.showInfo();

    }

}
