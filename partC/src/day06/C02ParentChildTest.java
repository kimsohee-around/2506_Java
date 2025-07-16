package day06;

public class C02ParentChildTest {
  public static void main(String[] args) {
    YourParent yp = new YourParent();

  }
}

class YourChild extends YourParent {

  // 부모가 정의한 setMessage() 재정의 가능함.
  // ✅주의 : 부모가 public -> 자식도 반드시 public
  @Override
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}

class YourParent {
  private String message;
  private int num;
  protected String name; // protected : 자식에게만 물려주는 요소

  YourParent() {
    this.message = "unknown";
  }

  // Object 자바클래스를 상속. toString() 재정의. 참조값이 아닌 속성값들 출력
  @Override
  public String toString() {
    return String.format("%s %s (%d)", name, message, num);
  }

  // getter and setter : 주의)) class 가 default 일때 메소드 public 의미 없음. default 로 동작
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
