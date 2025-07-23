package day11;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class D12ObjectConcept {

  public static void main(String[] args) {

    String test = "java";
    String test2 = "java";
    String test3 = new String("java"); // 새로운 객체

    System.out.println("동일성 확인 ------  ");
    System.out.println("test == test3 : " + (test == test3)); // fasle
    System.out.println("test == test2 : " + (test == test2)); // true : 문자열은 불변 객체

    System.out.println("동등성 확인 ------- ");
    System.out.println(test.equals(test3)); // 동등성
    System.out.println(test.equals(test2));
    System.out.println(test2.equals(test2));

  }
}

@EqualsAndHashCode // 동등성을 구현 재정의 코드 생성
@ToString
@Getter
@Setter // final 아닌 것만 setter 만들어집니다.
@RequiredArgsConstructor // final 키워드 속성을 초기화 하는 인자를 갖습니다.
@AllArgsConstructor // 모든 속성을 초기화하는 인자를 갖습니다.
class People {
  // final : 값을 변경 못함. 생성자에서 초기화 필수!!
  private final int id;
  private final String name;
  private double etc;

}
