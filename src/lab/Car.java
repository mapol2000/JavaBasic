package lab;

/*- 차량은 차대번호, 제조사, 모델, 등급, 연식, 변속기(자동/수동), 도색, 주행거리, 가격 정보등을 갖는다

        - 차량은 또한 차종에 따라 승용차(소형, 중형, 대형), 화물차(트레일러, 윙바디등), 승합차(6인승,9인승,12인승), 스포츠카(300마력,400마력,500마력)으로 분류할 수 있다*/

public class Car {

    String vin;
    String maker;
    String model;
    String grade;
    int year;
    char transmission;
    String colour;
    String distance;
    Double price;
    String category;

}
