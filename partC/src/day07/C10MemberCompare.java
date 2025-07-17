package day07;

public class C10MemberCompare {

  public static void main(String[] args) {
    Member m1 = new Member("sana", 29);
    try {
      Member m2 = m1.clone();
      m2.print();   // clone 결과 확인
    } catch (CloneNotSupportedException e) {
      System.out.println("clone exception~!");
    }
  }

}

class Member implements Cloneable, Comparable<Member> {
  private String name;
  private int age;

  Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override // Cloneable 인터페이스 재정의
  protected Member clone() throws CloneNotSupportedException {

    return (Member) super.clone();
    // Object java.lang.Object.clone() throws CloneNotSupportedException
    // 메소드 원형 throws 뒤의 예외는 Checked 예외 -> try ~ catch -> 다른곳으로 위임
  }

  @Override // Comparable 인터페이스 재정의
  public int compareTo(Member o) {
    return 0;
  }

  void print() {
    System.out.println(String.format("%s (%d)", name, age));
  }

}
