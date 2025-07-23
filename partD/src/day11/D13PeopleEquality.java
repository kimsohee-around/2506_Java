package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D13PeopleEquality {
  public static void main(String[] args) {
    List<People> list = new ArrayList<>();
    People p1 = new People(1111, "김모모");
    People p2 = new People(1112, "최사나");
    People p3 = new People(1113, "이하니");
    People p4 = new People(1114, "김땡땡");
    list.add(p1);
    list.add(p4);
    list.add(p3);
    list.add(p2);
    list.add(p4);

    // 동일성 검사
    System.out.println("\n1. 동일성 검사");
    People temp = new People(1112, "최사나");
    System.out.println("p2 == temp : " + (p2 == temp));
    System.out.println("p2.hashCode() : " + p2.hashCode());
    System.out.println("temp.hashCode() : " + temp.hashCode());

    // 동등성 검사
    System.out.println("\n2. 동등성 검사");
    boolean result = p2.equals(temp);
    System.out.println("p2.equals(temp) : " + result);

    // List 는 indexOf 메소드 : 값을 전달하면 리스트에 저장된 index 리턴
    // p2 객체가 몇 번째 있는지 알고 싶다면.......
    System.out.println("\n3. p2와 동등성인 객체의 인덱스 찾기");
    int index = list.indexOf(temp);
    System.out.println("index temp: " + index);

    System.out.println("4. p4와 동등성인 객체의 last인덱스 찾기");
    temp = new People(1114, "김땡땡");
    index = list.lastIndexOf(temp);
    System.out.println("lastIndexOf p4 : " + index);

    Set<People> set = new HashSet<>(list);
    System.out.println("\n5. 동등성과 Set");
    System.out.println("set 크기 : " + set.size());
    System.out.println("set  : " + set);

    // Peopel 클래스 @EqualsAndHashCode 구현이 있느냐 없느냐 에 따라 동등성 검사 여부 결정
    // 테스트 하기 : @EqualsAndHashCode 있을 때 없을 때 비교해서 정리하세요.
    // ✅ @EqualsAndHashCode 구현이 있으면 동등성 검사를 할수 있다.
  }

}
