package day05;

import java.util.Arrays;

public class B26ExceptionTest {
  public static void main(String[] args) {
    B26ExceptionTest test = new B26ExceptionTest();
    test.indexException();
  }

  public void indexException() {
    int[] nums = new int[5];
    nums[2] = 22;
    nums[5] = 55; // java.lang.ArrayIndexOutOfBoundsException
    System.out.println(Arrays.toString(nums));
  }

  public void nullPointer() {
    String message = null; // message 변수에 참조되는 것이 없습니다.

    System.out.println(message.toUpperCase());
    // java.lang.NullPointerException
  }

}
