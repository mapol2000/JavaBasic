package mapol2000;

// 메서드 다중정의
// 객체지향 3대 중요개념 중 하나인 다형성에 해당
// 같은 이름의 메서드를 중복해서 정의하는 것을 의미
// 한 클래스에 같은 이름의 메서드가 2개 이상 존재할 수 있음
// 이때 메서드의 서명만 다르게 작성한다면 정의 가능
public class Overloading {

    public static void main(String[] args) {
        NonOverloading nol = new NonOverloading();
        System.out.println(nol.twoIntSum(1,3));
        System.out.println(nol.twoDoubleSum(1.0,3.0));
        System.out.println(nol.threeIntSum(1,3,5));

        ApplyOverloading aol = new ApplyOverloading();
        System.out.println(aol.add(1,3));
        System.out.println(aol.add(1,3,5));
        System.out.println(aol.add(1.0,3.0));


    }

}

class NonOverloading {
    // 간단한 덧셈 프로그램
    // 1. 정수2개를 더하는 프로그램
    public int twoIntSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
    // 2. 실수2개를 더하는 프로그램
    public double twoDoubleSum(double n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }
    // 3. 정수3개를 더하는 프로그램
    public int threeIntSum(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        return sum;
    }

    // 메서드 오버로딩이 구현되지 않은 경우
    // 생성한 메서드마다 이름을 제각각으로 정해야하므로
    // 개발자가 일일히 기억해서 사용해야 하는 불편 초래

}

class ApplyOverloading {
    // 간단한 덧셈 프로그램
    // 1. 정수2개를 더하는 프로그램
    public int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
    // 2. 실수2개를 더하는 프로그램
    public double add(double n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }
    // 3. 정수3개를 더하는 프로그램
    public int add(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        return sum;
    }

    // 메서드 다중정의(오버로딩)를 적용하면
    // 메서드의 이름을 하나로 통일해서 작성 가능
    // 개발자가 외울 메서드의 이름이 줄어듦
    // 단, 메서드를 어떻게 호출할지만 알고있으면 됨

}