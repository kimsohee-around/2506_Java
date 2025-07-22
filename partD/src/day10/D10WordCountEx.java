package day10;

public class D10WordCountEx {
  public static void main(String[] args) {
    String lyrics = "Longing for you\r\n" +
        "Waiting for you\r\n" +
        "Hold me\r\n" +
        "Hold me in your eyes\r\n" +
        "너라는 걸\r\n" +
        "너뿐인 걸 모르겠니\r\n" +
        "I will be your love\r\n" +
        "\r\n" +
        "오 빨간 운동화 짧은 청바지\r\n" +
        "참 어째도 해결이 안 될 것 같은 곱슬머리\r\n" +
        "하지만 왜일까 자꾸 끌리는 내 마음이\r\n" +
        "어쩌면 사랑 아닐까\r\n" +
        "\r\n" +
        "Longing for you\r\n" +
        "Waiting for you\r\n" +
        "Hold me\r\n" +
        "Hold me in your eyes\r\n" +
        "너라는 걸\r\n" +
        "너뿐인 걸 모르겠니\r\n" +
        "I will be your love";

    // \s 정규식 기호는 공백, 탭, 줄바꿈. 문자열을 단어로 분리하는 기준
    String[] words = lyrics.split("\\s+");
    System.out.println("단어의 갯수 : " + words.length);

    // 앞의 getOrDefault 메소드를 사용해서 단어가 나온 횟수 Map으로 저장하기
    // 횟수의 합계 = words.length (검증)
    

  }
}
