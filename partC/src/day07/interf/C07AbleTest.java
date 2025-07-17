package day07.interf;

// 다형성
//   ㄴ 인터페이스 구현 클래스는 해당 인터페이스 타입으로 대입
//   ㄴ 메소드의 인자 또는 리턴값의 타입이 됩니다.
public class C07AbleTest {

  public static void main(String[] args) {
    today(new Human());
    // tomorrow(new AI()); // 오류
    someday(new AI("GPT"));
    tomorrow(new Dog());
    // 인터페이스 구현하는 익명 클래스 정의
    Cookable robot = new Cookable() {
      @Override
      public void cook(String material) {
        System.out.println(material + " 인스턴트 요리를 합니다.");
      }
    };
    today(robot);

  }

  private static void today(Cookable cookable) {
    cookable.cook("라면");
  }

  private static void tomorrow(Runnable runnable) {
    String temp = runnable.run(100);
    System.out.println(temp);
  }

  private static void someday(Thinkable thinkable) {
    thinkable.think("자바");
  }

}
