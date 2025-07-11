package day03;

// 우리(개발자)가 정의하는 클래스에 인스턴스 메소드 추가해보기
public class B12ScoreInstanceMethod {

  public static void main(String[] args) {

    Score momo = new Score();
    momo.name = "김모모";
    momo.kor = 99;
    momo.eng = 123;
    momo.math = 88;
    System.out.println("객체의 값 유효성 검사하기 -------");
    System.out.println("name : " + momo.isNameValid());
    System.out.println("kor : " + momo.isKorValid());
    System.out.println("eng : " + momo.isEngValid());
    System.out.println("math : " + momo.isMathValid());
    System.out.println("모든 점수 : " + momo.isScoresValid());
    if (momo.isScoresValid()) {
      // 점수 합계
      System.out.println();
    } else {
      // 이스케이프 문자 \\ , \"
      System.out.println("점수값 오류 (\"모든 과목의 점수는 \\0~100\\ 로 합니다.\")");
    }
  }
}

class Score {
  String name;
  int kor;
  int eng;
  int math;

  // 점수의 합계 구하기 - int 리턴
  int sum() {
    return kor + eng + math;
  }

  // 평균 : 90 점 이상 'A', 80점 이상 'B', 70 점 이상 'C', 그 외에는 'F' - char 리턴
  // ㄴ 정수 / 정수 = 정수(몫)
  char getGrade() {

    int avg = sum() / 3;
    char grade;
    switch (avg / 10) {
      case 10, 9:
        grade = 'A';
        break;
      case 8:
        grade = 'B';
        break;
      case 7:
        grade = 'C';
        break;
      case 6, 5, 4, 3, 2, 1, 0:
        grade = 'F';
        break;
      default:
        grade = 'E'; // 오류를 뜻하는 약속.
        break;
    }
    return grade;
  }

  // 이름 패턴 검사 - 참 또는 거짓 리턴메소드 isXXXXX
  boolean isNameValid() {
    return name.matches("^[가-힣]{2,5}$");
  }

  boolean isScoresValid() {
    return isKorValid() && isEngValid() && isMathValid();
  }

  // kor : 0~100 isKorValid
  boolean isKorValid() {
    return kor >= 0 && kor <= 100;
  }

  // eng : 0~100
  boolean isEngValid() {
    return eng >= 0 && eng <= 100;
  }

  // math : 0~ 100
  boolean isMathValid() {
    return math >= 0 && math <= 100;
  }

  @Override
  public String toString() { // overriding (재정의)

    // return name + " : " + kor + ", " + eng + ", " + math;
    return String.format("%s : %d, %d, %d", name, kor, eng, math);
    // "출력 포맷을 데이터형식 기호로 작성", 순서대로 값을 나열
  }
}
