package day05;

public class B27CheckedException {

  public static void main(String[] args) {
    Score s1 = new Score();
    s1.setScore(-9); // java.lang.IllegalArgumentException: score 값 오류!!
  }

}

class Score {
  private int score; // 0~100

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    if (score >= 0 && score <= 100) {
      this.score = score;
    } else {
      // 잘못된 값 -> 예외 발생 처리
      throw new IllegalArgumentException("score 값 오류!!");
    }
  }

}