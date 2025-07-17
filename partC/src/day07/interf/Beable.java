package day07.interf;

// 기능에 대한 정의
public interface Beable {

  // abstract String beable(); // 인터페이스에서 abstarct 키워드 생략
  String beable();
}

// 인터페이스는 모두 public : 키워드 생략 가능
interface Cookable {
  void cook(String material); // 요리하다.
}

interface Runnable extends Beable {
  String run(int speed); // 달리다
}

interface Thinkable {
  void think(String what);

  int calculate(int a, int b);
}