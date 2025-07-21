package day09;

import java.util.List;

// List 를 불변 객체로 만들어 보기
//   of : static 메소드
public class D04MemberList {
  public static void main(String[] args) {
    List<String> names = List.of("apple", "kiwi", "mango", "banana");
    System.out.println(names);

    // names.add("melon"); // 불변 객체로 만들어져서 값을 추가,삭제 못함.=> 오류
    // names.set(2, "망고"); // 오류
    System.out.println(names);

  }

}
