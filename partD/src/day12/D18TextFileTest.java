package day12;

import java.io.FileReader;
import java.util.Scanner;

// 문자 단위(기반)의 입출력
public class D18TextFileTest {

  public static void main(String[] args) {
    readText();
  }

  // 2. 텍스트 파일 라인(줄) 단위로 읽어오기
  public static void readByLine() {
    // int ch;
    String line = null;
    int count = 0;
    FileReader fr = null;
    Scanner sc = null;
    StringBuilder sb = new StringBuilder();
    try {
      fr = new FileReader("C:\\Class241129\\연습.txt"); // C:\\Class241129\\연습.txt
      sc = new Scanner(fr); // 파일을 읽기 위해서 Reader 타입 클래스를 인자로 합니다.
      // hasXXX 은 iterator(반복자) 를 통해서 다음 내용이 있을 때 동작하는 방식
      // Iterator 인터페이스 구현 클래스 : hasNext() 메소드, nextXXX() 메소드가 있습니다.
      while (sc.hasNext()) { // 읽어올 다음 줄이 있느냐? 참이면
        line = sc.nextLine(); // 다음 줄 읽어오기
        System.out.println(line);
        count++; // 윈도우OS 는 엔터가 2개의 문자 CRLF
      }
      // System.out.println(sb.toString());
      System.out.println("읽은 라인 개수 : " + count);
    } catch (Exception e) {
      System.out.println("예외 : " + e.getMessage());
    } finally {
      try {
        fr.close();
        sc.close();
      } catch (Exception e) {
      }
    }
  }

  // 1. 텍스트 파일을 한 글자씩 읽어오기
  public static void readText() {
    int ch;
    int count = 0;
    FileReader fr = null;
    StringBuilder sb = new StringBuilder();
    try {
      fr = new FileReader("C:\\Class250615\\java_workspace\\partD\\test.txt");
      while ((ch = fr.read()) != -1) {
        System.out.println((char) ch);
        sb.append((char) ch); // 읽어온 값은 정수 타입. 문자 char 로 캐스팅
        // 읽은 문자 한개씩을 문자열로 만들기 위해 추가
        count++; // 윈도우OS 는 엔터가 2개의 문자 CRLF
      }
      System.out.println(sb.toString());
      System.out.println("읽은 문자 개수 : " + count);
    } catch (Exception e) {
      System.out.println("예외 : " + e.getMessage());
    } finally {
      try {
        fr.close();
      } catch (Exception e) {
      }
    }
  }

}
