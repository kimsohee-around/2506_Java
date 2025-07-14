package test;

public class CalculatorTest {

  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    c1.add(34);
    System.out.println(c1.getResult());
    c1.add(34);
    System.out.println(c1.getResult());

  }
}

class Calculator {
  private int result;

  public Calculator() { // 기본 생성자
    result = 0;
  }

  public void add(int num) { // 반환형이 없는 인스턴스 메소드
    result += num;
  }

  public int getResult() { // 결과를 반환하는 인스턴스 메소드
    return result;
  }
}