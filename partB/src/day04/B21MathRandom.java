package day04;

public class B21MathRandom {
  public static void main(String[] args) {
    int[] result = new int[6];
    int[] balls = new int[45];

    for (int i = 0; i < 45; i++)
      balls[i] = i + 1; // 명령문이 하나만 반복할 떄는 { } 생량

    // 간단 테스트
    for (int i = 0; i < 6; i++) {
      // System.out.println(Math.random()); // 0보다 크고 1보다 작은 실수
      double rndNum = Math.random();
      int range = 45 - i; // 0보다 크고 (45-i)보다 작은 랜덤값으로 범위 줄여나감
      System.out.print((rndNum * range) + "\t");
      System.out.println((int) (rndNum * range)); // Math.round() 반올림
      int ballIndex = (int) (rndNum * range);
      // result[i] = balls[ballIndex];
      // ballIndex 위치의 값은 빼고 복사하여 새로운 배열로 계속하기

    }

    // 배열 복사 메소드 : System 클래스

  }

  // System 클래스 메소드의 복사를 활용해 보세요.
  private static int[] mergeOfArray(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length]; // arr1 크기 + arr2의 크기

    System.arraycopy(arr1, 0, result, 0, arr1.length);
    System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

    return result; // 배열의 참조값을 전달하기
  }

}
