package test;

import java.util.Arrays;

public class SortTest {

  public static void main(String[] args) {

    int[] nums = { 32, 14, 31, 39, 41, 17 };

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        int temp;
        if (nums[j] > nums[j + 1]) {
          temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
      System.out.println(String.format("i=%d  %s", i, Arrays.toString(nums)));
    }

  }

  void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        int temp;
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      System.out.println(String.format("i=%d  %s", i, Arrays.toString(arr)));
    }

  }

}
