package day09;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor // 모든 속성을 초기화하는 커스텀 생성자
public class Member {
  private int id;
  private String name;
  private double point;

}
