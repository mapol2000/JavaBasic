package lab;

public class Book {
    // 멤버변수 선언
    String name;
    String writer;
    String pubName;
    String pubDate;
    int price;
    double discnt;
    String bkImg;  // java.png

    // 기본 생성자 (alt+Insert)
    public Book() {
    }


    // 매개변수 생성자
    public Book(String name, String writer, String pubName, String pubDate, int price, double discnt, String bkImg) {
        this.name = name;
        this.writer = writer;
        this.pubName = pubName;
        this.pubDate = pubDate;
        this.price = price;
        this.discnt = discnt;
        this.bkImg = bkImg;
    }
}
