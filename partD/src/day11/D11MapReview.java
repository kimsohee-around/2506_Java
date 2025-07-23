package day11;

import java.util.HashMap;
import java.util.Map;

//Map 복습 : 활요예시 일회성으로 데이터를 저장하고 전달하는 목적
//        클래스 정의를 대신할 수 있습니다.
public class D11MapReview {

  public static void main(String[] args) {

    // Map 에 저장할 데이터 : id,name,point
    Map<String, Object> map = new HashMap<>();
    map.put("id", 1000); // Integer value
    map.put("name", "김사나"); // String value
    map.put("point", 3.14); // Double value

    MapTest test = new MapTest();
    test.setMember(map);
    System.out.println("test : " + test);
    // 퀴즈 : test 객체에 저장된 member 를 가져와서. id, name, point 를 출력해보세요.(각각)
    // hint : Object 타입을 직접 출력해보고. casting 하여 출력도 해보세요.
    // 1. getter 로 Map타입 member 가져오기

    // 2. 1번 Map타입 member 에서 key 값 모두 가져오기

    // 3. 2번의 keySet 으로 반복문 (key-value 출력)

  }
}

// Map 타입 인자 or 리턴 메소드 예시
class MapTest {
  private Map<String, Object> member;

  public Map<String, Object> getMember() {
    return member;
  }

  public void setMember(Map<String, Object> member) {
    this.member = member;
  }

  @Override
  public String toString() {
    return member.toString();
  }
}
