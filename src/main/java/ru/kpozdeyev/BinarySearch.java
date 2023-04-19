package ru.kpozdeyev;

public class BinarySearch {

  public int search(int[] nums, int target) {
    int left = -1;
    int right = nums.length;
    while (true) {
      int cursor = (left + right) / 2;
      if (nums[cursor] == target) {
        return cursor;
      } else if (nums[cursor] > target) {
        right = cursor;
      } else {
        left = cursor;
      }
      if (left + 1 == right) {
        return -1;
      }
    }
  }

  public static void main(String[] args) {
    var search = new BinarySearch();
    int result = search.search(new int[] {-1,0,3,5,9,12}, 9);
    System.out.println(result);
  }

}
